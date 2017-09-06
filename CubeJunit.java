package interfaceImplementation;

import static org.junit.Assert.*;

import org.junit.Test;


public class CubeJunit {
	//Comparing floating point numbers using assertEquals will require DELTA
	//The maximum delta between expected and actual for which both numbers are still considered equal
	private static final double DELTA = 1e-15;
	Cube object = new Cube();
	
	@Test
	public void cubeSATest() {
		double temp = object.surfaceArea(5);
		assertEquals(150.0, temp, DELTA);
	}
	
	@Test
	public void cubeCSATest() {
		double temp = object.curvedSurfaceArea(5);
		assertEquals(100.0, temp, DELTA);
	}

	@Test
	public void cubeVolumeTest() {
		double temp = object.volume(5);
		assertEquals(125.0, temp, DELTA);
	}
}
