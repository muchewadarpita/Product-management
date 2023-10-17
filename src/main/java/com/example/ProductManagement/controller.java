package com.example.ProductManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class controller {
    @RestController
    @RequestMapping("/superadmin")
    @PreAuthorize("hasRole('SUPERADMIN')")
    public static class SuperAdminController {

        @Autowired
        private UserService userService;

        @GetMapping("/")
        public String superadmin() {
            return "Welcome Superadmin!";
        }

        @GetMapping("/users")
        public List<User> getUsers() {
            return userService.getAllUsers();
        }

        @PostMapping("/users")
        public User createUser(@RequestBody User user) {
            return userService.createUser(user);
        }
    }

    @RestController
    @RequestMapping("/customer")
    @PreAuthorize("hasRole('CUSTOMER')")
    public static class CustomerController {

        @GetMapping("/")
        public String customer() {
            return "Welcome Customer!";
        }

        @GetMapping("/order")
        public String order() {
            return "Your order has been received.";
        }
    }

    @RestController
    @RequestMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public static class AdminController {

        @Autowired
        private UserService userService;

        @GetMapping("/")
        public String admin() {
            return "Welcome Admin!";
        }

        @GetMapping("/users")
        public List<User> getUsers() {
            return userService.getAllUsers();
        }

        @PostMapping("/users")
        public User createUser(@RequestBody User user) {
            return userService.createUser(user);
        }
    }
}
