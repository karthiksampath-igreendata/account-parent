DROP SCHEMA IF EXISTS `accounting_db` ;
CREATE SCHEMA `accounting_db` ;
USE `accounting_db`;

CREATE TABLE `account` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_ts` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_ts` datetime DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `account_name` varchar(255) DEFAULT NULL,
  `account_number` varchar(255) DEFAULT NULL,
  `account_type` varchar(255) DEFAULT NULL,
  `balance_date` date DEFAULT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `opening_avl_balance` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `transaction` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_ts` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_ts` datetime DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `credit_amt` decimal(19,2) DEFAULT NULL,
  `debit_amt` decimal(19,2) DEFAULT NULL,
  `debit_credit` varchar(255) DEFAULT NULL,
  `tran_narrative` varchar(255) DEFAULT NULL,
  `value_date` date DEFAULT NULL,
  `account_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tran_acc_fk` (`account_id`),
  CONSTRAINT `tran_acc_fk` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
