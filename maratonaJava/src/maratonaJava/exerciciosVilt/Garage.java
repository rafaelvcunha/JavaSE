package maratonaJava.exerciciosVilt;


import java.util.ArrayList;
import java.util.Collection;

public class Garage {
	

	private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();
		
	public void StartVehicleRepair(Vehicle x ){ this.vehicles.add(x);}
	
	public void CloseVehicleRepair(Vehicle x ){ this.vehicles.remove(x);}
		
	
	/*Returns the sum of all the cars repaired in the garage*/
	public double CalculateSumOfAllRepairsInGarage(){
		double sumOfAllRepairsInGarage = 0.0;
		
		for (Vehicle vehicle : vehicles) {
			if(vehicle.getWheelCount() == 4){
				sumOfAllRepairsInGarage++ ;
			}
		}
		return sumOfAllRepairsInGarage ;
	}

	/*Returns the count of all the trailers in the garage*/
	public  int CalculateCountOfAllTrailersInGarage(){
		int countOfAllTrailersInGarage = 0;
		
		for (Vehicle vehicle : vehicles) {
			if(vehicle.getWheelCount() == 6){
				countOfAllTrailersInGarage++;
			}			
		}
				
		return countOfAllTrailersInGarage;
	}
	
	
	public double CalculateSumOfAllMotosRepairsInGarage(){
		double sumOfAllRepairsInGarage = 0.0;
		
		for (Vehicle vehicle : vehicles) {
			if(vehicle.getWheelCount() == 2){
				sumOfAllRepairsInGarage++ ;
			}
		}
		return sumOfAllRepairsInGarage ;
	}	
}
