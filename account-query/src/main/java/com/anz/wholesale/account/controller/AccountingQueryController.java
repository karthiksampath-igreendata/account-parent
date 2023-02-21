package com.anz.wholesale.account.controller;

import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.wholesale.account.domain.Account;
import com.anz.wholesale.account.domain.AccountingResponse;
import com.anz.wholesale.account.domain.ResponseStatus;
import com.anz.wholesale.account.domain.Transaction;
import com.anz.wholesale.account.exception.AccountingException;
import com.anz.wholesale.account.exception.AccountingNoDatException;
import com.anz.wholesale.account.service.IAccountingQueryService;
import com.anz.wholesale.account.util.Constants;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/query")
public class AccountingQueryController {

	private static Logger logger = LoggerFactory.getLogger(AccountingQueryController.class);

	@Autowired
	IAccountingQueryService accountingQueryService;

	/**
	 * Api to retrieve the list of accounts
	 * 
	 * @return
	 */
	@ApiOperation(notes = "Retrieves List of Accounts and related information", produces = MediaType.APPLICATION_JSON_VALUE, value = "Account Details")
	@GetMapping(value = "/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccountingResponse<List<Account>>> getAccounts() {
		AccountingResponse<List<Account>> response = new AccountingResponse<>();
		List<Account> accounts = accountingQueryService.retrieveAccounts();
		if (CollectionUtils.isEmpty(accounts)) {
			logger.error(Constants.NO_ACCOUNT_FOUND);
			throw new AccountingNoDatException(Constants.NO_ACCOUNT_FOUND);
		}
		logger.info("Accounts are successfully fetched");
		response.setData(accounts);
		response.setResponseStatus(ResponseStatus.SUCCESS);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * Api to retrieve the transaction summary for the selected account
	 * 
	 * @param accountId
	 * @return
	 */
	@ApiOperation(notes = "Retrieves List of Transactions and related information based on Account", produces = MediaType.APPLICATION_JSON_VALUE, value = "Transaction Details")
	@GetMapping(value = "/transactions/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccountingResponse<List<Transaction>>> getTransactionsByAccount(
			@PathVariable("accountId") Long accountId) {
		AccountingResponse<List<Transaction>> response = new AccountingResponse<>();
		if(Objects.isNull(accountId)) {
			logger.error(Constants.VALID_INPUT_REQUIRED);
			throw new AccountingException(Constants.VALID_INPUT_REQUIRED);
		}
		List<Transaction> transactions = accountingQueryService.retrieveTransactionsByAccount(accountId);
		if (CollectionUtils.isEmpty(transactions)) {
			logger.error(Constants.NO_TRANSACTION_FOUND);
			throw new AccountingNoDatException(Constants.NO_TRANSACTION_FOUND);
		}
		logger.info("Transactions are successfully fetched for the selected account number");
		response.setData(transactions);
		response.setResponseStatus(ResponseStatus.SUCCESS);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
