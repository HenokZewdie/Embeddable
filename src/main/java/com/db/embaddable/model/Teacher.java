package com.db.embaddable.model;

import com.db.embaddable.entity.Department;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TEACHER")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 5187259073908806676L;

    @EmbeddedId
    private TeacherPK teacherPK;

    @ManyToOne
    @MapsId("departmentName")
    @JoinColumn(name = "DEPARTMENT_NAME")
    private Department department;

    public TeacherPK getTeacherPK() {
        return teacherPK;
    }

    public void setTeacherPK(TeacherPK teacherPK) {
        this.teacherPK = teacherPK;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
