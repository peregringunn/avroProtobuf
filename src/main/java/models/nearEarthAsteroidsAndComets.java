package models;

import java.sql.Time;

public class nearEarthAsteroidsAndComets {
	private String name;
	private int id;
	private String nameType;
	private String  recclass;
	private long mass;
	private String fall;
	private Time year;
	private double reclat;
	private double reclong;
	private Geolocation geolocation;
	
	public nearEarthAsteroidsAndComets() {
		super();
	}

	public nearEarthAsteroidsAndComets(String name, int id, String nameType, String recclass, long mass, String fall,
			Time year, double reclat, double reclong, Geolocation geolocation) {
		super();
		this.name = name;
		this.id = id;
		this.nameType = nameType;
		this.recclass = recclass;
		this.mass = mass;
		this.fall = fall;
		this.year = year;
		this.reclat = reclat;
		this.reclong = reclong;
		this.geolocation = geolocation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameType() {
		return nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public String getRecclass() {
		return recclass;
	}

	public void setRecclass(String recclass) {
		this.recclass = recclass;
	}

	public long getMass() {
		return mass;
	}

	public void setMass(long mass) {
		this.mass = mass;
	}

	public String getFall() {
		return fall;
	}

	public void setFall(String fall) {
		this.fall = fall;
	}

	public Time getYear() {
		return year;
	}

	public void setYear(Time year) {
		this.year = year;
	}

	public double getReclat() {
		return reclat;
	}

	public void setReclat(double reclat) {
		this.reclat = reclat;
	}

	public double getReclong() {
		return reclong;
	}

	public void setReclong(double reclong) {
		this.reclong = reclong;
	}

	public Geolocation getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(Geolocation geolocation) {
		this.geolocation = geolocation;
	}
	
	
	
	
}
