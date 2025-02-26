package com.mehmetsukrukavak.StudentApp.repository;

import com.mehmetsukrukavak.StudentApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
