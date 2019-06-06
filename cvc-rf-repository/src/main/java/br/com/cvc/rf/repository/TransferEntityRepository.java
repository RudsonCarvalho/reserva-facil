package br.com.cvc.rf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.cvc.rf.repository.entity.TransferEntity;

public interface TransferEntityRepository  extends JpaRepository<TransferEntity, Long> {

	@Query("SELECT t FROM TransferEntity t WHERE t.accountFrom = ?1")
	List<TransferEntity> findByAccount(String account);
	
}
