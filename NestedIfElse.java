public class NestedIfElse
{
	public static void main(String args[])
	{
		int marks = Integer.parseInt(args[0]);
		
		if(marks >= 75 && marks <=100)
		{
			System.out.println("Distinction");
		}
		
		else if(marks >= 60 && marks < 75)
		{
			System.out.println("First grade");
		}
		
		else if(marks > 50 && marks < 60)
		{
			System.out.println("Second grade");
		}
		else if(marks >=35 && marks < 50)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}