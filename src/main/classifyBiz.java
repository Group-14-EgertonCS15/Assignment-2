package main;

import java.time.Year;
import java.util.Scanner;

public class classifyBiz {

	// 6. Create another class called classifyBiz. 4r
	// Using this class, call the relevant methods in class business and output
	// respective values for atleast 4 businesses.
	// For each business, indicate how old it is.The output should be well
	// formatted.

	public static void main(String[] args) {

		System.out.println("Welcome To BizManage \n Choose:\t 1. Enter Values \n \t 2. Display Values \n \t 0. Exit");

		String choice = new Scanner(System.in).next();
		
		switch ( Integer.parseInt( choice) ) {
		case 1:

			new business().requestUserForValues();
			System.out.flush();

			main(args);
			break;
		case 2:
			new business().displayValuesToUser();
			System.out.flush();
			main(args);
			break;
		case 0:
			return;

		default:
			System.out.println(" \n Please Choose Correctly. \n ");
			System.out.flush();

			main(args);
			break;
		}
	}

}
