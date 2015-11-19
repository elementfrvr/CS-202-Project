//Contains car class, initialValues, refuel, changeSpeed, fuelCheck, and distanceCheck


import java.util.Scanner;

public class Car {
	//Declares private variables
	private int currentFuel;
	private int currentSpeed;
	private double efficiency;
	private int distance;
	private int maxSpeed;
	private int maxFuel;
		
	//Creates scanner
	Scanner scan = new Scanner(System.in);
		
	//Constructor
	public Car() {
		setCurrentFuel(0);
		setCurrentSpeed(0);
		setEfficiency(0);
		setDistance(0);
		setMaxSpeed(0);
		setMaxFuel(0);	
	}
		
	//Getters and Setters
	public int getMaxFuel() {
		return maxFuel;
	}

	public void setMaxFuel(int maxFuel) {
		this.maxFuel = maxFuel;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getCurrentFuel() {
		return currentFuel;
	}
		
	public void setCurrentFuel(int currentFuel) {
		this.currentFuel = currentFuel;
	}
		
	public int getCurrentSpeed() {
		return currentSpeed;
	}
		
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
		
	public double getEfficiency() {
		return efficiency;
	}
		
	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
		
	public int getDistance() {
		return distance;
	}
		
	public void setDistance(int distance) {
		this.distance = distance;
	}
		
	//Accepts initial values
	public void initialValues(int mFuel, int mSpeed, double effi){
		setMaxFuel(mFuel);
		setMaxSpeed(mSpeed);
		setEfficiency(effi);
	}
		
	//Changes speed of car
	public void changeSpeed(){
		System.out.println("\nEnter new speed:");
		int speed = scan.nextInt();
	//Checks for invalid speed
		while (speed > -1){
		if(speed > maxSpeed){
			System.out.println("Invalid Speed! Enter a new valid speed!");
			speed = scan.nextInt();
		} else {
				break;}}
		setCurrentSpeed(speed);		
	}
		
	//Adds fuel to car
	public void refuel (){
		setCurrentFuel(maxFuel);
	}
		
	//Checks fuel level of car
	public void fuelCheck(){
		System.out.println("Current fuel is " + currentFuel);
	}
		
	//checks distance traveled
	public void distanceCheck(){
		System.out.println("Distance traveled is " + distance);
//Distance Graphic. Every time distance increases by 500, the player moves up a space
	if(distance == 0){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("X                                                                                                                                    |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance > 0 && distance < 500){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("   X                                                                                                                                 |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 500 && distance < 1000){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("      X                                                                                                                               |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 1000 && distance < 1500){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("             X                                                                                                                       |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 1500 && distance < 2000){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                    X                                                                                                                |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 2000 && distance < 2500){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                           X                                                                                                         |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 2500 && distance < 3000){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                  X                                                                                                  |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 3000 && distance < 3500){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                         X                                                                                           |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 3500 && distance < 4000){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                X                                                                                    |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 4000 && distance < 4500){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                       X                                                                             |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 4500 && distance < 5000){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                              X                                                                      |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 5000 && distance < 5500){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                     X                                                               |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 5500 && distance < 6000){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                            X                                                        |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 6000 && distance < 6500){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                   X                                                 |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 6500 && distance < 7000){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                          X                                          |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 7000 && distance < 7500){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                 X                                   |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 7500 && distance < 8000){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                        X                            |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 8000 && distance < 8500){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                               X                     |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 8500 && distance < 9000){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                      X              |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 9000 && distance < 9500){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                             X       |");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 9500 && distance < 10000){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                    X|");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	if(distance >= 10000){
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     | X (WINNER!!!)");                                                                 
		System.out.println("------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ ------ |");
		System.out.println("_____________________________________________________________________________________________________________________________________|");
		System.out.println("                                                                                                                                     |");
		}
	
	
	
	
	
	}

}
