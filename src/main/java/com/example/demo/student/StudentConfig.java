package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student mariam = new Student( 
                "Pramod", 
                LocalDate.of(2000, Month.JANUARY, 1), 
                "pramod@example.com", 
                23
            );

            Student alex = new Student( 
                "Alex", 
                LocalDate.of(2002, Month.JANUARY, 1), 
                "alex@example.com", 
                24
            );

            repository.saveAll(
                List.of(mariam, alex)
            );

        };
    }
}
