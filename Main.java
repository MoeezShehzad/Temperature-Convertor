package tempconv;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double celsius, fahrenhite, kelvin;
		
		System.out.println("------Welcome to Temperature Convertor------ ");
		System.out.println("1. Celsius to Fahrenhite and Kelvin");
		System.out.println("2. Fahrenhite to Celsius and Kelvin");
		System.out.println("3. Kelvin to Celsius and Fahrenhite");
		System.out.print("Enter Choice: ");
		int choice = scan.nextInt();
		scan.nextLine();
		switch(choice) {
		case 1:
			System.out.println("Enter value in celsius: ");
			celsius = scan.nextDouble();
			fahrenhite = (celsius * 9/5) +32;
			kelvin = celsius + 273.15;
			System.out.println("Fahrenhite: " + fahrenhite + "\n" + "Kelvin: " + kelvin);
			break;
		case 2:
			System.out.println("Enter value in fahrenhite: ");
			fahrenhite = scan.nextDouble();
			celsius = (fahrenhite -32) * 5/9;
			kelvin = (fahrenhite -32) * 5/9 + 273.15;
			System.out.println("Celsius: " + celsius + "\n" + "Kelvin: " + kelvin);
			break;
		case 3:
			System.out.println("Enter value in Kelvin: ");
			kelvin = scan.nextDouble();
			celsius = kelvin - 273.15;
			fahrenhite = (kelvin -273.15) * 9/5 + 32;
			System.out.println("Celsius: " + celsius + "\n" + "Fahrenhite: " + fahrenhite);
			break;
		default:
			System.out.println("Invalid choice or invalid character entered");
			break;
		}
	}
}
