package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.RestEntity;
import in.ashokit.repo.RestEntityrepo;


@Service
public class Serviceimpl implements RestService
{
	@Autowired
	private RestEntityrepo repo;

	@Override
	public String getUsers(RestEntity entity) 
	{
		 repo.save(entity);
		return "Succes";
	}

	@Override
	public RestEntity getById(Integer Id) {
		// TODO Auto-generated method stub
		Optional<RestEntity> byId = repo.findById(Id);
		if(byId.isPresent())
		{
			return byId.get();
		}
		return null;
	}

	@Override
	public List<RestEntity> getalldetalis() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteById(Integer Id) {
		// TODO Auto-generated method stub
		repo.deleteById(Id);
		return "deleted succesfully";
	}


}
