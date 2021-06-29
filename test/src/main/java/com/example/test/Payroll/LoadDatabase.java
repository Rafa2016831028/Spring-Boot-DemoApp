package com.example.test.Payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initialDatabase(EmployeeRepositary repositary){
        return args -> {
            log.info("Preloading " + repositary.save(new Employee("Jarin",40000)));
            log.info("Preloading " + repositary.save(new Employee("Nihal",75000)));
            log.info("Preloading" + repositary.save(new Employee("LUCKY",50000)));
        };
    }
}
