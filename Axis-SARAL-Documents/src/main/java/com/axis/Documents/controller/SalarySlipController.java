package com.axis.Documents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.axis.Documents.entity.SalarySlip;
import com.axis.Documents.service.SalarySlipService;
@RestController

public class SalarySlipController {
	@Autowired
	private SalarySlipService salarySlipService;
	
	@GetMapping("/salaryslips")
	 public List<SalarySlip> getAllSalarySlip(){
        return salarySlipService.getAllSalarySlip();
	 }
	@GetMapping("/salaryslip/{salaryId}")
	public SalarySlip getSalarySlipById(@PathVariable Long salaryId){
        return salarySlipService.getSalarySlipById(salaryId);
    }
	@PostMapping("salaryslip/add")
	public ResponseEntity<String> addSalarySlip(@RequestBody SalarySlip salarySlip){
        salarySlipService.addSalarySlip(salarySlip);
        return new ResponseEntity<String>("Employee is added successfully.", HttpStatus.OK);
	}

	@PutMapping("/salaryslip/update/{salaryId}")
	public ResponseEntity<String> updateSalarySlip(@PathVariable Long salaryId, @RequestBody SalarySlip salarySlip){
        salarySlipService.updateSalarySlip(salaryId, salarySlip);
        return new ResponseEntity<String> ("Salary Id: "+ salaryId +" is updated Successfully.", HttpStatus.OK);
	
	}
	@DeleteMapping("/salaryslip/delete/{salaryId}")
	 public ResponseEntity<String> deleteSalarySlip(@PathVariable Long salaryId){
        salarySlipService.deleteSalarySlipId(salaryId);
        return new ResponseEntity<String>("Salary Id: "+ salaryId +"is deleted Successfully.", HttpStatus.OK);
	
	}

}
