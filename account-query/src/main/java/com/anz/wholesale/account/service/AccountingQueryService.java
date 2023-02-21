package com.anz.wholesale.account.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.wholesale.account.domain.Account;
import com.anz.wholesale.account.domain.Transaction;
import com.anz.wholesale.account.exception.AccountingException;
import com.anz.wholesale.account.repository.AccountRepository;
import com.anz.wholesale.account.repository.TransactionRepository;

@Service
public class AccountingQueryService implements IAccountingQueryService {

	private static Logger logger = LoggerFactory.getLogger(AccountingQueryService.class);

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	TransactionRepository transactionRepository;

	/**
	 * Service to retrieve account details
	 */
	@Override
	public List<Account> retrieveAccounts() {
		List<Account> accounts = null;
		try {
			accounts = accountRepository.findAll();
		} catch (Exception exception) {
			logger.error("Error while retrieving accounts data");
			throw new AccountingException("Error while retrieving accounts data");
		}
		return accounts;
	}

	/**
	 * Service to retrieve transactions for each account
	 */
	@Override
	public List<Transaction> retrieveTransactionsByAccount(Long accountId) {
		List<Transaction> transactions = null;
		try {
			transactions = transactionRepository.findTransactionsByAccountId(accountId);
		} catch (Exception exception) {
			logger.error("Error while retrieving transactions data");
			throw new AccountingException("Error while retrieving transactions data");
		}
		return transactions;
	}
}
