package com.axis.service;

import com.axis.entity.SpringSecurity;
import com.axis.dto.Spring;
import com.axis.repository.SpringRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class SpringService {

    List<Spring> springList = null;

    @Autowired
    private SpringRepository springRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void loadProductsFromDB() {
        springList = IntStream.rangeClosed(1, 100)
                .mapToObj(i -> Spring.builder()
                        .productId(i)
                        .name("product " + i)
                        .qty(new Random().nextInt(10))
                        .price(new Random().nextInt(5000)).build()
                ).collect(Collectors.toList());
    }


    public List<Spring> getProducts() {
        return springList;
    }

    public Spring getProduct(int id) {
        return springList.stream()
                .filter(product -> product.getProductId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("product " + id + " not found"));
    }


    public String addUser(SpringSecurity userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        springRepository.save(userInfo);
        return "user added to system ";
    }
}