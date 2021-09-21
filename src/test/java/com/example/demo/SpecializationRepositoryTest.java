package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.example.demo.entity.Specialization;
import com.example.demo.repository.SpecializationRepository;

@DataJpaTest(showSql=true)
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class SpecializationRepositoryTest
{

	 private SpecializationRepository repo;
	 
	 
	 /**
	  * 1. Test Save Operation 
	  */
	 
	  /*  @Test
	    @Order(1)
	    public void testspecCreate()
	    {
	    	Specialization spec=new Specialization(null,"CRDLS", "cardilogist", "They are experts in cardilogist");
	    	spec=repo.save(spec);
	    	assertNotNull(spec.getId(),"Spec is not vreated"); 
	    	
	      }	
	    	*/
	    	
	  
	 
	 /**
	  * 2. Test Display All operation 
	  */
	  
	    @Test
	    @Order(2)
	    public void testspecFetchAll()
	    {
	    	
	    	List<Specialization>  list= repo.findAll();
	    	assertNotNull(list);
	    	assertThat(list.size()>0);
	    }
	    
	    
	 /**
	  * 3.
	  */
	
}
