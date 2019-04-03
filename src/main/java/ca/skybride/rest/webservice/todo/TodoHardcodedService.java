package ca.skybride.rest.webservice.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {

	private static List<Todo> todos = new ArrayList();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "sky", "Learn to Meow", new Date(), false ));
		todos.add(new Todo(++idCounter, "sky", "Learn to Code", new Date(), false ));
		todos.add(new Todo(++idCounter, "sky", "Learn to Squeak", new Date(), false ));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	//Save Method
	public Todo save(Todo todo){
		if(todo.getId()==-1 || (todo.getId()==0)){
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo; //Remember any method without a void must return something or there will be an error! 
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		
		if(todo==null) return null;
		
		if(todos.remove(todo)) {
			return todo;
		};
		
		return null;
	}

	public Todo findById(long id) {
		for(Todo todo:todos){
			if(todo.getId() == id){
				return todo;
			}
		}
		return null;
	}
}
