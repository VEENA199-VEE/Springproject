package com.tns.item;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class ItemService 
{
   @Autowired
	private ItemRepository repository;
   
	public List<Item> listAll() 
	{
		return repository.findAll();
	}

	public Item get(Integer id) 
	{
		
		return repository.findById(id).get();
	}

	public void save(Item item) 
	{
		
		repository.save(item);	
	}

	public void delete(Integer id) 
	{
		repository.deleteById(id);
		
	}

}
