package interfaceImplementation;

public class Sphere implements Interfaces {

	//Surface Area of Sphere
	@Override
	public double surfaceArea(int r) {
		return 4 * 3.14 * r * r;
	}

	//Curved Surface Area of Sphere
	@Override
	public double curvedSurfaceArea(int r) {
		return 4 * 3.14 * r  * r;
	}

	//Volume of Sphere
	@Override
	public double volume(int r) {
		return Double.parseDouble(String.format("%.2f",(4.0 / 3.0) * 3.14 * r * r * r));
	}

	public static void main(String[] args) {
		int radius = 5;
		
		Sphere object = new Sphere();
		System.out.println("Surface area of sphere with radius " + radius + " is : " + object.surfaceArea(radius));
		System.out.println("Curved surface area of sphere with radius " + radius + " is : " + object.curvedSurfaceArea(radius));
		System.out.println("Volume of sphere with radius " + radius + " is : " + object.volume(radius));
	}
}
