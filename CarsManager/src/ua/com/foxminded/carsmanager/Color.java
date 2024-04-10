package ua.com.foxminded.carsmanager;

public enum Color {
	BLACK ("Black"),
	ORANGE ("Orange"),
	WHITE ("White"),
	YELLOW ("Yellow"),
	BLUE ("Blue"),
	GREEN ("Green");

	private String colors;
	
	Color(String colors) {
		this.colors = colors;
	}
	
	public String toString() {
		return colors;
	}
}
