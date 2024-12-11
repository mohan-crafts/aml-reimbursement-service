package com.investigation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.investigation.entity.Investigation;

public interface InvestigationRepo extends JpaRepository<Investigation, Long> {
		
}