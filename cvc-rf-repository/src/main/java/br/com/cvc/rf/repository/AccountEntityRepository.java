package br.com.cvc.rf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cvc.rf.repository.entity.AccountEntity;

public interface AccountEntityRepository extends JpaRepository<AccountEntity, Long> {

}
