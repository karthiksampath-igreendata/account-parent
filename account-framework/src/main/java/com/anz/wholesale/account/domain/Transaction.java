package com.anz.wholesale.account.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Transaction")
public class Transaction extends Auditable {
	/**
	 * Unique Id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	Long id;

	/**
	 * Transaction Value Date
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "VALUE_DATE")
	LocalDate valueDate;

	/**
	 * Amount Debited
	 */
	@Column(name = "DEBIT_AMT")
	BigDecimal debitAmount;

	/**
	 * Amount Credited
	 */
	@Column(name = "CREDIT_AMT")
	BigDecimal creditAmount;

	/**
	 * Debit or Credit Transaction
	 */
	@Column(name = "DEBIT_CREDIT")
	String debitCredit;

	/**
	 * Transaction Narative
	 */
	@Column(name = "TRAN_NARRATIVE")
	String transactionNarrative;

	/**
	 * Account Information
	 */
	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID", referencedColumnName = "ID")
	Account account;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getValueDate() {
		return valueDate;
	}

	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}

	public BigDecimal getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(BigDecimal debitAmount) {
		this.debitAmount = debitAmount;
	}

	public BigDecimal getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getDebitCredit() {
		return debitCredit;
	}

	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
	}

	public String getTransactionNarrative() {
		return transactionNarrative;
	}

	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
