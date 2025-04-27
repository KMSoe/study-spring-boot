package com.kaungmyat.cruddemo.dao;

import com.kaungmyat.cruddemo.entity.Instructor;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findInstructorById(int id);
    void deleteInstructorById(int id);
}
