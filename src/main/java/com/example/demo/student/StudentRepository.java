package com.example.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
    //SELECT * FROM where email = whatever we pass
    Optional<Student> findStudentByEmail(String email);

    // @Query("SELECT s FROM Student/*this refers to the student class*/ s WHERE s.email = ?1");
}
