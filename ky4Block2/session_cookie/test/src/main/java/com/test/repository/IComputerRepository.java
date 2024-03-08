package com.test.repository;

import com.test.model.Computer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IComputerRepository extends PagingAndSortingRepository<Computer,Long> {
    List<Computer> findAllByName(String keyword);
}
