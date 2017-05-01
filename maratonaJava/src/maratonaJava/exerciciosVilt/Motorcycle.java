package maratonaJava.exerciciosVilt;

public class Motorcycle extends Car implements Vehicle,IWarranty {

	private String name;	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getWheelCount() {
		return 2;
	}

	private double totalRepairCost;
	@Override
	public double getTotalRepairCost() {
		return this.totalRepairCost;
	}

	@Override
	public Boolean isValid() {
		return true;
	}
}
