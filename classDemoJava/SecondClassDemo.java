	package classDemo;

		public class SecondClassDemo {

	public static void main(String[] args) {
		
			Calculator obj2 = new Calculator();
				obj2.addition();
				obj2.sub();
		
		
				System.out.println ("The name of the person is: " + obj2.name);
		
					System.out.println ("The name of the person is: " + obj2.hobby);
		
	FirstclassDemo obj1 = new FirstclassDemo();	
	
	// line 20 to 22 are directly called from properties of the "FirstlassDemo" 
	// The reason to use System.out.println class because there is no any method is created for this. 
	//called from properties. 
	// Line 27 called from one of the created methods.
		
			System.out.println ("First x value is: " + obj1.x);
				System.out.println ("Y value is: " + obj1.y);
					System.out.println ("The calculation of q value is: " + obj1.q);
		 
						obj1.sum();
		
		
	}

}
