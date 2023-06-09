package com.education.madkouresta.madkouresta.course.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.madkouresta.madkouresta.course.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
