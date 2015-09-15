import org.junit.Test;

import static org.junit.Assert.*;

public class Assignment1 

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
				return "invalid triangle";
				
				//System.exit(0);
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
					 right_triangle = ( Math.round(side_one*side_one) +  Math.round(side_two*side_two) == Math.round(side_three*side_three));
					 
					 System.out.println("side 3 is the biggest");
					 System.out.println("Side 1 Squared" + side_one * side_one);
					 System.out.println("Side 2 Squared" + side_two * side_two);
					 System.out.println("Side 3 Squared" + side_three * side_three);
					 System.out.println("Right Triangle: " + right_triangle);
					 
			}
			else
			{
				if (Math.max(side_one, Math.max(side_two,side_three)) == side_one) {
					 right_triangle = ( Math.round(side_one*side_one) ==  Math.round(side_two*side_two) +  Math.round(side_three*side_three));
					 System.out.println("side 1 is the biggest");
					 System.out.println("Right Triangle: " + right_triangle);
					 
				}
				else
					if (Math.max(side_one, Math.max(side_two,side_three)) == side_two) 
					{
						 right_triangle = ( Math.round(side_one*side_one) +  Math.round(side_three*side_three) ==  Math.round(side_two*side_two) );
						 System.out.println("side 2 is the biggest");
						 System.out.println("Right Triangle: " + right_triangle);
						 
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
			
			System.out.println( right + " " + triangle_type);
			return right + " " + triangle_type;
				
		}
		
		
		//junit test
		@Test
		public void myTestMethod (){
			System.out.println("\n");
			System.out.println("Executing Test 1:");
			assertEquals("right scalene triangle", Triangle(3,4,5));
			System.out.println("\n");
			
		}
		@Test
		public void myTestMethod2 (){
			System.out.println("\n");
			System.out.println("Executing Test 2:");
			assertEquals("invalid triangle", Triangle(3,1,2));
			System.out.println("\n");
		}
		
		@Test
		public void myTestMethod3 (){
			System.out.println("\n");
			System.out.println("Executing Test 3:");
			assertEquals("right isosceles triangle", Triangle(3,1,2));
			System.out.println("\n");
			
		}

		@Test
		public void myTestMethod4 (){
			System.out.println("\n");
			System.out.println("Executing Test 4:");
			assertEquals("not right equilateral triangle", Triangle(3,3,3));
			
		}
		
		@Test
		public void myTestMethod5 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("right isosceles triangle", Triangle(1.00,1.00, Math.sqrt(2) ));
			
		}
	}


