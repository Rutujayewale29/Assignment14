package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Groceries;

public interface GroceriesRepository extends JpaRepository<Groceries,Integer>
{
 public List<Groceries> findByname(String name);
}

