package br.com.cvc.rf.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class TransferEntity {

	private @Id @GeneratedValue Long id;
	
}
