	package classDemo;

	// create class with declaring access modifier

	public class FirstclassDemo

		{
	//create some data member / properties
		//State;
				int x = 120;
				int y = 520;
				double q = (x+y)/10*5-x ;
	
	// main public static void always needed.
	
		public static void main(String[] args) 
	
	{
				
		System.out.println ("program Started");
		
		FirstclassDemo obj1 = new FirstclassDemo();	
		
		// creating obj1 object, calling one method called sum;
		
		obj1.sum();
		
		System.out.println ("First x value is: " + obj1.x);
		System.out.println ("Y value is: " + obj1.y);
		System.out.println ("The calculation of q value is: " + obj1.q);
		
		System.out.println ("program End");
	}
	
	
// create method for to do some task 
	// first declare types of method Static/ none static
	public void sum () 
	
	{
		// Behavior;
		// To call this method need to create a object because nothing is in the 
		// memory
		int a = 120;
		int b = 150;
		int c = a+b;
		System.out.println ("The some of the both number is : " + c);	
		
		System.out.println ("The some of the both number is : " + a);	
		
		System.out.println ("The some of the both number is : " + b);	
		
			
	}
	
			
}
