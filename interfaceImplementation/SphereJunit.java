/**
 * 
 */
package interfaceImplementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class SphereJunit {

	private static final double DELTA = 1e-15;
	Sphere object = new Sphere();
	
	@Test
	public void sphereSATest() {
		double temp = object.surfaceArea(5);
		assertEquals(314.0, temp, DELTA);
	}
	
	@Test
	public void sphereCSATest() {
		double temp = object.curvedSurfaceArea(5);
		assertEquals(314.0, temp, DELTA);
	}

	@Test
	public void sphereVolumeTest() {
		double temp = object.volume(5);
		assertEquals(523.33, temp, DELTA);
	}
}
