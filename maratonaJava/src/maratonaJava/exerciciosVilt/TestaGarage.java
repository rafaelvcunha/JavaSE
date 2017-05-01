package maratonaJava.exerciciosVilt;

public class TestaGarage {

	public static void main(String[] args) {
		
		Garage garage1 = new Garage();
		Vehicle car1 = new Car();
		Vehicle car2 = new Car();
		Vehicle truck1 = new Truck();
		Vehicle truck2 = new Truck();
		Vehicle truck3 = new Truck();
		Vehicle moto1 = new Motorcycle();
		Vehicle moto2 = new Motorcycle();
		
		garage1.StartVehicleRepair(car1);
		garage1.StartVehicleRepair(car2);
		garage1.StartVehicleRepair(truck1);
		garage1.StartVehicleRepair(truck2);
		garage1.StartVehicleRepair(truck3);
		garage1.StartVehicleRepair(moto1);		
		garage1.StartVehicleRepair(moto2);		
		
		
		System.out.println(garage1.CalculateSumOfAllRepairsInGarage());
		
		System.out.println(garage1.CalculateCountOfAllTrailersInGarage());

		System.out.println(garage1.CalculateSumOfAllMotosRepairsInGarage());

	}

}
