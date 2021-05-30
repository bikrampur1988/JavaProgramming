	package classDemo;

	public class AdvanceCalculator {
	String name = "Amin" ;
	String hobby = "Study" ;
	
	
	// Static method including "void" return type ; there is no result will be executed. 
	// Static method can be called by class name
		// Example it can be called by calling class name- "AdvancedCalculator.addition();
	
	public static void addition()
	
	{
	int a = 240;
	int b = 320;
	int add = a +b;
	
	System.out.println ("The both number performs as addition:" + add);
		
		
	}
	
	// Static method including "void" return type ; there is no result will be executed.
	// Static method can be called by class name
	// Example it can be called by calling "AdvancedCalculator.sub();
	
	public static void sub()
	
	{
	int a = 240;
	int b = 320;
	int subtract = b-a;
	
	System.out.println ("The both number performs as subtraction:" + subtract);
		
		
	}


}
