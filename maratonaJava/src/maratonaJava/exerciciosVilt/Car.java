package maratonaJava.exerciciosVilt;


//Necessario mudar extends para implements, pois vc implementa uma inteface, mas não extends
public class Car implements Vehicle{

	private String name;
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getWheelCount() {
		return 4;
	}

	private double totalRepairCost;
	@Override
	public double getTotalRepairCost() {
		return this.totalRepairCost;
	}

}
