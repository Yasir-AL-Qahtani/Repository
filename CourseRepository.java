package com.example.demo.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // here its query and it must full the name in the entity and its should start with captel letter
    //eg: coursename here CourseName
    // here all query
    List<Course> findAllByCourseNameAndInstructor(String courseName,String instructorName);
    List<Course> findAllById(int id);
    // this mean select * from course where coursename= x and instructoname=y

}
