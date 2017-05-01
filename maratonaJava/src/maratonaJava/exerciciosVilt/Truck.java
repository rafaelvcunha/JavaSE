package maratonaJava.exerciciosVilt;

public class Truck extends Car implements Vehicle{

	public int getWheelCount(){
		return 6;
	}
	
	private boolean hastTrailer = false;
	
	public boolean HasTrailer(){ return this.hastTrailer; }
}
