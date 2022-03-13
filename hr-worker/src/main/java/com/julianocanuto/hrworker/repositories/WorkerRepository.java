package com.julianocanuto.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julianocanuto.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}