INSERT IGNORE INTO `accounting_db`.`account`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`account_name`,`account_number`,`account_type`,`balance_date`,`currency`,`opening_avl_balance`)
VALUES(1,'2022-02-20T16:50:53',null,null,null,'SGSavings726','53572324423','Savings','2023-02-20','SGD',84327.51);
INSERT IGNORE INTO `accounting_db`.`account`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`account_name`,`account_number`,`account_type`,`balance_date`,`currency`,`opening_avl_balance`)
VALUES(2,'2022-02-21T16:50:53',null,null,null,'NZSavings727','53572324424','Savings','2023-02-20','NZD',74327.51);
INSERT IGNORE INTO `accounting_db`.`account`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`account_name`,`account_number`,`account_type`,`balance_date`,`currency`,`opening_avl_balance`)
VALUES(3,'2022-02-22T16:50:53',null,null,null,'AUSavings728','53572324425','Savings','2023-02-20','AUD',64327.51);
INSERT IGNORE INTO `accounting_db`.`account`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`account_name`,`account_number`,`account_type`,`balance_date`,`currency`,`opening_avl_balance`)
VALUES(4,'2022-02-23T16:50:53',null,null,null,'USSavings729','53572324426','Savings','2023-02-20','USD',54327.51);
INSERT IGNORE INTO `accounting_db`.`account`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`account_name`,`account_number`,`account_type`,`balance_date`,`currency`,`opening_avl_balance`)
VALUES(5,'2022-02-24T16:50:53',null,null,null,'SGSavings730','53572324427','Savings','2023-02-20','SGD',44327.51);
INSERT IGNORE INTO `accounting_db`.`account`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`account_name`,`account_number`,`account_type`,`balance_date`,`currency`,`opening_avl_balance`)
VALUES(6,'2022-02-25T16:50:53',null,null,null,'NZSavings731','53572324428','Savings','2023-02-20','NZD',34327.51);
INSERT IGNORE INTO `accounting_db`.`account`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`account_name`,`account_number`,`account_type`,`balance_date`,`currency`,`opening_avl_balance`)
VALUES(7,'2022-02-26T16:50:53',null,null,null,'AUSavings732','53572324429','Savings','2023-02-20','AUD',24327.51);
INSERT IGNORE INTO `accounting_db`.`account`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`account_name`,`account_number`,`account_type`,`balance_date`,`currency`,`opening_avl_balance`)
VALUES(8,'2022-02-27T16:50:53',null,null,null,'SGSavings733','53572324430','Savings','2023-02-20','SGD',14327.51);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(1,'2023-01-12T12:45:56',null,null,null,1000.67,null,'Credit','','2023-02-13',1);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(3,'2023-01-12T12:45:56',null,null,null,2000.67,null,'Credit','','2023-02-11',1);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(4,'2023-01-12T12:45:56',null,null,null,3000.67,null,'Credit','','2023-02-14',1);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(5,'2023-01-12T12:45:56',null,null,null,4000.67,null,'Credit','','2023-02-12',1);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(6,'2023-01-12T12:45:56',null,null,null,1000.67,null,'Credit','','2023-02-13',2);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(7,'2023-01-12T12:45:56',null,null,null,2000.67,null,'Credit','','2023-02-11',2);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(8,'2023-01-12T12:45:56',null,null,null,3000.67,null,'Credit','','2023-02-14',4);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(9,'2023-01-12T12:45:56',null,null,null,4000.67,null,'Credit','','2023-02-12',3);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(10,'2023-01-12T12:45:56',null,null,null,1000.67,null,'Credit','','2023-02-13',2);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(11,'2023-01-12T12:45:56',null,null,null,2000.67,null,'Credit','','2023-02-11',3);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(12,'2023-01-12T12:45:56',null,null,null,3000.67,null,'Credit','','2023-02-14',5);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(13,'2023-01-12T12:45:56',null,null,null,4000.67,null,'Credit','','2023-02-12',7);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(14,'2023-01-12T12:45:56',null,null,null,1000.67,null,'Credit','','2023-02-13',2);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(15,'2023-01-12T12:45:56',null,null,null,2000.67,null,'Credit','','2023-02-11',3);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(16,'2023-01-12T12:45:56',null,null,null,3000.67,null,'Credit','','2023-02-14',4);
INSERT IGNORE INTO `accounting_db`.`transaction`(`id`,`created_ts`,`created_by`,`modified_ts`,`modified_by`,`credit_amt`,`debit_amt`,`debit_credit`,`tran_narrative`,`value_date`,`account_id`)
VALUES(17,'2023-01-12T12:45:56',null,null,null,4000.67,null,'Credit','','2023-02-12',8);



