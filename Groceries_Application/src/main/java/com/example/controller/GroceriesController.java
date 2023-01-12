package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Groceries;
import com.example.service.GroceriesService;
//for send request
@RestController
public class GroceriesController
{
 @Autowired
 GroceriesService groceriesService;
 @PostMapping("/groceries")//request for post grocery
 public Groceries addGroceries(@RequestBody Groceries groceries)
 {
	 System.out.println(groceries.getName());
	return groceriesService.addGroceries(groceries);
 }
 @GetMapping("/groceries")//request for get all groceries
 public List<Groceries> findAllGroceries()
 {
	return groceriesService.findAllGroceries();
 }
 @GetMapping("/groceries/{id}")//request for get grocery using id
 public Groceries findByid(@PathVariable int id)
 {
	return groceriesService.findByid(id);
 }
 @GetMapping("/groceries/api/{name}")//request for get grocery using name
 public List<Groceries> findByname(@PathVariable String name)
 {
	return groceriesService.findByname(name);
	 
 }
 @DeleteMapping("/groceries/{id}")//request for delete grocery using  id
 public String deleteGroceries(@PathVariable int id)
 {
	 groceriesService.deleteGroceries(id);
	return "Groceroy is deleted";
 }
 @PutMapping("/groceries")//request for update grocery
 public Groceries updateGroceries(@RequestBody Groceries groceries) 
 {
	return groceriesService.updateGroceries(groceries);
 }
}

