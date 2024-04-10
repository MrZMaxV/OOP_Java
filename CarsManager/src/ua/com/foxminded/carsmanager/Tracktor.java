package ua.com.foxminded.carsmanager;

public class Tracktor implements Serviceable {
	
	String name;

	int yearOfProduction;

	int price;

	int weight;

	Color color;
	
	private int distance = 0;
	
	protected int distanceOnService = 0;
	
	

	public Tracktor(String name, int yearOfProduction, int price, int weight, Color color) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}

	@Override
	public void addDistance(int additionalDistance) throws Exception {
		if(additionalDistance < 0) {
			throw new Exception("Не може бути менше нуля!!!");
		}
		distance += additionalDistance;
		distanceOnService += additionalDistance;
	}

	@Override
	public void addDistance(double additionalDistance) throws Exception {
		if (additionalDistance < 0) {
			throw new Exception("Не може бути менше нуля!!!");
		}
		distance += additionalDistance;
		distanceOnService += additionalDistance;
	}

	@Override
	public boolean isReadyToService() {
		if (distanceOnService > 25000) {
			return true;
		}
		return false;
	}
	
	@Override
	public void service() {
		if (isReadyToService() == true) {
			distanceOnService = 0;
		}
	}

	@Override
	public int getDistanceOnService() {
		return distanceOnService;
	}

	@Override
	public String toString() {
		return "Tracktor [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", distance=" + distance + ", distanceOnService=" + distanceOnService
				+ "]";
	}

}
