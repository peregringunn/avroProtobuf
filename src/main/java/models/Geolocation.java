package models;

public class Geolocation {
	private String type;
	private double[] coordinates;
	
	
	public Geolocation() {
		super();
		this.coordinates = new double[2];
	}
	public Geolocation(String type, double[] coordinates) {
		super();
		this.coordinates = new double[2];
		this.type = type;
		this.coordinates = coordinates;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(double[] coordinates) {
		this.coordinates = coordinates;
	}
	
	
}
