package com.coforge.jay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.jay.domain.User;

public interface JPASecurityUserRepository extends JpaRepository<User, Integer> {

}
