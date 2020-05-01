package com.db.embaddable.entity;

import com.db.embaddable.model.Course;
import com.db.embaddable.model.Teacher;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "DEPARTMENT")
public class Department implements Serializable {
    private static final long serialVersionUID = -550655239526041684L;

    @Id
    @Column(name = "DEPARTMENT_NAME", nullable = false)
    private String departmentName;

    @Column(name = "DEPARTMENT_COURSES", nullable = false)
    private List<Course> courses;

    @Column(name = "DEPARTMENT_TEACHER", nullable = false)
    private List<Teacher> teachers;

    @OneToMany(mappedBy = "teacherEntity")
    private Set<Teacher> teacherSet = new HashSet<>();

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Set<Teacher> getTeacherSet() {
        return teacherSet;
    }

    public void setTeacherSet(Set<Teacher> teacherSet) {
        this.teacherSet = teacherSet;
    }
}
