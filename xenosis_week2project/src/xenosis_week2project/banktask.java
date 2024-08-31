package xenosis_week2project;

import xenosisinternshipprojectpackage.Bankaccount;

class Bankaccount
{
	private double balance;
	
	public Bankaccount(double initialbalance)
	{
		if(initialbalance>=0)
		{
			this.balance=initialbalance;
		}

	}
	
	public void deposite(double amount)
	{
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println("deposiyed amount="+amount);
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount>0) {
			if(amount<=balance) {
				balance=balance-amount;
				System.out.println("withdraw="+amount);
			}
		}
	}
	
	public void displaybalance()
	{
		System.out.println("current balance is="+balance);
	}
}

public class banktask {

	public static void main(String[] args) 
	{
		Bankaccount obj=new Bankaccount(0);
		obj.displaybalance();
		
		obj.deposite(50);
		obj.displaybalance();
		
		obj.withdraw(30);
		obj.displaybalance();

	}

}
