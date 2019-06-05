package br.com.cvc.rf.domain;

import java.util.Calendar;
import java.util.Date;

import br.com.cvc.rf.domain.enums.Status;
import br.com.cvc.rf.domain.util.Util;

public class Transfer {
	
	public Transfer() {
		
	}
	
	public Transfer(Account from, Account to, Double amount, Date scheduleDate) {
		this.from = from;
		this.to = to;
		this.amount = amount;
		this.scheduleDate = scheduleDate;
		this.createDate = Calendar.getInstance().getTime();
		this.uuid = Util.uuid();
	}

	private Long id;
	
	private String uuid;
	
	private Account from;
	
	private Account to;
	
	private double amount;
	
	private double tax;
	
	private Date createDate;
	
	private Date scheduleDate;
		
	private Date executionDate;
	
	private Status status;
		
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Account getFrom() {
		return from;
	}

	public void setFrom(Account from) {
		this.from = from;
	}

	public Account getTo() {
		return to;
	}

	public void setTo(Account to) {
		this.to = to;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	

}
