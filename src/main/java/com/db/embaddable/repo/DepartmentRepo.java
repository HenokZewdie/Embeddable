package com.db.embaddable.repo;

import com.db.embaddable.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, String> {
}
