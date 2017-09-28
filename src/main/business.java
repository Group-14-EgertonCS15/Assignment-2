package main;

import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class business {

	public business() {
	}

	static String name, location;
	String ownersName, typeOfBusiness;
	int yearOfEstablishment;
	long ownersTelephone;

	ArrayList<business> businesses = new ArrayList<>();

	// 3. Create a constructor to assign values to the said properties

	public business(String name, String location, String ownersName, long ownersTelephone, String typeOfBusiness,
			int yearOfEstablishment) {

		this.name = name;
		this.location = location;
		this.ownersName = ownersName;
		this.ownersTelephone = ownersTelephone;
		this.typeOfBusiness = typeOfBusiness;
		this.yearOfEstablishment = yearOfEstablishment;

	}

	// 4. Create method to request a user to provide values for the said properties.

	public void requestUserForValues() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Business Name: ");
		name = scanner.next();

		System.out.println("Enter Business Location: ");
		location = scanner.next();

		System.out.println("Enter Business Owners Name: ");
		ownersName = scanner.next();

		System.out.println("Enter Owners Telephone: ");
		ownersTelephone = scanner.nextLong();

		System.out.println("Enter Type of Business: ");
		typeOfBusiness = scanner.next();

		System.out.println("Enter Business Year of Estalishment: ");
		yearOfEstablishment = scanner.nextInt();

		businesses.add(new business(name, location, ownersName, ownersTelephone, typeOfBusiness, yearOfEstablishment));

	}

	// 5. Create a method that would be used to display the values the user has
	// captured in a nice format.

	public void displayValuesToUser() {

		System.out.print(
				"\n NAME \t LOCATION \t OWNER'S NAME \t OWNERS'S TELEPHONE \t TYPE OF BUSINESS \t YEAR OF ESTABLISHMENT \t AGE OF BUSINESS \n");

		/*
		 * for (business biz : businesses) {
		 * 
		 * String name = biz.name; String location = biz.location; String ownersName =
		 * biz.ownersName; long ownersTelephone = biz.ownersTelephone; String
		 * typeOfBusiness = biz.typeOfBusiness; int yearOfEstablishment =
		 * biz.yearOfEstablishment;
		 * 
		 * System.out.print(name + "\t" + location + "\t" + ownersName + "\t" +
		 * ownersTelephone + "\t" + typeOfBusiness + "\t" + yearOfEstablishment);
		 * 
		 * }
		 */
		business biz;

		for (int i = 0; i < businesses.size(); i++) {

			biz = businesses.get(i);

			String name = biz.name;
			String location = biz.location;
			String ownersName = biz.ownersName;
			long ownersTelephone = biz.ownersTelephone;
			String typeOfBusiness = biz.typeOfBusiness;
			int yearOfEstablishment = biz.yearOfEstablishment;

			int age = Year.now().getValue() - yearOfEstablishment;

			System.out.print(name + "\t" + location + "\t" + ownersName + "\t" + ownersTelephone + "\t" + typeOfBusiness
					+ "\t" + yearOfEstablishment + "\t" + age + "\n");

		}

	}

}
