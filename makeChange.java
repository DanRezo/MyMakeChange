package wk1;

import java.util.Scanner;

public class makeChange {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.print("What is the price of the item?\t" + "$");
		double price = kb.nextDouble();

		System.out.print("Enter amount tendered:" + "$");
		double tender = kb.nextDouble();

		kb.close();
		
		// Started with and if else statement that would require a sufficient
		// amount of money.

		if (tender < price) {
			System.out.print("You've entered and insufficient amount.");
		} else if (tender == price) {
			System.out.print("No Change.\nHave A Nice Day");
		}

		else if (tender > price) {
			// Assigning a value for change

			double change = (tender - price);

			// Multiplying the (double) change by 100( 100 pennies per dollar)
			// and casting it to an integer. Assigning that value to
			// currencyCount.
			// I also multiply the denominations of our currency by 100 and take
			// the mod which leaves a count per bill/coin.

			int currencyCount = (int) (change * 100);

			int jackson = currencyCount / 2000;
			currencyCount = currencyCount % 2000;

			int hamilton = currencyCount / 1000;
			currencyCount = currencyCount % 1000;

			int lincoln = currencyCount / 500;
			currencyCount = currencyCount % 500;

			int washington = currencyCount / 100;
			currencyCount = currencyCount % 100;

			int quarter = currencyCount / 25;
			currencyCount = currencyCount % 25;

			int dime = currencyCount / 10;
			currencyCount = currencyCount % 10;

			int nickel = currencyCount / 5;
			currencyCount = currencyCount % 5;

			int penny = currencyCount;
			System.out.println("******************************");
			System.out.println("Your change is:");
			System.out.println("******************************");

			if (jackson == 1) {
				System.out.print(jackson + " Twenty Dollar Bill\t");
			}
			else if (jackson >1){
				System.out.print(jackson + " Twenty Dollar Bills\t");
			}
			if (hamilton == 1) {
				System.out.print(hamilton + " Ten Dollar Bill \t");
			}
			else if (hamilton > 1){
				System.out.print(hamilton + " Ten Dollar Bills \t");
			}
			if (lincoln == 1) {
				System.out.print(lincoln + " Five Dollar Bill\t");
			}
			else if (lincoln > 1) {
				System.out.print(lincoln + " Five Dollar Bills\t");
			}
			if (washington == 1) {
				System.out.print(washington + " One Dollar Bill\t");
			}
			else if (washington > 1) {
				System.out.print(washington + " One Dollar Bills\t");
			}
			if (quarter == 1) {
				System.out.print(quarter +" Quarter  ");
			}
			else if (quarter > 1) {
				System.out.print(quarter +" Quarters  ");
			}
			if (dime == 1) {
				System.out.print(dime +" Dime  ");
			}
			else if (dime > 1) {
				System.out.print(dime +" Dimes  ");
			}
			if (nickel == 1) {
				System.out.print(nickel +" Nickel ");
			}
			else if (nickel >1) {
				System.out.print(nickel +" Nickels  ");
			}
			if (penny == 1 ) {
				System.out.print(penny + " Penny  ");
			}
			else if (penny > 1) {
				System.out.print(penny + " Pennies  ");
			}

		}

	}
}
