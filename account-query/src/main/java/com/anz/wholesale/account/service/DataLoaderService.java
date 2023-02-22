package com.anz.wholesale.account.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.anz.wholesale.account.domain.Account;
import com.anz.wholesale.account.domain.Transaction;
import com.anz.wholesale.account.exception.AccountingException;
import com.anz.wholesale.account.repository.AccountRepository;
import com.anz.wholesale.account.repository.TransactionRepository;

@Service
/*
 * This service is used to load test data if embedded database is used for
 * testing
 */
public class DataLoaderService {

	private static Logger logger = LoggerFactory.getLogger(DataLoaderService.class);

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	TransactionRepository transactionRepository;

	@Autowired
	Environment env;

	public void loadDataToDB() {
		if (!Arrays.asList(env.getActiveProfiles()).contains("mysql")) {
			logger.info("Load Sample Test Data");
			Integer count = 0;
			while (count < 10) {
				Account account1 = new Account();
				account1.setAccountName("SGSavings78" + count);
				account1.setAccountNumber("345355345345" + count);
				account1.setAccountType("Saving");
				account1.setBalanceDate(LocalDate.now());
				account1.setCurrency("SGD");
				account1.setOpeningAvailableBalance(BigDecimal.valueOf(10000.45 + count));

				account1 = accountRepository.save(account1);

				Transaction tran1 = new Transaction();
				tran1.setAccount(account1);
				tran1.setCreditAmount(BigDecimal.valueOf(1000.45 + count));
				tran1.setDebitCredit("Credit");
				tran1.setTransactionNarrative("NA");
				tran1.setValueDate(LocalDate.now());

				transactionRepository.save(tran1);

				Transaction tran2 = new Transaction();
				tran2.setAccount(account1);
				tran2.setDebitAmount(BigDecimal.valueOf(1045.45 - count));
				tran2.setDebitCredit("Debit");
				tran2.setTransactionNarrative("NA");
				tran2.setValueDate(LocalDate.now());

				transactionRepository.save(tran2);

				count++;
			}
			logger.info("Loaded Sample Test Data");
		}
	}

}
