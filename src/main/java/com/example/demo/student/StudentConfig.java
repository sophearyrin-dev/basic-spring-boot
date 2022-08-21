package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student pheary = new Student(
                    "Pheary",
                    "srin@gmail.com",
                    LocalDate.of(1999, Month.APRIL, 10)
            );

            Student bopha = new Student(
                    "Bopha",
                    "srin@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 10)
            );

            studentRepository.saveAll(List.of(pheary,bopha));
        };
    }
}
