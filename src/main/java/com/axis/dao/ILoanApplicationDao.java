package com.axis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.entity.LoanApplication;

public interface ILoanApplicationDao extends JpaRepository<LoanApplication, Integer>{

}
