package com.example.springgbdemo.repository;

import com.example.springgbdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <User,Long> {
    List<User> findAllByAgeGreaterThan(int minAge);


}
