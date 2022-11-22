package com.marketingapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marketingapp1.dto.LeadDto;
import com.marketingapp1.entity.Lead;
import com.marketingapp1.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping(value = "/create-lead", method = RequestMethod.GET)
	public String createLead() {
		return "create-lead";
	}
	
/*	@RequestMapping(value = "/saveLead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead) {
		leadService.saveLead(lead);
		return "create-lead";
	}
*/
	@RequestMapping(value = "/saveLead")
	public String saveOneLead(LeadDto leadDto, ModelMap model) {
		Lead lead = new Lead();
		
		lead.setFirstName(leadDto.getFirstName());
		lead.setLastName(leadDto.getLastName());
		lead.setEmail(leadDto.getEmail());
		lead.setMobile(leadDto.getMobile());
		
		model.addAttribute("message", "Lead Information Successfully added!");
		
		leadService.saveLead(lead);
		return "create-lead";
	}
}
