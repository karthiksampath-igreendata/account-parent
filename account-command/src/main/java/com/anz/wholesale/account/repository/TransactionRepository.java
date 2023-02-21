package com.anz.wholesale.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anz.wholesale.account.domain.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
