package com.example.ProductManagement.service;

import com.example.CRM.Customer_relationship_management.model.User;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);

    User updateUser(User user);

}

