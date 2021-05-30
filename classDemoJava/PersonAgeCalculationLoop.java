package arraysDemo;
import java.util.Scanner; 
public class PersonAgeCalculationLoop {

	public static void main(String[] args) {
		    int count = 0;
	// Count means how many index will be created and  how many values will be inserted in the array index
 System.out.println (" Hello User Create number of array index you wish to: " );
		 
        Scanner keyboard = new Scanner (System.in);
            int [] array = new int [count];
            count=keyboard.nextInt ();
            
		 for ( int index = 0 ; index < count; index++) {
		System.out.println (" Hello User insert the data element into the index " + (index+1)  + " value: ");
		array[index] = new Scanner (System.in).nextInt();
		}
		 
		 for ( int index = 0 ; index < count; index++)
		   {

		   System.out.println (" Array index  " + (index + 1) + " value is :");
		     
		   System.out.println (array[index]);
		   
		   }
		
	}
}
