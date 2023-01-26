package com.axis.controller;


import com.axis.entity.SpringSecurity;
import com.axis.dto.Spring;
import com.axis.service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class SpringController {

    @Autowired
    private SpringService springService;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

    @PostMapping("/new")
    public String addNewUser(@RequestBody SpringSecurity springSecurity){
        return springService.addUser(springSecurity);
    }

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<Spring> getAllTheProducts() {
        return springService.getProducts();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public Spring getProductById(@PathVariable int id) {
        return springService.getProduct(id);
    }
}