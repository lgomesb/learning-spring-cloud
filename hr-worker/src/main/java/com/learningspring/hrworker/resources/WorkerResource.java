package com.learningspring.hrworker.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningspring.hrworker.entities.Worker;
import com.learningspring.hrworker.repositories.WorkerRepository;

@RefreshScope
@RestController
@RequestMapping( value = "/workers")
public class WorkerResource {
	
//	private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);
	
	@Autowired
	private WorkerRepository repository;

	
	@GetMapping( value = "/configs")
	public ResponseEntity<Void> getConfigs() {		
		return ResponseEntity.noContent().build();		
	}
	
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {		
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {		
		
		Worker worker = repository.findById(id).get();
		return ResponseEntity.ok(worker);
	}
	
}
