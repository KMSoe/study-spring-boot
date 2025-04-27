package com.kaungmyat.cruddemo.dao;

import com.kaungmyat.cruddemo.entity.Instructor;
import com.kaungmyat.cruddemo.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findInstructorById(int id);
    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailById(int id);

    void deleteInstructorDetailById(int id);
}
