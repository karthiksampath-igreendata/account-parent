package com.anz.wholesale.account.service;

import java.time.LocalDateTime;

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
public class AccountingCommandService implements IAccountingCommandService {

	private static Logger logger = LoggerFactory.getLogger(AccountingCommandService.class);

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public Account persistAccount(Account account) {
		Account response = null;
		try {
			if (account != null) {
				if (isUserAuthorised() && validate()) {
					account.setCreated(LocalDateTime.now());
					response = accountRepository.save(account);
				}
			}
		} catch (Exception exception) {
			logger.error("Error while persisting account info");
			throw new AccountingException("Error while persisting account info");
		}
		return response;
	}

	private boolean isUserAuthorised() {
		// User Authorization can be checked before giving permission to create
		// account or transactions. Out of scope for the current proceedings
		return true;
	}

	private boolean validate() {
		// Account or Transaction information can be validated to ensure details are
		// reliable before
		// persisting the record. Out of scope for the current proceedings
		return true;
	}

	@Override
	public Transaction persistTransaction(Transaction transaction) {
		Transaction response = null;
		try {
			if (transaction != null) {
				if (isUserAuthorised() && validate()) {
					transaction.setCreated(LocalDateTime.now());
					response = transactionRepository.save(transaction);
				}
			}
		} catch (Exception exception) {
			logger.error("Error while persisting transaction info");
			throw new AccountingException("Error while persisting transaction info");
		}
		return response;
	}

}
