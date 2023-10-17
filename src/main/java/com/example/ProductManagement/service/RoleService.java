package com.example.ProductManagement.service;
import com.example.CRM.Customer_relationship_management.model.Role;
import org.springframework.stereotype.Service;

@Service
public interface RoleService {

    Role getRoleByName(String name);

}
