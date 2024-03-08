package com.test.service;




import com.test.model.Computer;
import com.test.repository.IComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class ComputerService implements IComputerService{
    @Autowired
    private IComputerRepository iComputerRepository;


    @Override
    public Iterable<Computer> findAll() {
        return iComputerRepository.findAll();
    }


    @Override
    public Optional<Computer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Computer save(Computer computer) {
        return iComputerRepository.save(computer);
    }
}