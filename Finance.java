package saimen1;

import java.util.Scanner;

public class Finance4 extends BakeryDetails4{ //subclass
	
	Scanner scan = new Scanner(System.in);
	
	private double totalsales;
	private double totalcost;
	private double workersSalary;
	private double expenses;
	private double profit;
	private double netincome;
	

	Finance4() {
		System.out.println("***Finance System***");
		Sales();
		NetIncome();
		System.out.println();
		}
	
	public void Sales() {
		System.out.print("\nTotal Sales per month :  RM ");
		this.totalsales = scan.nextDouble();
		System.out.print("\nTotal Inventory per month :  RM ");
		this.totalcost = scan.nextDouble();
		this.profit = this.totalsales - this.totalcost;
		if(profit<0) {
			System.out.printf("\nFinancial Loss : RM %.2f" , this.profit);
			System.out.println();
		}
		else if(profit==0) {
			System.out.printf("\nBalance : RM %.2f" , this.profit);
			System.out.println();
		}
		else{
			System.out.printf("\nProfit : RM %.2f" , this.profit);
			System.out.println();
		} 
	}
	
	public void NetIncome() {
		System.out.println();

		System.out.print("\nTotal Expenses per month :  RM ");
		this.expenses = scan.nextDouble();
		System.out.print("\nTotal Employees' salary per month :  RM ");
		this.workersSalary = scan.nextDouble();
		this.netincome = this.profit - this.workersSalary - this.expenses;
		if(netincome<0) {
			System.out.printf("\nNet Income : RM %.2f" , this.netincome);
			System.out.println();
		}
		else if(netincome==0) {
			System.out.printf("\nNet Income : RM %.2f" , this.netincome);
			System.out.println();
		}
		else{
			System.out.printf("\nNet Income : RM %.2f" , this.netincome);
			System.out.println();
		} 
		
		
		
	}

}
