package com.mycompany.loancalculator;
import java.util.Scanner;

public class LoanCalculator {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		//your code goes here

		int result = 0;


		for(int mounth = 1;mounth<=3 ; ++mounth){

			result = amount;

			amount -= amount * 0.1;
		}		
		System.out.println(amount);
    }
}