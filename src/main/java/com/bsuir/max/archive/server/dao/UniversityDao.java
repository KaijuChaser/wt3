package com.bsuir.max.archive.server.dao;

import com.bsuir.max.archive.server.bean.Student;

import java.util.List;

public interface UniversityDao {
    List<Student> getById(String id) throws DaoException;

    void add(Student appliance) throws DaoException;

    void edit(Student student) throws DaoException;
}
