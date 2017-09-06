package interfaceImplementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class HemisphereJunit {

	private static final double DELTA = 1e-15;
	Hemisphere object = new Hemisphere();
	
	@Test
	public void hemisphereSATest() {
		double temp = object.surfaceArea(5);
		assertEquals(235.5, temp, DELTA);
	}
	
	@Test
	public void hemisphereCSATest() {
		double temp = object.curvedSurfaceArea(5);
		assertEquals(157.0, temp, DELTA);
	}

	@Test
	public void hemisphereVolumeTest() {
		double temp = object.volume(5);
		assertEquals(261.67, temp, DELTA);
	}
}
