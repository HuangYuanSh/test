package com.wfu.crud.controller;


import com.wfu.crud.bean.Employee;
import com.wfu.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
  //EmployeeService employeeService;

   @RequestMapping("/emps")
    public String getEmps(){

      // List<Employee> emps=employeeService.getAll();
        return "list";
    }
}
