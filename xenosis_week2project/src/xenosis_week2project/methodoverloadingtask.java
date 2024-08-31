package xenosis_week2project;

import xenosisinternshipprojectpackage.Calculate;

class Calculate
{
	double length;
	double width;
	
	Calculate()
	{
		length=8;
		width=9;
	}
	
	Calculate(double length,double width)
	{
		length=5;
		width=5;
	}
	
	void areaofsquare()
	{
		double result=length*length;
		System.out.println("area of square is="+result);
	}
	
	void areaofsquare(double length,double width)
	{
		double result=length*width;
		System.out.println("area of square is="+result);
	}
}

public class methodoverloadingtask {

	public static void main(String[] args) 
	{
		 Calculate obj=new Calculate();
	      obj.areaofsquare();
	      
	      Calculate obj1=new Calculate();
	      obj1.areaofsquare(5,5);

	}

}
