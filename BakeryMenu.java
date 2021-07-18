package saimen1;

import java.util.Scanner;

public class BakeryMenu4 extends BakeryDetails4 { //subclass

	Scanner scan = new Scanner(System.in);
	private String category;
	private String item;
	private String flavour;
	private String madeIn;
	private double price;
	private int choice;
	
	BakeryMenu4(){
		System.out.println("---Bakery Menu---");
		System.out.println("\nThere are 6 category of food.");
		do {
		System.out.println("\n1-Cake \n2-Bread \n3-Cookies \n4-Pizza \n5-Muffin \n6-Donut");
		System.out.println("Please select the menu to see the details : ");
		int option = scan.nextInt();
		switch(option) {
		
	    
	
		case 1 : this.category = "Cake";
		 System.out.println("*** "+ category +" ***");
        this.item = "Hokkaido Cake";
	     System.out.println("Brand  : " + item);
	     this.flavour = "Chocolate";
	     System.out.println("Flavour     : " + flavour);
	     this.madeIn = "Japan";
	     System.out.println("Made in        : " + madeIn);
	     this.price = 20.00;
	     System.out.printf("Price       : RM %.2f" , price);
	     break;
	     

		
		 case 2 : this.category = "Bread";
		  System.out.println("*** "+category+" ***");
	      this.item = "Cheese bread";
		  System.out.println("Brand  : " + item);
		  this.flavour = "Cheese";
		  System.out.println("Flavour     : " + flavour);
		  this.madeIn = "Italy";
		  System.out.println("Made in        : " + madeIn);
		  this.price = 10.00;
		  System.out.printf("Price       : RM %.2f" , price);
		  break;
		  
		  
		  
		 case 3 : this.category = "Cookies";
 		  System.out.println("*** "+category+" ***");
 		  this.item = "Red Velvet Cookies";
		  System.out.println("Brand       : " + this.item);
		  this.flavour = "Red Velvet";
		  System.out.println("Flavour     : " + this.flavour);
		  this.madeIn = "Arab";
		  System.out.println("Made in        : " + this.madeIn);
		  this.price = 11.00;
		  System.out.printf("Price       : RM %.2f" , this.price);
		  break;
		 
		  
		  
		 case 4 : this.category = "Pizza";
	  	  System.out.println("*** "+category+" ***");
	  	  this.item = "Hawaian Pizza";
	  	  System.out.println("Brand       : " + this.item);
	  	  this.flavour = "chicken";
	  	  System.out.println("Flavour     : " + this.flavour);
		  this.madeIn = "Italy";
		  System.out.println("Made In        : " + this.madeIn);
	  	  this.price = 16.00;
	  	  System.out.printf("Price       : RM %.2f" , this.price);
		  break;
	  		  
		  
		  
		 	case 5 : this.category = "Muffin";
	  	  	  System.out.println("*** "+category+" ***");
	  	  	  this.item = "Seoul Muffin";
	  	  	  System.out.println("Brand      : " + this.name);
	  	  	  this.flavour = "Vanilla";
	  	  	  System.out.println("Flavour     : " + this.flavour);
	  	  	  this.madeIn = "Korea";
	  	  	  System.out.println("Made In       : " + this.madeIn);
	  	  	  this.price = 10.00;
	  	  	  System.out.printf("Price       : RM %.2f" , this.price);
	  	  	  break;
	  	
	  	  	  
	  	  	  
		 case 6 : this.category = "Donut";
		  System.out.println("*** "+category+" ***");
		  this.item = "Smile Donut";
		  System.out.println("Brand		  : " + this.item);
		  this.flavour = "Strawberry";
		  System.out.println("Flavour     : " + this.flavour);
		  this.madeIn = "Malaysia";
		  System.out.println("Made In    : " + this.madeIn);
		  this.price = 5.00;
		  System.out.printf("Price       : RM %.2f" , this.price);
		  break;

}
System.out.println("\n1-Continue Checking Details \n2-Exit");
choice = scan.nextInt();
if(choice != 1 && choice != 2) {
	System.out.println("Choose only \n1-Continue Checking Details \n2-Exit ");
	choice = scan.nextInt();
}
}while(choice == 1); {
	System.out.println("Thankyou " +super.name);
}
}

public String item() {
	return item;
}
public String flavour() {
	return flavour;
}

public String madeIn() {
	return madeIn;
}

public double price() {
	return price;
}

}
	
	
	
