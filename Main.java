package saimen1;

import java.util.Scanner;

public class Main4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opt,choice,select;
		
		do {
		System.out.println("Please Select User as : \n1-Admin \n2-Customer");
		choice = scan.nextInt();
		switch(choice) {
		
		case 1 : System.out.println("** Bakery System **");
				 System.out.println("As an Admin you are allowed to enter : ");
		         do {
		         System.out.println("\n1.Finance System ");
		         opt = scan.nextInt();
		         switch(opt) {
		         case 1 :Finance4 em = new Finance4();
		        	 	 System.out.println(em);break;
		         
		         }
		         System.out.println("Continue As Admin?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
		         
		         
		case 2 :do { 
				 System.out.println("** Welcome to the bakery **");
        		 System.out.println("\n1.Billing System \n2.Bakery Menu \n3.Exit");
                 System.out.println("Please select your option : ");
                 opt = scan.nextInt();
                 switch(opt) {
                 case 1 :BillingSystem b = new BillingSystem();
                 		 System.out.println(b);break;
                 case 2 :BakeryMenu4 ad = new BakeryMenu4();
                	 	 System.out.println(ad);break;
                	 	 
                 }
                 if(opt<1 && opt>3) {
                	 System.out.println("\n1.Bakery details \n2.Bakery Menu \n3.Exit");			         System.out.println("Please Choose");
			         opt = scan.nextInt();
		         }
                 System.out.println("Continue As Customer?(1-Yes,2-No)");
		 		 select = scan.nextInt();
		         }while(select==1);break;
        		 }
		System.out.println("Continue Using Bakery System?(1-Yes,2-No)");
		select = scan.nextInt();
		
		}while(select==1);
		System.out.println("Thankyou for visiting this Bakery.");
		
	}
}
