public class LabelledBreak
{
	public static void main(String args[])
	{
		demo:for(int i = 0; i< 5; i++)
		{
			for(int j = 0; j<3; j++)
			{
				if(i == 2 && j == 1) 
				{
					break demo;
				}
				System.out.println("i = "+i +"  j = "+j);
			}
		}
	}
}
//modified after staging