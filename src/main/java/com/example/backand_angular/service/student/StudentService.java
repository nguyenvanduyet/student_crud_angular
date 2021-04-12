package com.example.backand_angular.service.student;

import com.example.backand_angular.model.Student;
import com.example.backand_angular.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService implements IStudentService{
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void delete(Long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public Student create(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student findById(Long id) {
        return studentRepo.findById(id).get();
    }
}
