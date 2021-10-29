package com.jpa.hibernat.demo.Respository;

import com.jpa.hibernat.demo.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository {

    @Autowired
    EntityManager entityManager;

    public Course findById(Long id){
        return entityManager.find(Course.class,id);
    }

    public void deleteById(Long id){
        Course course = findById(id);
        entityManager.remove(course);
    }
}
