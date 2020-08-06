package calculator;
import java.text.NumberFormat;
import java.util.Scanner;
/*the following program will calculate the mortgage by asking the user to input the value of principal, annual interest rate and numberofpayments in a year.
 It will provide the restriction to users to insert the validate numbers. After getting all the valid values, it will then calculate the mortgage by using the formula 
*/
public class mortgage {
	public static void main(String[] args) {//main method
		final byte MONTHS = 12;//declaring constant variable
		final byte PERCENTAGE = 100;
		int principal = 0;//initializing value of principal
		float interestRate = 0;
		int timePeriod = 0;
		Scanner scanner = new Scanner(System.in);//constructing scanner object
		while(true) {//while loop to get the input from user until the value entered is valid
			System.out.print("Principal: ");
		
	 principal = scanner.nextInt();//getting value from user and storing in the principal variable
		if (principal>=1000 && principal<=1_000_000) //if statement to maintain the criteria
		break;
	System.out.println("Enter the value that is greater than or equal to 1000, and less than or equal to 1,000,000 ");
		}
		while(true) {//while loop for the annualRate
		System.out.print("Annual Interest Rate: ");
			 float annualRate = scanner.nextFloat();
			if (annualRate>0 && annualRate<=30)
			{
			 interestRate = annualRate/MONTHS/PERCENTAGE;//calculating the monthly interest rate
		break;
		}
				System.out.println("Enter the annual rate from 1 to 30");
				}
		
			while(true)
			{
			System.out.print("Enter the periods in years: ");
				int timeYears = scanner.nextInt();
				if (timeYears>=1 &&timeYears<=30) {
				timePeriod = timeYears*MONTHS;//calculating number of monthly payments 
				break;
			}
				System.out.println("Enter the time in years from 1 to 30");}
			
			double mortgage = (principal*(interestRate*Math.pow(1+interestRate, timePeriod)))/(Math.pow(1+interestRate,timePeriod)-1);
			//this is implementation of mortgage formula
			
				NumberFormat val = NumberFormat.getCurrencyInstance();//method for converting calculated mortgage into dollar currency
				String mortinDollar = val.format(mortgage);
				System.out.println("Mortgage: " + mortinDollar);//print out the final mortgage
				}


	
}
	

	

