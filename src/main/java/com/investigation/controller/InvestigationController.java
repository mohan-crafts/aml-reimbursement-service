package com.investigation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.investigation.entity.Investigation;
import com.investigation.service.InvestigationService;

@RestController
@RequestMapping("/investigation")
public class InvestigationController {
	
	@Autowired InvestigationService investigationService;
	
	@GetMapping("")
	public ResponseEntity<List<Investigation>> getInvestigations() {
		return ResponseEntity.ok(investigationService.getAllInvestigations());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Investigation> getInvestigationById(@PathVariable("id") Long investigationID) {
		return ResponseEntity.ok(investigationService.getInvestigationById(investigationID));
	}
	
	@PostMapping("")
	public ResponseEntity<Investigation> createInvestigation(@RequestBody Investigation investigation) {
		
		return ResponseEntity.ok(investigationService.createInvestigation(investigation));
	}
	
	@PutMapping("")
	public ResponseEntity<Investigation> updateInvestigation(@RequestBody Investigation investigation) {
		
		return ResponseEntity.ok(investigationService.updateInvestigation(investigation));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteInvestigation(@PathVariable("id") Long investigationId) {
		investigationService.deleteInvestigation(investigationId);
		return ResponseEntity.ok(true);
	}
}