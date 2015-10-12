import java.io.Console;
import java.util.Scanner;
import org.junit.Test;

import static org.junit.Assert.*;

public class Assignment1 {

	/*
	public static void main(String[] args) {

	 String test2222 ="test22222";
	
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Side A: \n");
		String input = in.nextLine();
		System.out.println("Enter Side B: \n");
		String input2 = in.nextLine();
		System.out.println("Enter Side C: \n");
		String input3 = in.nextLine();
		try 
		{
		double double_input = Double.parseDouble(input);
		double double_input2 = Double.parseDouble(input2);
		double double_input3 = Double.parseDouble(input3);
		
		Assignment1 test = new Assignment1();

		String test2 = test.Triangle(double_input, double_input2, double_input3);
		
		System.out.println(test2);
		in.close();
		System.exit(0);
		}
		catch (NumberFormatException ignore) 
		{
		
			System.out.println("MUST ENTER NUMBERS");
			in.close();
			System.exit(0);
		}
	}
	*/
	//my new change
	

		
		//my functions
		//test
		//
		//test 8:07PM adding commit
		//test 8:18PM commit
		
	/*	public boolean TestInteger(int arg){
			
			if (arg == 1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}*/
		
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
			
			if (side_one<0 | side_two<0 | side_three <0){
				return "Error with Inputs";
			}
			
			
			//triangle inequality theorem -- constraint/assumption
			if ((side_one + side_two > side_three) && (
			side_two + side_three > side_one) && (
			side_three + side_one > side_two)){
				
				//System.out.println("Executing program...");
				
			}
			else
			{
				//System.out.println("invalid triangle");
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
			String e = "";
			
			
			//test if right triangle
			boolean right_triangle = false;
			if (Math.max(side_one, Math.max(side_two, side_three)) == side_three)
			{
					 right_triangle = ( Math.round(side_one*side_one) +  Math.round(side_two*side_two) == Math.round(side_three*side_three));
					 
					// System.out.println("side 3 is the biggest");
					// System.out.println("Side 1 Squared" + side_one * side_one);
					// System.out.println("Side 2 Squared" + side_two * side_two);
					// System.out.println("Side 3 Squared" + side_three * side_three);
					// System.out.println("Right Triangle: " + right_triangle);
					 
			}
			else
			{
				if (Math.max(side_one, Math.max(side_two,side_three)) == side_one) {
					 right_triangle = ( Math.round(side_one*side_one) ==  Math.round(side_two*side_two) +  Math.round(side_three*side_three));
				//	 System.out.println("side 1 is the biggest");
				//	 System.out.println("Right Triangle: " + right_triangle);
					 
				}
				else
					if (Math.max(side_one, Math.max(side_two,side_three)) == side_two) 
					{
						 right_triangle = ( Math.round(side_one*side_one) +  Math.round(side_three*side_three) ==  Math.round(side_two*side_two) );
					//	 System.out.println("side 2 is the biggest");
					//	 System.out.println("Right Triangle: " + right_triangle);
						 
					}
					else 
					{
				///	 System.out.println("error");
						return "error";
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
			
			//System.out.println( right + " " + triangle_type);
			return right + " " + triangle_type;
			
			}

		


	
		//junit test
		@Test
		public void myTestMethod (){
			System.out.println("\n");
			System.out.println("Executing Test 1:");
			assertEquals("not right isosceles triangle", Triangle(6, 6, 4));
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
			assertEquals("invalid triangle", Triangle(1,2,3));
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
		@Test
			public void myAssignment2Test1 (){
				System.out.println("\n");
				System.out.println("Executing Test 5:");
				assertEquals("Error with Inputs", Triangle(1,-1, 1 ));
			}
		@Test
				public void myAssignment2Test2 (){
					System.out.println("\n");
					System.out.println("Executing Test 5:");
					assertEquals("invalid triangle", Triangle(2,4,6 ));
				}
		@Test
					public void myAssignment2Test3 (){
						System.out.println("\n");
						System.out.println("Executing Test 5:");
						assertEquals("right isosceles triangle", Triangle(1, 1, Math.sqrt(2) ));
					}
		
		@Test
		public void myAssignment2Team4Test1 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("Error with Inputs", Triangle(-1, 0, 99999 ));
		}
		@Test
		public void myAssignment2Team4Test2 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("invalid triangle", Triangle(1, 1, 2.1 )); //changed input1 A to 1, because test case does not follow requirements
		}
		
		@Test
		public void myAssignment2Team4Test3 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("invalid triangle", Triangle(0,0,0 ));
		}
		@Test
		public void myAssignment2Team5Test1 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("right scalene triangle", Triangle(3,4,5 ));
		}
		@Test
		public void myAssignment2Team5Test2 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("not right equilateral triangle", Triangle( (2^31)-1, (2^31)-1, (2^31)-1 ));
		}
		@Test
		public void myAssignment2Team5Test3 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("invalid triangle", Triangle(100,100,1000 ));
		}
		
		@Test
		public void myAssignment2Team6Test1 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("invalid triangle", Triangle(5,10,20 ));
		}
		@Test
		public void myAssignment2Team6Test2 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("invalid triangle", Triangle( 5, 6, 1)); //must provide 3 sides
		}
		@Test
		public void myAssignment2Team6Test3 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("invalid triangle", Triangle(5, 10, 20));
		}
		@Test
		public void myAssignment2Team2Test1 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("invalid triangle", Triangle(0,0,0 )); //apple, bat, cod can't be entered here
		}
		@Test
		public void myAssignment2Team2Test2 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("Error with Inputs", Triangle( -5.4, .5, (2/3) ) ); 
		}
		@Test
		public void myAssignment2Team2Test3 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("invalid triangle", Triangle(3,9,3));
		}
		@Test
		public void myAssignment2Team1Test1 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("not right scalene triangle", Triangle(534541,454551,455531 ));
		}
		@Test
		public void myAssignment2Team1Test2 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("right isosceles triangle", Triangle( 0.12332,0.12332, 0.12312) ); 
		}
		@Test
		public void myAssignment2Team1Test3 (){
			System.out.println("\n");
			System.out.println("Executing Test 5:");
			assertEquals("invalid triangle", Triangle(1,2,50));
		}
		@Test
		public void codecoverage1 (){
			assertEquals("right scalene triangle", Triangle(3,5,4));
		}
		@Test
		public void equivalenceexternaltesting1 (){
			assertEquals("not right equilateral triangle", Triangle(3,3,3));
		}
		
		@Test
		public void equivalenceexternaltesting2 (){
			assertEquals("not right isosceles triangle", Triangle(6,6,4));
		}
		
		@Test
		public void equivalenceexternaltesting3 (){
			assertEquals("invalid triangle", Triangle(12,8,4));
		}
		
		@Test
		public void equivalenceexternaltesting4 (){
			assertEquals("invalid triangle", Triangle(3,1,2));
		}
		
		@Test
		public void equivalenceexternaltesting5 (){
			assertEquals("Error with Inputs", Triangle(1,-1,1));
		}
		
		@Test
		public void equivalenceexternaltesting6 (){
			assertEquals("invalid triangle", Triangle(2,4,6));
		}
		@Test
		public void equivalenceexternaltesting7 (){
			assertEquals("invalid triangle", Triangle(5,10,20));
		}
		@Test
		public void equivalenceexternaltesting8 (){
			assertEquals("invalid triangle", Triangle(5,6,1));
		}
		@Test
		public void equivalenceexternaltesting9 (){
			assertEquals("invalid triangle", Triangle(1,2,50));
		}		
		
	}



