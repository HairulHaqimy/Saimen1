package saimen1;

import java.util.Scanner;

public class BillingSystem extends BakeryDetails4{ //subclass 
	Scanner scan = new Scanner(System.in);
	private String customer_name;
	private String customer_hp;
	private int quantity,choice;
	private double price;
	private double voucher;
	
	BillingSystem(){
		
		System.out.println("\n---Billing System---");
		System.out.print("Please enter your name         : ");
		customer_name = scan.next();
		System.out.print("Please enter your phone number : ");
		customer_hp = scan.next();
		do {
		System.out.println("\nPlease select the type of beverages : ");
		System.out.println("1-Cake \n2-Bread \n3-Cookies \n4-Pizza \n5-Muffin \n6-Donut");
		int option = scan.nextInt();
		while(option < 1 || option > 6) {
			System.out.println("\nOnly number from (1-6) is available, please check again. : ");
			System.out.println("1-Cake \n2-Bread \n3-Cookies \n4-Pizza \n5-Muffin \n6-Donut");
			option = scan.nextInt();
		}
		switch(option) {
		case 1 : this.price = 20.00;break;
		case 2 : this.price = 10.00;break;
		case 3 : this.price = 11.00;break;
		case 4 : this.price = 16.00;break;
		case 5 : this.price = 10.00;break;
		case 6 : this.price = 5.00;break;
		}
		System.out.print("\nEnter Quantity : ");
		this.quantity = scan.nextInt();
		if(this.quantity < 100) {
			calctotalprice();//overloading with no arguments as nothing change
			System.out.printf("\nTotal price  : RM%.2f" , calctotalprice());

		}
		
		else if(this.quantity == 100) {
			calctotalprice();//overloading with no arguments as nothing change
			System.out.printf("\nTotal price  : RM %.2f" , calctotalprice());
			System.out.println("\nGet free 1 ctn(24 pcs) of beverages." );
		}
		
		else if(this.quantity > 100 && this.quantity <=500) {
			double discount = 0.10;
			calctotalprice(discount);//overloading with 1 arguments as discount=0.10 if quantity > 100
			System.out.printf("\nQuantity more than 100.\nTotal price  : RM %.2f" , calctotalprice(discount));
		}
		
		else{//have discount if more than 500 , price will have changes
			double discount=0.10;
			double voucher = 20.00;
			calctotalprice(discount,voucher);
			System.out.printf("\nIf quantity more than 500.\nTotal price  : RM %.2f" , calctotalprice(discount,voucher));
			}
		System.out.println("\nChoose 1-Continue purchase,2-Exit and do payment :");
		choice = scan.nextInt();
		if(choice != 1 && choice != 2) {
			System.out.println("Choose only 1-Continue buying,2-Exit :");
			choice = scan.nextInt();
		}
		}while(choice == 1); {
			System.out.println("Paid buy      : " + this.customer_name+ " ("+ this.customer_hp + ") ");
			System.out.println("\nThankyou " +super.name);
			System.out.println();
		}
	}
	
	public double calctotalprice() {//overloading method-no argument
		return this.price*this.quantity;
	}
	
	public double calctotalprice(double discount) {//overloading method-1 argument
		return (this.price*this.quantity)*(1-discount);
	}
	
	public double calctotalprice(double discount,double voucher) {//overloading method-2 arguments
		return ((this.price*this.quantity) *(1-discount))-this.voucher;
	}  

}