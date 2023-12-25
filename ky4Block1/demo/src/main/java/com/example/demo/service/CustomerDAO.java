package com.example.demo.service;

import com.example.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlRowSetResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CustomerDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
