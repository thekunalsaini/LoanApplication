package com.axis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import javax.persistence.Id;
@Entity
@Table
public class LoanApplication {
	@Id
	@Column(name="loan_id", nullable=false)
	private int Id;
	@Column
	private String bankName;
	@Column
	private double minLoanAmount;
	@Column
	private double maxLoanAmount; 
	@Column
	private double minInterestRate;
	@Column
	private int minCreditScore;//300-850
	@Column
	private double termLength;
	@Column
	private double processingFee;
	@Column
	private int rating;
	@Column
	private String status;
	public LoanApplication() {
		
	}
	public LoanApplication(int id, String bankName, double minLoanAmount, double maxLoanAmount, double minInterestRate,
			int minCreditScore, double termLength, double processingFee, int rating,String status) {
		super();
		Id = id;
		this.bankName = bankName;
		this.minLoanAmount = minLoanAmount;
		this.maxLoanAmount = maxLoanAmount;
		this.minInterestRate = minInterestRate;
		this.minCreditScore = minCreditScore;
		this.termLength = termLength;
		this.processingFee = processingFee;
		this.rating = rating;
		this.status = status;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getMinLoanAmount() {
		return minLoanAmount;
	}
	public void setMinLoanAmount(double minLoanAmount) {
		this.minLoanAmount = minLoanAmount;
	}
	public double getMaxLoanAmount() {
		return maxLoanAmount;
	}
	public void setMaxLoanAmount(double maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}
	public double getMinInterestRate() {
		return minInterestRate;
	}
	public void setMinInterestRate(double minInterestRate) {
		this.minInterestRate = minInterestRate;
	}
	public int getMinCreditScore() {
		return minCreditScore;
	}
	public void setMinCreditScore(int minCreditScore) {
		this.minCreditScore = minCreditScore;
	}
	public double getTermLength() {
		return termLength;
	}
	public void setTermLength(double termLength) {
		this.termLength = termLength;
	}
	public double getProcessingFee() {
		return processingFee;
	}
	public void setProcessingFee(double processingFee) {
		this.processingFee = processingFee;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
