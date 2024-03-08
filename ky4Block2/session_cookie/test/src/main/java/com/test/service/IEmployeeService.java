package com.test.service;

import com.test.model.Employee;

public interface IEmployeeService extends IGenerateService<Employee> {
    public Iterable<Employee> findEmployeesByKeyWord(String keyWord);

}
