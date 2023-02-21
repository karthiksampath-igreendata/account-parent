package com.anz.wholesale.account.service;

import java.util.List;

import com.anz.wholesale.account.domain.Account;
import com.anz.wholesale.account.domain.Transaction;

public interface IAccountingQueryService {
	List<Account> retrieveAccounts();

	List<Transaction> retrieveTransactionsByAccount(Long accountId);

}
