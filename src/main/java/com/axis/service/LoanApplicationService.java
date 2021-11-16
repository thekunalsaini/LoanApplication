package com.axis.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.dao.ILoanApplicationDao;
import com.axis.dto.LoanApplicationDto;
import com.axis.entity.LoanApplication;
import com.axis.exception.LoanApplicationAlreadyExistsException;
import com.axis.exception.LoanApplicationNotFoundException;
@Service
public class LoanApplicationService implements ILoanApplicationService {
	@Autowired
	private ILoanApplicationDao dao;
	@Override
	public LoanApplicationDto saveLoanApplication(LoanApplicationDto dto)
			throws LoanApplicationAlreadyExistsException {
		int loanId=dto.getId();
		try{
			dao.findById(loanId).get();
			throw new LoanApplicationAlreadyExistsException("Application already exist");
		}catch(NoSuchElementException e) {
			LoanApplication loanApp=new LoanApplication();
			loanApp.setId(loanId);
			loanApp.setBankName(dto.getBankName());
			loanApp.setMinLoanAmount(dto.getMinLoanAmount());
			loanApp.setMaxLoanAmount(dto.getMaxLoanAmount());
			loanApp.setMinInterestRate(dto.getMinInterestRate());
			loanApp.setMinCreditScore(dto.getMinCreditScore());
			loanApp.setTermLength(dto.getTermLength());
			loanApp.setProcessingFee(dto.getProcessingFee());
			loanApp.setRating(dto.getRating());
			loanApp.setStatus(dto.getStatus());
			dao.save(loanApp);	
		}
		return dto;
	}

	@Override
	public LoanApplicationDto approveLoanApplication(int loanId) throws LoanApplicationNotFoundException {
		LoanApplication loanApp;
		try {
			loanApp=dao.findById(loanId).get();
			loanApp.setStatus("Approved");
			dao.save(loanApp);
		}catch(NoSuchElementException e) {
			throw new LoanApplicationNotFoundException("Application not found");
		}
		LoanApplicationDto dto=new LoanApplicationDto();
		
		return dto;
		
	}

	@Override
	public LoanApplicationDto rejectLoanApplication(int loanId) throws LoanApplicationNotFoundException {
		LoanApplication loanApp;
		try {
			loanApp=dao.findById(loanId).get();
			loanApp.setStatus("Reject");
			dao.save(loanApp);
		}catch(NoSuchElementException e) {
			throw new LoanApplicationNotFoundException("Application not found");
		}
		LoanApplicationDto dto=new LoanApplicationDto();
	
		return dto;
	}

}
