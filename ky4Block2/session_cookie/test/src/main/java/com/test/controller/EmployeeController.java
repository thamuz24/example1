package com.test.controller;

import com.test.model.Employee;
import com.test.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("")
    public ResponseEntity<Iterable<Employee>> getAllEmployees() {
        Iterable<Employee> employee = iEmployeeService.findAll();
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@Validated @RequestBody Employee employee) {
        return new ResponseEntity<>(iEmployeeService.save(employee), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        Optional<Employee> employeeOptional = iEmployeeService.findById(id);
        if (!employeeOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        employee.setId(employeeOptional.get().getId());
        return new ResponseEntity<>(iEmployeeService.save(employee), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> deleteCustomer(@PathVariable Long id) {
        Optional<Employee> employeeOptional = iEmployeeService.findById(id);
        if (!employeeOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iEmployeeService.remove(id);
        return new ResponseEntity<>(employeeOptional.get(), HttpStatus.OK);
    }

    @GetMapping("/{keyword}")
    public ResponseEntity<Iterable<Employee>> searchEmployeeByKeyword(@PathVariable String keyword) {
        return new ResponseEntity<>(iEmployeeService.findEmployeesByKeyWord(keyword),HttpStatus.OK);
    }
}
