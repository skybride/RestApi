package ca.skybride.rest.webservice.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

	//GET
	//URI
	@GetMapping(path="/hello-world")
	//method - "Hello World"
	public String helloWorld(){
		return "Hello Meow";
	}
	
	@GetMapping(path="/hello-world-bean")
	public AuthenticationBean helloWorldBean(){
		return new AuthenticationBean( "Hello Meow -- Connected and working from service!");
	}
	
	@GetMapping(path="/hello-world-bean-error")
	public AuthenticationBean helloWorldBeanError(){
		return new AuthenticationBean("Some Error has Happened!");
	}
	
	//hello-world/path-variable/{sky}
	@GetMapping(path="/hello-world/path-variable/{name}")
	//helloWorldPathVariable could have been any method ex:helloMeow
	//that method takes in a parameter of type String with field 'name' or 'sky' or 'id'
	//PathVariable annotation has to be added into the parameter for spring boot to recognize
	//returning a new bean -> turning it toString format -> it takes in 2 arguments
	// add a %s right after 1st argument -> second argument will be output
	
	public AuthenticationBean helloWorldPathVariable(@PathVariable String name){
		return new AuthenticationBean(String.format("Hello Meow, %s", name));
	}
	//What is happening?
	//the value that is being passed in is picked up by the controller -> is sent back as a response
	
}
