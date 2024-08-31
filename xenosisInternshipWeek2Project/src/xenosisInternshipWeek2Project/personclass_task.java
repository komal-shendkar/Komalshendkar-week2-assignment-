package xenosisInternshipWeek2Project;


class person
{
	String name;
	int age;
	
	void display(String name,int age)
	{
		System.out.println("Name is="+name);
		System.out.println("Age is="+age);
	}
}

public class personclass_task {

	public static void main(String[] args) 
	{
	
		person obj=new person();
        obj.display("xenosis",20);
	}

}
