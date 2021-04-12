package com.example.backand_angular.service.student;

import com.example.backand_angular.model.Student;
import com.example.backand_angular.service.IGenericService;

public interface IStudentService extends IGenericService<Student> {
    Student findById(Long id);
}
