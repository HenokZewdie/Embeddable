package com.db.embaddable.controller;

import com.db.embaddable.entity.Department;
import com.db.embaddable.model.Course;
import com.db.embaddable.model.Teacher;
import com.db.embaddable.repo.DepartmentRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SchoolController {

    private final DepartmentRepo departmentRepo;

    public SchoolController(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    @RequestMapping(name = "/saveData", method = RequestMethod.POST)
    public void test() {
        createDepartment();
    }

    private void createDepartment() {
        Department department = new Department();
        department.setDepartmentName("Maths");
        department.setCourses(createCourses());
        department.setTeachers(createTeachers());
        departmentRepo.save(department);
    }

    private List<Teacher> createTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(createTeacher());
        return teachers;
    }

    private Teacher createTeacher() {
        Teacher teacher = new Teacher();
        return teacher;
    }

    private List<Course> createCourses() {
        List<Course> courses = new ArrayList<>();
        courses.add(createCourse());
        return courses;
    }

    private Course createCourse() {
        Course course = new Course();
        course.setCourseName("calculus");
        course.setDepartmentGivenBy("Maths");
        course.setTeacherGivenBy("Azamd");
        return course;
    }
}
