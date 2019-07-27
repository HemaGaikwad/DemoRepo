
class VariableTypes
{
	int roll;				//instance variables
	String name;
	static String college = "xyz";
	//final int  PI = 3.14;

	void add()
	{
		int a = 10, b = 20;      //local variables
		System.out.println(a+b);
	}
	
	public static void main(String args[])
	{
		VariableTypes v = new VariableTypes();				//object instantiation
		v.roll = 11;
		v.name = "abc";
	
		
		System.out.println(v.roll);
		System.out.println(v.name);
		System.out.println(VariableTypes.college);
		
		VariableTypes v1 = new VariableTypes();	
		v1.roll = 12;
		v1.name = "def";
		
		System.out.println(v1.roll);
		System.out.println(v1.name);
		System.out.println(VariableTypes.college);
		
		college ="ghi";
		VariableTypes v2 = new VariableTypes();	
		v2.roll = 13;
		v2.name = "dhsgdjgsa";
		
		System.out.println(v2.roll);
		System.out.println(v2.name);
		System.out.println(v2.college);
		
	}
}

/*
local variables
instance variables or global variables or fields or attributes or data
static variables
final variables or constants
*/