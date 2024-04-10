package ua.com.foxminded.carsmanager;

public interface Serviceable {

	public boolean isReadyToService();
	
	public int getDistanceOnService();
	
	public void addDistance (int additionalDistance) throws Exception;
	
	public void addDistance (double additionalDistance) throws Exception;
	
	public void service();
}
