package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Specialization;
import com.example.demo.repository.SpecializationRepository;
import com.example.demo.service.ISpecializationService;

@Service
public class SpecializationServiceImpl implements ISpecializationService
{
	
	@Autowired
	private SpecializationRepository repo;

	@Override
	public Long saveSpecialization(Specialization spec) 
	{
		
		return repo.save(spec).getId();
	}

	@Override
	public List<Specialization> getAllSpecializations()
	{
		
		return repo.findAll();
	}

	
	@Override
	public void removeSpecialization(Long id)
	{
	   repo.deleteById(null);	
		
	}

	@Override
	public Specialization getOneSpecialization(Long id) 
	{
	    Optional<Specialization> optional=repo.findById(id);
	    
	    if(optional.isPresent())
	    	return optional.get();
	    else
		    return null;
	}

	@Override
	public void updateSpecialization(Specialization spec)
	{
		 repo.save(spec);
		
	}
  
}
