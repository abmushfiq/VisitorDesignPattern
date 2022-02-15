package Visitor;

public class ChildSpecialistDoctor implements Visitor {
	
	private String name;
	
	public ChildSpecialistDoctor (String name)
	{
		super();
		this.name=name;
	}

	@Override
	public void visit(Visitable visitable) {
		
		Child child = (Child) visitable;
		child.setHealthStatus("good");
		System.out.println("ChildSpecialistDoctor: "+ this.getName() + 
				" did the checkup of the child: "
				+ child.getName() +" and foun is health is good");
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
