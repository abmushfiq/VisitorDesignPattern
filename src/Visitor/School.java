package Visitor;

import java.util.ArrayList;

public class School {

	static ArrayList<Child> childList;
	
	static {
		childList = new ArrayList<Child>();
		
		Child john = new Child("john");
		Child steve = new Child("steve");
		Child rohit = new Child("rohit");
		Child sonu = new Child("sonu");
		
		childList.add(john);
		childList.add(steve);
		childList.add(rohit);
		childList.add(sonu);
		
	}
	
	public static void doHealthCheckep() {
		ChildSpecialistDoctor chd = new ChildSpecialistDoctor("dr.samu");
		for (Child child : childList) {
			child.accept(chd);
		}
	}
}
