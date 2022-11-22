package com.marketingapp1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp1.entity.Lead;
import com.marketingapp1.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService{
	
	@Autowired
	private LeadRepository leadRepository;

	@Override
	public void saveLead(Lead lead) {
		leadRepository.save(lead);
		
	}

}
