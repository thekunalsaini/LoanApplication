package com.axis.service;

import com.axis.dto.LoanApplicationDto;
import com.axis.exception.LoanApplicationAlreadyExistsException;
import com.axis.exception.LoanApplicationNotFoundException;

public interface ILoanApplicationService {
LoanApplicationDto saveLoanApplication(LoanApplicationDto laDto) throws LoanApplicationAlreadyExistsException;
LoanApplicationDto approveLoanApplication(int loanId) throws LoanApplicationNotFoundException;
LoanApplicationDto rejectLoanApplication(int loanId) throws LoanApplicationNotFoundException;
}
