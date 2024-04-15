package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.RestEntity;
import in.ashokit.service.RestService;

@RestController
public class CustomerController 
{
	@Autowired
	private RestService service;
	
	@PostMapping("/customer")
	public ResponseEntity<String> getAlldetalis(@RequestBody RestEntity entity)
	{
		 String users = service.getUsers(entity);
	     return new ResponseEntity<> (users,HttpStatus.CREATED);
		
	}
	@GetMapping("/product/{Id}")
	public ResponseEntity<RestEntity> getdetalis(@PathVariable Integer Id)
	{
		RestEntity byId = service.getById(Id);
		return new ResponseEntity<>(byId,HttpStatus.OK);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<RestEntity>>getAllcourses()
	{
		List<RestEntity> getalldetalis = service.getalldetalis();
		return new ResponseEntity<>(getalldetalis,HttpStatus.OK);
	}

}
