package com.db.embaddable.model;

public class Course {
    private String courseName;
    private String departmentGivenBy;
    private String teacherGivenBy;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDepartmentGivenBy() {
        return departmentGivenBy;
    }

    public void setDepartmentGivenBy(String departmentGivenBy) {
        this.departmentGivenBy = departmentGivenBy;
    }

    public String getTeacherGivenBy() {
        return teacherGivenBy;
    }

    public void setTeacherGivenBy(String teacherGivenBy) {
        this.teacherGivenBy = teacherGivenBy;
    }
}
