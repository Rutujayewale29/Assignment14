package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Groceries;

@Service
public interface GroceriesService
{
 Groceries addGroceries(Groceries groceries);
 List<Groceries> findAllGroceries();
 void deleteGroceries(int id);
 Groceries updateGroceries(Groceries groceries);
 Groceries findByid(int id);
 List<Groceries> findByname(String name);
}
