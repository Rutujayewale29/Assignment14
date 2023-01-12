package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Groceries;
import com.example.repository.GroceriesRepository;
import com.example.service.GroceriesService;

@Repository
public class GroceriesServiceImpl implements GroceriesService
{
	@Autowired
    GroceriesRepository groceriesRepository;
	//implements all method for crud operation
	@Override
	//add groceries
	public Groceries addGroceries(Groceries groceries) {
		// TODO Auto-generated method stub
		return groceriesRepository.save(groceries);
	}
     //method for find groceries
	@Override
	public List<Groceries> findAllGroceries() {
		// TODO Auto-generated method stub
		return groceriesRepository.findAll();
	}
    //method for delete grocery
	@Override
	public void deleteGroceries(int id) {
		// TODO Auto-generated method stub
      groceriesRepository.deleteById(id);		
	}
    //method for update grocery
	@Override
	public Groceries updateGroceries(Groceries groceries) {
		// TODO Auto-generated method stub
		Groceries _groceries=groceriesRepository.findById(groceries.getId()).get();
		_groceries.setId(groceries.getId());
		_groceries.setName(groceries.getName());
		_groceries.setPrice(groceries.getPrice());
		_groceries.setQuantity(groceries.getQuantity());
		return groceriesRepository.save(_groceries);
	}
    //method for get grocery using id
	@Override
	public Groceries findByid(int id) {
		// TODO Auto-generated method stub
		return groceriesRepository.findById(id).get();
	}
     //method for find grocery using name
	@Override
	public List<Groceries> findByname(String name) {
		// TODO Auto-generated method stub
		return groceriesRepository.findByname(name);
	}
 
}