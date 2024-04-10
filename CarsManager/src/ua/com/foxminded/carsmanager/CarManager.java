package ua.com.foxminded.carsmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassengerCar toyota = new PassengerCar("Prius", 2008, 1200, 15000, Color.GREEN);
		Bus renault = new Bus("Laguna", 2000, 9700, 1600, Color.WHITE);

		Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600, " black", "diesel", true);
		Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2007, 9000, 700, "orangE ", "gas", false);

		Tracktor gt = new Tracktor("GT-T", 2024, 10000, 3000, Color.BLUE);
		
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(toyota);
		cars.add(renault);
		
		System.out.println(cars);
		
		List<Motorcycle> motos = new ArrayList<Motorcycle>();
		
		motos.add(yamaha);
		motos.add(suzuki);
		
		System.out.println(motos);

		System.out.println(gt);

		try {
			gt.addDistance(250001);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(gt);

		gt.service();

		System.out.println(gt);
	}
}
