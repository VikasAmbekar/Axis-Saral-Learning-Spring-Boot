package com.axis.repository;

import com.axis.entity.SpringSecurity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringRepository extends JpaRepository<SpringSecurity, Integer> {
    Optional<SpringSecurity> findByName(String username);
}
