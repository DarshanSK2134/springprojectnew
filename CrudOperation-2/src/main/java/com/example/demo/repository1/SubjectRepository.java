package com.example.demo.repository1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity1.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
