package com.axis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.dto.LoanApplicationDto;
import com.axis.exception.LoanApplicationAlreadyExistsException;
import com.axis.exception.LoanApplicationNotFoundException;
import com.axis.service.ILoanApplicationService;

@RestController
@RequestMapping(value="/api/v1")
public class LoanApplicationController {
	@Autowired
	ILoanApplicationService service;
@PostMapping(value="/applyLoan")
public ResponseEntity<LoanApplicationDto> applyLoan(@RequestBody LoanApplicationDto dto) throws LoanApplicationAlreadyExistsException {
	
		try {
			LoanApplicationDto laDto=service.saveLoanApplication(dto);
			return new ResponseEntity<LoanApplicationDto>(laDto,HttpStatus.OK);
		} catch (LoanApplicationAlreadyExistsException e) {
			throw e;
		}
	
}
@GetMapping(value="/approveLoan/{loanId}")
public ResponseEntity<LoanApplicationDto> approveLoan(@PathVariable int loanId) throws LoanApplicationNotFoundException{
	try {
		LoanApplicationDto laDto=service.approveLoanApplication(loanId);
		return new ResponseEntity<LoanApplicationDto>(laDto,HttpStatus.OK);
	} catch (LoanApplicationNotFoundException e) {
		throw e;
	}
}

@GetMapping(value="/rejectLoan/{loanId}")
public ResponseEntity<LoanApplicationDto> rejectLoan(@PathVariable int loanId) throws LoanApplicationNotFoundException{
	try {
		LoanApplicationDto laDto=service.rejectLoanApplication(loanId);
		return new ResponseEntity<LoanApplicationDto>(laDto,HttpStatus.OK);
	} catch (LoanApplicationNotFoundException e) {
		throw e;
	}
}
}
