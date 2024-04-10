package ua.com.foxminded.carsmanager;

import java.util.Objects;

public class Motorcycle {

	String name;

	int yearOfProduction;

	int price;

	int weight;

	Color color;

	String engineType;

	boolean isReadyToDrive;

	int distance = 0;

	private int distanceOnService = 0;

	public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType,
			boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color.toUpperCase().replace(" ", ""));
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
	}

	public void addDistance(int additionalDistance) throws Exception {
		if (additionalDistance < 0) {
			throw new Exception("Не може бути менше нуля!");
		}
		distance += additionalDistance;
		distanceOnService += additionalDistance ;
		
	}

	public void addDistance(double additionalDistance) throws Exception {
		if (additionalDistance < 0) {
			throw new Exception("Не може бути менше нуля!");
		}
		distance += Math.round((additionalDistance * 100) / 100);
		distanceOnService += Math.round((additionalDistance * 100) / 100);
	}

	public void repair() {
		if (isReadyToDrive == false) {
			isReadyToDrive = true;
		}
	}

	public void destroyEngine() {
		if (distance > 200000) {
			isReadyToDrive = false;
		}
	}

	public void paint(Color newColor) {
		this.color = newColor;
	}

	public boolean isReadyToService() {
		if (distanceOnService > 8000) {
			return true;
		}
		return false;
	}

	public void service() {
		if (isReadyToService() == true) {
			distanceOnService = 0;
		}
	}
	
	

	public int getDistanceOnService() {
		return distanceOnService;
	}

	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ ", distance=" + distance + ", distanceOnService=" + distanceOnService + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, engineType, isReadyToDrive, name, price, weight, yearOfProduction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return color == other.color && Objects.equals(engineType, other.engineType)
				&& isReadyToDrive == other.isReadyToDrive && Objects.equals(name, other.name) && price == other.price
				&& weight == other.weight && yearOfProduction == other.yearOfProduction;
	}

}
