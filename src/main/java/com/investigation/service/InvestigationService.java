package com.investigation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investigation.entity.Investigation;
import com.investigation.repo.InvestigationRepo;

@Service
public class InvestigationService {
	
	@Autowired InvestigationRepo investigationRepo;
	
	public List<Investigation> getAllInvestigations() {
		
		return investigationRepo.findAll();
	}
	
	public Investigation getInvestigationById(Long id) {
		
		return investigationRepo.findById(id).get();
	}
	
	public Investigation createInvestigation(Investigation investigation) {
		
		return investigationRepo.save(investigation);
	}
	
	public Investigation updateInvestigation(Investigation investigation) {
		
		return investigationRepo.save(investigation);
	}
	
	public void deleteInvestigation(Long investigationId) {
		investigationRepo.deleteById(investigationId);
	}
}