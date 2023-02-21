package com.dougmprx.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougmprx.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
