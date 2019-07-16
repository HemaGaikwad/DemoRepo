public class IfElseDemo
{
	public static void main(String args[])
	{
		int age = Integer.parseInt(args[0]);
		
		if(age >= 18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("you are not eligible to vote");
		}
	}
}