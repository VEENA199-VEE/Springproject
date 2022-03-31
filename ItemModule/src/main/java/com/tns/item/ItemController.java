package com.tns.item;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController 
{
	
    @Autowired
	private ItemService service;
	
    //Retrive All the rows from Database
	@GetMapping("/items")
	public List<Item> list()
	{
	   return service.listAll();
	}
	
	//Retrieve Specific Records from Database
	@GetMapping("/items/{id}")
	public ResponseEntity<Item> get (@PathVariable Integer id)
	{
		Item item = service.get(id);
		return new ResponseEntity<Item>(item, HttpStatus.OK);
	}
	
	//CREATE a row in database
	@PostMapping("/items")
	public void add(@RequestBody Item item)
	{
	service.save(item);
		
}
    //Update Operation - record in database	
	@PutMapping("/items/{id}")
	public ResponseEntity<?> update(@RequestBody Item item,@PathVariable Integer id)
	{
		try {
			Item existItem = service.get(id);
			service.save(item);
			return new ResponseEntity<Item>(item, HttpStatus.OK);
		}
		catch (Exception e) 
		{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);	
			
		}
	}
	
	//Delete Operation
	@DeleteMapping("/items/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
}	
}

		


	


