import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Creates Scanner
		Scanner scan = new Scanner(System.in);
		//Creates random generator
		Random gen= new Random();
		//Variables for fuel loss and distance traveled
		int fuelLoss, distanceTraveled;
		//Constant variable for time
		final int time = 10;
		
		// Displays a welcome message
		System.out.println("Hello! And welcome to the Crucible! This race will have you and an opponent race across 10,000 miles.");
		System.out.println("The winner will be declared when the first player crosses the finish line! But beware, if you happen to run out of fuel,"
				+ " you will be stranded and forfeit to your opponent!");
		System.out.println("There are three choices: Sports Car, Economy Car, and Tanker.\n The Sports Car has a top speed of 250, holds 150 fuel, and is the least efficient."
				+ "\n The Economy Car has a top speed of 175, holds 200 fuel, and is the most efficient. \n The Tanker has a top speed of 140, holds 300 fuel, and has an average efficiency.");
		System.out.println("Let's get ready to race!!");
		
		// Creates Player 1 car
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
//Placeholder for invalid name loop		
		
		// Creates Player 2 car
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
//Placeholder for invalid name loop
		
		// Game Loop
		while (player1.getDistance() < 10000 & player2.getDistance() <10000){
			// Select speed
			System.out.print("Player 1, Select a speed. Your car's maximum speed is " + player1.getMaxSpeed());
			player1.changeSpeed();
			System.out.print("Player 2, Select a speed. Your car's maximum speed is " + player2.getMaxSpeed());
			player2.changeSpeed();
			//Calculates new distance for player 1
			distanceTraveled=time* player1.getCurrentSpeed();
			player1.setDistance(player1.getDistance()+distanceTraveled);
			//Calculates fuel loss for player 1
			fuelLoss=(int) (player1.getCurrentSpeed()*player1.getEfficiency()*distanceTraveled);
			player1.setCurrentFuel(player1.getCurrentFuel()-fuelLoss);
//Placeholder for out of fuel				
			
			//Calculates new distance for player 2
			distanceTraveled=time* player2.getCurrentSpeed();
			player2.setDistance(player2.getDistance()+distanceTraveled);

			//Calculates fuel loss for player 2
			fuelLoss=(int) (player2.getCurrentSpeed()*player2.getEfficiency()*distanceTraveled);
			player2.setCurrentFuel(player2.getCurrentFuel()-fuelLoss);
//Placeholder for out of fuel
			
		//Display current distance and fuel for player 1
			System.out.println("Player 1 Distance traveled: " + player1.getDistance() + " miles.");
			System.out.println("Player 1 fuel remaining: " + player1.getCurrentFuel());
			//Display current distance and fuel for player 2
			System.out.println("Player 2 Distance traveled: " + player2.getDistance() + " miles.");
			System.out.println("Player 2 fuel remaining: " + player2.getCurrentFuel());
			
		}
		
	}
}
