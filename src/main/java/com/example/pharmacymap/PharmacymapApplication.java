package com.example.pharmacymap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing  // 매핑 추가
public class PharmacymapApplication {

    public static void main(String[] args) {
        SpringApplication.run(PharmacymapApplication.class, args);
    }

}



