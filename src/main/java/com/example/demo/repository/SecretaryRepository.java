package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Secretary;

public interface SecretaryRepository extends JpaRepository<Secretary, Long> {
}
