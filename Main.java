import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//Creates Scanner
		Scanner scan = new Scanner(System.in);
		
		//Displays a welcome message
		System.out.println("Hello! And welcome to the Crucible! This race will have you and an opponent race across 10,000 miles.");
		System.out.println("The winner will be declared when the first player crosses the finish line! But beware, if you happen to run out of fuel,"
				+ " you will be stranded and forfeit to your opponent!");
		System.out.println("There are three choices: Sports Car, Economy Car, and Tanker.\n The Sports Car has a top speed of 250, holds 150 fuel, and is the least efficient."
				+ "\n The Economy Car has a top speed of 175, holds 200 fuel, and is the most efficient. \n The Tanker has a top speed of 140, holds 300 fuel, and has an average efficiency.");
		System.out.println("Let's get ready to race!!");
		
		//Creates Player 1 car
		Car player1 = new Car();
		System.out.println("Now It's time for Player 1 to select a car!\n Please enter either Sports Car, Economy Car, or Tanker.");
		String car1=scan.nextLine();
		switch(car1){
		case "Sports Car":
			player1.initialValues(150, 250, .65);
			break;
		case "Economy Car":
			player1.initialValues(200, 175, .50);
			break;
		case "Tanker":
			player1.initialValues(300, 140, .60);
			break;
		default:
			System.out.println("Invalid car name.");
		}
		
		//Creates Player 2 car
		Car player2 = new Car();
		System.out.println("Now It's time for Player 2 to select a car!\n Please enter either Sports Car, Economy Car, or Tanker.");
		String car2=scan.nextLine();
		switch(car2){
		case "Sports Car":
			player2.initialValues(150, 250, .65);
			break;
		case "Economy Car":
			player2.initialValues(200, 175, .50);
			break;
		case "Tanker":
			player2.initialValues(300, 140, .60);
			break;
		default:
			System.out.println("Invalid car name.");
		}
		
		
	}
}
