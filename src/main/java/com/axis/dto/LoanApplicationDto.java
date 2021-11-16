package com.axis.dto;



public class LoanApplicationDto {
	private int Id;
	private String bankName;
	private double minLoanAmount;
	private double maxLoanAmount; 
	private double minInterestRate;
	private int minCreditScore;//300-850
	private double termLength;
	private double processingFee;
	private int rating;
	private String Status="Pending";
	public LoanApplicationDto() {
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
		return Status;
	}
	public void setStatus(String status) {
		this.Status=status;
	}
}
