package genericsimplementation;

import java.util.ArrayList;
import java.util.List;

public class GetSchoolName{

	public String getSchoolName(List<? extends SJSU> list) {
		return list.get(0).schoolName();
	}
	
	public static void main(String[] args) {
		List<Engineering> one = new ArrayList<Engineering>();
		one.add(new Engineering());
		
		List<Business> two= new ArrayList<Business>();
		two.add(new Business());
		
		GetSchoolName object = new GetSchoolName();
		System.out.println("SJSU's Engineering school is named as : " + object.getSchoolName(one));
		System.out.println("SJSU's Business school is named as : " + object.getSchoolName(two));
	}
}