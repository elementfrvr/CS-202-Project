import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Creates Scanner
		Scanner scan = new Scanner(System.in);
		//Creates random generator
		Random gen= new Random();
		//Variables for fuel loss and distance traveled
		int fuelLoss, distanceTraveled, randomFuel;
		//Constant variable for time
		final int time = 10;
		
		// Displays a welcome message
		System.out.println("Hello! And welcome to the Crucible! This race will have you and an opponent race across 10,000 miles.");
		System.out.println("The winner will be declared when the first player crosses the finish line! But beware, if you happen to run out of fuel,"
				+ " you will be stranded and forfeit to your opponent!");
		System.out.println("There are three choices: Sports Car, Economy Car, and Tanker.\n The Sports Car has a top speed of 250, holds 1500 fuel, and is the least efficient."
				+ "\n The Economy Car has a top speed of 175, holds 2000 fuel, and is the most efficient. \n The Tanker has a top speed of 140, holds 3000 fuel, and has an average efficiency.");
		System.out.println("Let's get ready to race!!");
		
		// Creates Player 1 car
		Car player1 = new Car();
		System.out.println("Now It's time for Player 1 to select a car!\n Please enter either Sports Car, Economy Car, or Tanker.");
		String car1=scan.nextLine();
		switch(car1){
		case "Sports Car":
			player1.initialValues(1500, 250, .00055);
			break;
		case "Economy Car":
			player1.initialValues(2000, 175, .00040);
			break;
		case "Tanker":
			player1.initialValues(3000, 140, .00050);
			break;
		default:
			System.out.println("Invalid car name.");
		}
		player1.refuel();
//Placeholder for invalid name loop		
		
		// Creates Player 2 car
		Car player2 = new Car();
		System.out.println("Now It's time for Player 2 to select a car!\n Please enter either Sports Car, Economy Car, or Tanker.");
		String car2=scan.nextLine();
		switch(car2){
		case "Sports Car":
			player2.initialValues(1500, 250, .00055);
			break;
		case "Economy Car":
			player2.initialValues(2000, 175, .00040);
			break;
		case "Tanker":
			player2.initialValues(3000, 140, .00050);
			break;
		default:
			System.out.println("Invalid car name.");
		}
		player2.refuel();
//Placeholder for invalid name loop
		
		
// Game Loop
		while (player1.getDistance() < 10000 & player2.getDistance() <10000 & player1.getCurrentFuel()>0 & player2.getCurrentFuel()>0){
			// Select speed
			System.out.print("Player 1, Select a speed. Your car's maximum speed is " + player1.getMaxSpeed());
			player1.changeSpeed();
			System.out.print("Player 2, Select a speed. Your car's maximum speed is " + player2.getMaxSpeed());
			player2.changeSpeed();
			
			//Calculates new distance for player 1
			distanceTraveled=time* player1.getCurrentSpeed();
			player1.setDistance(player1.getDistance()+distanceTraveled);
			
			//Calculates fuel loss for player 1
			fuelLoss=(int) ((player1.getCurrentSpeed()*player1.getEfficiency())*distanceTraveled);
			player1.setCurrentFuel(player1.getCurrentFuel()-fuelLoss);			
			
			//Calculates new distance for player 2
			distanceTraveled=time* player2.getCurrentSpeed();
			player2.setDistance(player2.getDistance()+distanceTraveled);
			
			//Calculates fuel loss for player 2
			fuelLoss=(int) ((player2.getCurrentSpeed()*player2.getEfficiency())*distanceTraveled);
			player2.setCurrentFuel(player2.getCurrentFuel()-fuelLoss);
			
			//Display current distance and fuel for player 1
			System.out.print("Player 1 ");
			player1.distanceCheck();
			System.out.println("Player 1 fuel remaining: " + player1.getCurrentFuel());
			
			//Display current distance and fuel for player 2
			System.out.print("Player 2 ");
			player2.distanceCheck();
			System.out.println("Player 2 fuel remaining: " + player2.getCurrentFuel());
			
			//Placeholder for distance graphic
			if(player2.getDistance() > player1.getDistance()){
				System.out.println("______________________________________________________________________________________");
				System.out.println("          "+ "[PLAYER 1]");
				System.out.println("\n" +"------------ ------------ ------------ ------------ ------------ ------------ --------");
				System.out.println(  "                                              "+ "[PLAYER 2]");
				System.out.println("______________________________________________________________________________________");
				System.out.println("Player 2 is in the lead!");
			}

			//Random refuel for player 1
			randomFuel=gen.nextInt(100)+1;
			if (randomFuel<=35){
				player1.refuel();
				System.out.println("Player 1 has gained a refuel!\n");
			}
			
			//Random refuel for player 2
			randomFuel=gen.nextInt(100)+1;
			if (randomFuel<=35){
				player2.refuel();
				System.out.println("Player 2 has gained a refuel!\n");
			}
			
		}
//End game scenarios
		//Player 1 out of fuel
		if (player1.getCurrentFuel()<=0)
			System.out.println("Player 1 is out of fuel! Player 2 wins!");
		//Player 2 out of fuel
		if (player2.getCurrentFuel()<=0)
			System.out.println("Player 2 is out of fuel! Player 1 wins!");
		
		//Player 1 victory message
		if (player1.getDistance()>=10000)
			System.out.println("Player 1 has crossed the finish line! Player 1 wins!");
		//Player 2 victory message
		if (player2.getDistance()>=10000)
			System.out.println("Player 2 has crossed the finish line! Player 2 wins!");	
	}
}
