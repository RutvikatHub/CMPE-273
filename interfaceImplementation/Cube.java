package interfaceImplementation;

public class Cube implements Interfaces {

	//Surface Area of Cube
	@Override
	public double surfaceArea(int r) {
		return 6 * r * r;
	}

	//Curved Surface Area of Cube
	@Override
	public double curvedSurfaceArea(int r) {
		return 4  *r * r;
	}

	//Volume of Cube
	@Override
	public double volume(int r) {
		return r * r * r;
	}
	public static void main(String[] args) {
		int side = 5;
		
		Cube object = new Cube();
		System.out.println("Surface area of cube with side " + side + " is : " + object.surfaceArea(side));
		System.out.println("Curved surface area of cube with side " + side + " is : " + object.curvedSurfaceArea(side));
		System.out.println("Volume of cube with side " + side + " is : " + object.volume(side));
	}
}
