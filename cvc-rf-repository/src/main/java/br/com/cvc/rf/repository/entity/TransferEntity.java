package br.com.cvc.rf.repository.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class TransferEntity {

	private @Id @GeneratedValue Long id;
	
	private String accountFrom;
	
	private String accountTo;
	
	private double amount;
	
	private double tax;
	
	private Date createDate;
	
	private Date scheduleDate;
	
	private Date executionDate;
	
	private String error;
}
