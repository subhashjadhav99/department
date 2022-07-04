package com.test.ser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mod.Model;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentReposiotry departmentrepository;

	public Model saveModel(Model model) {
		// TODO Auto-generated method stub
		return departmentrepository.save(model);
	}



	public Model findDepartmentById(int id) {
		// TODO Auto-generated method stub
		return departmentrepository .finDepartmentById(id);
	}
}
