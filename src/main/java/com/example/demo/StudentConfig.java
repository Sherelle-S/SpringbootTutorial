package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.student.StudentRepository;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner  CommandLineRunner(StudentRepository repository){
        return args ->{
            Student marium = new Student(
				"Mariam",
				"mariam.jamal@gmail.com",
				LocalDate.of(2000, Month.JANUARY, 5)
			);

            Student alex = new Student(
				"Alex",
				"alex@gmail.com",
				LocalDate.of(2004, Month.JANUARY, 5)
			);

            repository.saveAll(
                List.of(marium, alex)
            );
        };
    }
}
