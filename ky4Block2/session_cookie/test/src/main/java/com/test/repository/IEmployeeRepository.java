package com.test.repository;

import com.test.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface IEmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
    public Iterable<Employee> findEmployeesByFullName(String keyWord);
    public Iterable<Employee> findEmployeesByAddress(String keyWord);

    public Iterable<Employee> findEmployeesByEmail(String keyWord);

    public Iterable<Employee> findEmployeesByPhoneNumber(String keyWord);
    public Iterable<Employee> findEmployeesByRoll(String keyWord);

}
