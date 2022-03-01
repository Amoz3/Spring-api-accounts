package com.example.demo.accounts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AccountConfig {

    @Bean
    CommandLineRunner commandLineRunner(AccountRepository repository) {
        return args -> {
            Account wcOne = new Account("wcbot1@mail.com", "testpassword", 1234);
            Account wcTwo = new Account("wcbot2@mail.com", "testpassword", 1234);
            repository.saveAll(Arrays.asList(wcOne, wcTwo));
        };

    }
}
