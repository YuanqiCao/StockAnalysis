import java.util.Scanner;

public class AnalysisCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("********STOCK ANALYSIS********");
		System.out.println("Please select your annual personal income:");
		System.out.println("0):<25,000");
		System.out.println("1):25,000-50,000");
		System.out.println("2):50,000-75,000");
		System.out.println("3):75,000-100,000");
		System.out.println("4):100,000-200,000");
		System.out.println("5):<200,000+");
		int income = sc.nextInt();
		try {
		switch(income)
		{
		case 0:
			
		case 1:
			
		case 2:
			
		case 3:
		
		}
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter a valid option");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}

