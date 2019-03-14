package com.dswey.springbootpostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringBootPostgresqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPostgresqlApplication.class, args);
    }

}
