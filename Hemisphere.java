package interfaceImplementation;

public class Hemisphere implements Interfaces {

	//Surface Area of Hemisphere
	@Override
	public double surfaceArea(int r) {
		return 3 * 3.14 * r * r;
	}

	//Curved Surface Area of Hemisphere
	@Override
	public double curvedSurfaceArea(int r) {
		return 2 * 3.14 * r  * r;
	}

	//Volume of Hemisphere
	@Override
	public double volume(int r) {
		return Double.parseDouble(String.format("%.2f",(2.0 / 3.0) * 3.14 * r * r * r));
	}

	public static void main(String[] args) {
		int radius = 5;
		
		Hemisphere object = new Hemisphere();
		System.out.println("Surface area of hemisphere with radius " + radius + " is : " + object.surfaceArea(radius));
		System.out.println("Curved surface area of hemisphere with radius " + radius + " is : " + object.curvedSurfaceArea(radius));
		System.out.println("Volume of hemisphere with radius " + radius + " is : " + object.volume(radius));
	}
}
