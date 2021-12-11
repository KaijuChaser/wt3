package com.bsuir.max.archive.server.service;

import com.bsuir.max.archive.server.bean.Student;

import java.util.List;

public interface ServerUniversityService {
    void add(Student student) throws ServerServiceException;

    void edit(Student student) throws ServerServiceException;

    List<Student> getById(String id) throws ServerServiceException;
}
