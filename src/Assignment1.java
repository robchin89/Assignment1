import org.junit.Test;
import static org.junit.Assert.*;

public class Assignment1 {

	//public static void main(String[] args) {

	//}
	

		
		//my functions
		//test
		//
		//test 8:07PM adding commit
		//test 8:18PM commit
		
		public boolean TestInteger(int arg){
			
			if (arg == 1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		// a program reads three numbers.
		//
		// the three numbers represent the lengths of the sides of a triangle
		//
		// it prints a message that states whether it's
		// 1. scalene - no sides equal
		// 2. isosceles  - 2 sides equal
		// 3. equilateral - all sides equal
		
		public String Triangle(double side_one, double side_two, double side_three)
		{
			//triangle inequality theorem -- constraint/assumption
			if ((side_one + side_two > side_three) && (
			side_two + side_three > side_one) && (
			side_three + side_one > side_two)){
				
				System.out.println("Executing program...");
				
			}
			else
			{
				System.out.println("invalid triangle");
				System.exit(0);
			}
		
			
			
			String triangle_type = "";
			
			if ((side_one == side_two) && (side_one == side_three)) 
			{
				triangle_type = "equilateral triangle";
			}
			else
				if (((side_one == side_two) && (side_one != side_three)) || ((side_one != side_two) && (side_one == side_three)) ) {
				
					triangle_type = "isosceles triangle";
				}
				else
					if ((side_one != side_two) && (side_one != side_three)) {
						triangle_type = "scalene triangle";
					}
					else
					{
						triangle_type = "error";
					}
			
			String right = "";
			
			
			//test if right triangle
			boolean right_triangle = false;
			if (Math.max(side_one, Math.max(side_two, side_three)) == side_three)
			{
					 right_triangle = ((side_one*side_one) + (side_two*side_two) == (side_three*side_three));
			}
			else
			{
				if (Math.max(side_one, Math.max(side_two,side_three)) == side_one) {
					 right_triangle = ((side_one*side_one) == (side_two*side_two) + (side_three*side_three));
				}
				else
					if (Math.max(side_one, Math.max(side_two,side_three)) == side_two) 
					{
						 right_triangle = ((side_one*side_one) + (side_three*side_three) == (side_two*side_two) );
					}
					else 
					{
					 System.out.println("error");
					}
			}		
				
			if(right_triangle)
			{
				 right = "right";
			}
			else
			{
				 right ="not right";
			}
			
			
			return right + " " + triangle_type;
				
		}
		
		
		//junit test
		@Test
		public void myTestMethod (){
			assertEquals("right scalene triangle", Triangle(3,4,5));
		}


	}


