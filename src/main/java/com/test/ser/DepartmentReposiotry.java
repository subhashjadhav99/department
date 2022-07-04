package com.test.ser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.mod.Model;

@Repository
public interface DepartmentReposiotry extends JpaRepository <Model,Integer> {

	Model finDepartmentById(int id);

}
