package com.anz.wholesale.account.service;

import com.anz.wholesale.account.domain.Account;
import com.anz.wholesale.account.domain.Transaction;

public interface IAccountingCommandService {
	Account persistAccount(Account account);

	Transaction persistTransaction(Transaction transaction);

}
