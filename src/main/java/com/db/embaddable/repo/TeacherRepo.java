package com.db.embaddable.repo;

import com.db.embaddable.model.Teacher;
import com.db.embaddable.model.TeacherPK;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepo extends CrudRepository<Teacher, TeacherPK> {
}
