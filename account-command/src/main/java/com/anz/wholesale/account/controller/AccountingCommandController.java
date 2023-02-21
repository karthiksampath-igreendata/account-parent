package com.anz.wholesale.account.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.wholesale.account.domain.Account;
import com.anz.wholesale.account.domain.AccountingResponse;
import com.anz.wholesale.account.domain.ResponseStatus;
import com.anz.wholesale.account.domain.Transaction;
import com.anz.wholesale.account.exception.AccountingException;
import com.anz.wholesale.account.exception.AccountingNoDatException;
import com.anz.wholesale.account.service.IAccountingCommandService;
import com.anz.wholesale.account.util.Constants;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/cmd")
public class AccountingCommandController {

	private static Logger logger = LoggerFactory.getLogger(AccountingCommandController.class);

	@Autowired
	IAccountingCommandService accountingCommandService;

	@ApiOperation(notes = "Creates new account", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, value = "Account Details")
	@PostMapping(value = "/account", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccountingResponse<Account>> createAccount(@RequestBody Account account)
			throws AccountingException {
		AccountingResponse<Account> response = new AccountingResponse<>();

		if (account == null) {
			logger.error(Constants.VALID_INPUT_REQUIRED);
			throw new AccountingNoDatException(Constants.VALID_INPUT_REQUIRED);
		}

		Account resAccount = accountingCommandService.persistAccount(account);
		if (resAccount == null) {
			logger.error("Exception while creating Account!!");
			throw new AccountingException("Exception while creating Account!!");
		}
		logger.info("Account creation successful");
		response.setResponseStatus(ResponseStatus.SUCCESS);
		response.setData(resAccount);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@ApiOperation(notes = "Creates transactions for accounts", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, value = "Account Details")
	@PostMapping(value = "/transaction", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AccountingResponse<Transaction>> createTransaction(@RequestBody Transaction transaction)
			throws AccountingException {
		AccountingResponse<Transaction> response = new AccountingResponse<>();

		if (transaction == null) {
			logger.error(Constants.VALID_INPUT_REQUIRED);
			throw new AccountingNoDatException(Constants.VALID_INPUT_REQUIRED);
		}

		Transaction resTrans = accountingCommandService.persistTransaction(transaction);
		if (resTrans == null) {
			logger.error("Exception while creating transaction!!");
			throw new AccountingException("Exception while creating transaction!!");
		}
		logger.info("Transaction creation successful");
		response.setResponseStatus(ResponseStatus.SUCCESS);
		response.setData(resTrans);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
