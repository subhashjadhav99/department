
package com.test.contro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.mod.Model;
import com.test.ser.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentservice;
	
	@PostMapping("/save")
	public Model saveModel(Model model) {
		return departmentservice.saveModel(model);
	}
	
	@GetMapping("/get")
	public Model findDepartmentById(@PathVariable("id")int id) {
		return departmentservice.findDepartmentById(id);
	}
}
