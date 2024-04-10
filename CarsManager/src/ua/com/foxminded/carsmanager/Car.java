package ua.com.foxminded.carsmanager;

import java.util.Objects;

public abstract class Car implements Serviceable {

	String name;

	int yearOfProduction;

	int price;

	int weight;

	Color color;
	
	private int distance = 0;
	
	protected int distanceOnService = 0;

	public Car(String name, int yearOfProduction, int price, int weight, Color color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}

	public void addDistance (int additionalDistance) throws Exception {
		if (additionalDistance < 0) {
			throw new Exception("Не може бути менше нуля!");
		}
		distance += additionalDistance;
		distanceOnService += additionalDistance;
	}
	
	public void addDistance (double additionalDistance) throws Exception {
		if (additionalDistance < 0) {
			throw new Exception("Не може бути менше нуля!");
		}
		distance += Math.round((additionalDistance*100)/100);
		distanceOnService += Math.round((additionalDistance*100)/100);
	}
	
	public void service() {
		if (isReadyToService() == true) {
			distanceOnService = 0;
		}
	}
	
	public int getDistanceOnService() {
		return distanceOnService;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", distance=" + distance + ", distanceOnService=" + distanceOnService
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, price, weight, yearOfProduction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return color == other.color && Objects.equals(name, other.name) && price == other.price
				&& weight == other.weight && yearOfProduction == other.yearOfProduction;
	}

}
