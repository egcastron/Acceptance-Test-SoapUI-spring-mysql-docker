package com.example.demo.dao;

import com.example.demo.model.Authenticate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<Authenticate, Integer> {

    Authenticate findByUsername(String username);
}
