	package compileTimePolymorphism;

	   public class CompileDemo {

	     public static void main(String[] args) {
	
	    	 CompileDemo obj1 = new CompileDemo();
	    	 obj1.add(40,45);
	    	 
	    	 obj1.add(40,45,1225);
	    	 
	    	 obj1.add(40,45.45);
	}
	
	
       public void add(int a ,int b)

       {
	
        int c = a+b;
        System.out.println("Sume of the two number is :" + c);

       	}
	
       public void add(int a ,int b,int d)

       {
	
        int c = a+b+d;
        System.out.println("Sume of the three number is :" + c);

       	}
	
       public void add(int e , double f)

       {
	
        double c = e+f;
        System.out.println("Sume of the two number is :" + c);

       	}
	
       

}
