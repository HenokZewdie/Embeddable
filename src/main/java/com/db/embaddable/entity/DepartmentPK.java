package com.db.embaddable.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DepartmentPK implements Serializable {

    private static final long serialVersionUID = -8707796928740555431L;

    @Column(name = "DEPARTMENT_NAME", nullable = false)
    private String departmentName;

    @Column(name = "TEACHER_NAME", nullable = false)
    private String teacherName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
