package com.kaushalya.todo.todorestapp;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoService {

ArrayList<Todo> todoList = new ArrayList<Todo>();
@PostMapping(path="/addToDo")
public void addToDo(@RequestBody Todo todo) {
	System.out.println("Inside addToDo");
	todoList.add(todo);
}

@GetMapping(path="/ListToDo")
public ArrayList<Todo> listToDo() {
	System.out.println("Inside listToDo");
	return todoList;
}


@DeleteMapping(path="/deleteToDo/{id}")
public void deleteToDo(@PathVariable int id) {
	System.out.println("In delete");
	Todo tobeDeleted = null;
	for (int i=0;i<todoList.size();i++)
	{
		if (todoList.get(i).id == id)
		{
			System.out.println("Inside delete");
			tobeDeleted = todoList.get(i);
			todoList.remove(tobeDeleted);
			break;
		}
	}	
}

@PutMapping(path="/updateToDo/{id}")
public void updateToDo(@PathVariable int id,@RequestBody Todo todo) {
	
	System.out.println("Inside update");
	
	for (int i=0; i <todoList.size();i++)
	{	
		
		if (todoList.get(i).id == id)
		{
			
			todoList.set(i, todo);
			break;
		}
		
	}	
	
	
}

}
