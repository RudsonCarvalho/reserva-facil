package br.com.cvc.rf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cvc.rf.repository.entity.TransferEntity;

public interface TransferEntityRepository  extends JpaRepository<TransferEntity, Long> {

}
