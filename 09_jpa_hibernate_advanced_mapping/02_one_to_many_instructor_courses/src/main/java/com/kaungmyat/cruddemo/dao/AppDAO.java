package com.kaungmyat.cruddemo.dao;

import com.kaungmyat.cruddemo.entity.Course;
import com.kaungmyat.cruddemo.entity.Instructor;
import com.kaungmyat.cruddemo.entity.InstructorDetail;
import com.kaungmyat.cruddemo.entity.Student;

import java.util.List;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findInstructorById(int id);
    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailById(int id);

    void deleteInstructorDetailById(int id);

    // One to Many
    List<Course> findCoursesByInstructorId(int id);
    Instructor findInstructorByIdJoinFetch(int id);
    void updateInstructor(Instructor tempInstructor);
    void updateCourse(Course tempCourse);
    Course findCourseById(int id);
    void deleteCourseById(int id);
    void saveCourse(Course course);
    Course findCourseAndReviewsByCourseId(int id);

    // Many to Many
    Course findCourseAndStudentsByCourseId(int id);
    Student findStudentAndCoursesByStudentId(int id);
    void updateStudent(Student tempStudent);
    void deleteStudentById(int id);
}
