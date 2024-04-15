package in.ashokit.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import in.ashokit.entity.RestEntity;

public interface RestService 
{
	public String getUsers(RestEntity entity);
	public RestEntity getById(Integer Id);
	public List<RestEntity>getalldetalis();
	public String deleteById(Integer Id);
     
}
