import java.util.Scanner;

public class Car {
		public static void main(String[] args) {
			Scanner insert = new Scanner(System.in);
			
			System.out.println("What is the total price of the car?");
	
			int TotCar = insert.nextInt();

			System.out.println("What was the initial down payment on the car?");
	
			int DownP = insert.nextInt();
	
			System.out.println("How long in months was the car loaned?");
	
			int LenMonths = insert.nextInt();
	
			System.out.println("What is the interest rate for the loan on the car?");
	
			double Interest = insert.nextDouble();
			
			Units unit = new Units(TotCar , DownP, LenMonths, Interest);
			System.out.println("The monthly car payment is: " + unit.theMonthlyPayment());
			System.out.println("The total amount of money spent over the term of the loan is: " + unit.theTotInterest());
}}

