package com.jspider.multithreading.resource;

public class Account {
int accountBalance;
public Account(int accountBalance) {
	super();
	this.accountBalance=accountBalance;
}
public void checkBalance() {
	System.out.println("Current Balance:"+accountBalance);
}
public void depositAmount(int amount) {
	System.out.println("Depositing"+amount+"rs in account");
	accountBalance += amount;
	checkBalance();
}
public void withdrawAmount(int amount) {
	System.out.println("withdraw"+amount+"rs from accounnt");
	if (amount>accountBalance) {
		System.out.println("Insufficient balance");
	} else {
		accountBalance -= amount;
		checkBalance();
	}
}
}
