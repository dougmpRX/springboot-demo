package com.dougmprx.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dougmprx.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
