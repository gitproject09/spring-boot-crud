package com.sopan.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student sopan = new Student(
                    "Sopan",
                    "sopan.ahmed@gmail.com",
                    LocalDate.of(1992, Month.FEBRUARY, 16)
            );

            Student alex = new Student(
                    "Alex",
                    "alex.test@gmail.com",
                    LocalDate.of(2005, Month.SEPTEMBER, 18)
            );

            Student mishu = new Student(
                    "Mishu",
                    "mishu.test@gmail.com",
                    LocalDate.of(1993, Month.MARCH, 27)
            );

            repository.saveAll(List.of(sopan, alex, mishu));

        };
    }
}
