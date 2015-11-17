
import java.util.Scanner;

// Dakota Mitchem
// CS 202 Section 002
// Assignment 4.2
// Goal: Simulates attributes of a motorboat

public class MotorBoat {
	//Declares private variables
	private int currentFuel;
	private int currentSpeed;
	private int efficiency;
	private int distance;
	private int maxSpeed;
	private int maxFuel;
	
	//Creates scanner
	Scanner scan = new Scanner(System.in);
	
	//Constructor
	public MotorBoat() {
		setCurrentFuel(0);
		setCurrentSpeed(0);
		setEfficiency(0);
		setDistance(0);
		setMaxSpeed(0);
		setMaxFuel(0);	
	}
	
	//Getters and Setters
	public float getMaxFuel() {
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
	
	public int getEfficiency() {
		return efficiency;
	}
	
	public void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	//Accepts initial values
	public void initialValues(int mFuel, int mSpeed, int effi){
		setMaxFuel(mFuel);
		setMaxSpeed(mSpeed);
		setEfficiency(effi);
	}
	
	//Run boat for specified period of time
	public void simulator(int time){
		 int fuelLoss = (time * efficiency * (currentSpeed * currentSpeed));
		 int distanceTraveled = (time * currentSpeed);
		 setCurrentFuel(currentFuel - fuelLoss);
		 setDistance(distance + distanceTraveled);
	}
	
	//Changes speed of boat
	public void changeSpeed(){
		System.out.println("Enter new speed:");
		int speed = scan.nextInt();
		setCurrentSpeed(speed);
	}
	
	//Adds fuel to boat
	public void refuel (){
		System.out.println("Enter amount of fuel to add:");
		int fuel = scan.nextInt();
		setCurrentFuel(currentFuel + fuel);
	}
	
	//Checks fuel level of boat
	public void fuelCheck(){
	System.out.println("Current fuel is " + currentFuel);
	}
	
	//checks distance traveled
	public void distanceCheck(){
		System.out.println("Distance traveled is " + distance);
	}
	
}
