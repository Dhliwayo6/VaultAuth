package com.vaultauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VaultAuthApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to VaultOps!");
        SpringApplication.run(VaultAuthApplication.class, args);
    }

}
