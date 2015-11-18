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
		System.out.println("Enter new speed:");
		int speed = scan.nextInt();
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
	}

}
	
