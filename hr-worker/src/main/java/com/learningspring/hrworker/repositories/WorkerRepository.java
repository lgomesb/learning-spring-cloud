package com.learningspring.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningspring.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
