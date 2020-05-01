package com.db.embaddable.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TeacherPK implements Serializable {
    private static final long serialVersionUID = -2946815039541693914L;
    private String teacherName;
    private String departmentName;
    private String courseGiven;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getCourseGiven() {
        return courseGiven;
    }

    public void setCourseGiven(String courseGiven) {
        this.courseGiven = courseGiven;
    }
}
