package com.test.service;

import com.test.model.Employee;
import com.test.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepository  iEmployeeRepository;
    @Override
    public Iterable<Employee> findAll() {
        return iEmployeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return iEmployeeRepository.findById(id);
    }

    @Override
    public Employee save(Employee employee) {
        return iEmployeeRepository.save(employee);
    }

    @Override
    public void remove(Long id) {
        iEmployeeRepository.delete(iEmployeeRepository.findById(id).get());
    }
    @Override
    public Iterable<Employee> findEmployeesByKeyWord(String keyWord) {
        Iterable<Employee> employeesByName = iEmployeeRepository.findEmployeesByFullName(keyWord) ;
        Iterable<Employee> employeesByEmail = iEmployeeRepository.findEmployeesByEmail(keyWord);
        Iterable<Employee> employeesByAddress = iEmployeeRepository.findEmployeesByAddress(keyWord);
        Iterable<Employee> employeesByPhoneNumber = iEmployeeRepository.findEmployeesByPhoneNumber(keyWord);
        Iterable<Employee> employeesByRoll = iEmployeeRepository.findEmployeesByRoll(keyWord);

        Set<Employee> employees =  new HashSet<Employee>();

        for (Employee employee : employeesByName) {
            employees.add(employee);
        }

        for (Employee employee : employeesByEmail) {
            employees.add(employee);
        }

        for (Employee employee : employeesByAddress) {
            employees.add(employee);
        }

        for (Employee employee : employeesByPhoneNumber) {
            employees.add(employee);
        }

        for (Employee employee : employeesByRoll) {
            employees.add(employee);
        }
        return employees;
    }

}
