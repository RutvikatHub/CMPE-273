package genericsimplementation;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GenericsTest {

	@Test
	public void getEngineeringSchoolName() {
		List<Engineering> one = new ArrayList<Engineering>();
		one.add(new Engineering());
		
		GetSchoolName object = new GetSchoolName();
		assertEquals(object.getSchoolName(one), "Charles W. Davidson College of Engineering");
	}

	@Test
	public void getBusinessSchoolName() {
		List<Business> two= new ArrayList<Business>();
		two.add(new Business());
		
		GetSchoolName object = new GetSchoolName();
		assertEquals(object.getSchoolName(two), "Lucas College and Graduate School of Business");
	}

}
