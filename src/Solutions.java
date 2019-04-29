package mural;

import java.util.Scanner;
import java.lang.*; 

public class Solutions {

	public static void main(String[] args)
	{

		// initialize scanner for collecting userinput
		Scanner UserInputScanner = new Scanner(System.in); 
		 
		int T = 0;  // Number of tests
		int N = 0;  // Number of wall sections
		int B = 0;  // Beauty score of mural?		
		

		int[] intSquaresArray; // Squares?
		int[] intBeautyArray; // Beauty Scores?	
		
		int Q = 0;  // programs guess
		String UserInput = "";
		String Judge_Response = "";  // programs guess
		int myguess = 0;
		int mytemp = 0;
		int x=0;
		int i=0;
		int beauty_score_total=0;
		int tempHi = 0;
		int temp = 0;
		int z=0;
		
		//The first line of the input gives the number of test cases, T.
		UserInput = UserInputScanner.next();
		if(UserInput.matches("-?\\d+(\\.\\d+)?")){T = Integer.parseInt(UserInput);}
		// https://www.baeldung.com/java-check-string-number
		// number of tests
		
		for(i=1; i>=T; i++)
		{
			// 		Each test case starts with a line containing an integer N. 
			UserInput = UserInputScanner.next();
			if(UserInput.matches("-?\\d+(\\.\\d+)?")){N = Integer.parseInt(UserInput);}
			// number of sections
			
			if(N > 0)
			{	
				// possible fix me, might need to change to N+1
				intSquaresArray = new int[N]; // Squares?  
				intBeautyArray = new int[N]; // Beauty Scores?	
			}
			else
			{
				intSquaresArray = new int[N]; // Squares?
				intBeautyArray = new int[N]; // Beauty Scores?	
			}
				
			//Then, another line follows containing a string of N digits from 0 to 9. 
			//The i-th digit represents the beauty score of the i-th section of the wall.			 
			UserInput = UserInputScanner.next();
			if(UserInput.matches("-?\\d+(\\.\\d+)?"))
			{					
				for(z=0; z<UserInput.length(); z++)
				{	
					intSquaresArray[z] = 0;// Build the squares
					intBeautyArray[z] = UserInput.charAt(z);// Record scores?
				}					
			}
			
			for(x=0; x<N; x++)
			{	
				//Day one. 
				//Artist selects random section of wall. (0-9)
				// check for greatest beauty score
				for(int y=0; y<N; y++)
				{
					tempHi = 0;
					temp = 0;
					if(intBeautyArray[y] > temp) 
					{
						tempHi = y;
					}
					else
					{
						temp = y;
					}//end else
				}// end for
				//Artist paints section of wall.
				intSquaresArray[tempHi] = 1; 
				
				//Painted section has a beauty score.
				beauty_score_total = beauty_score_total + intBeautyArray[tempHi];
				
				//End of day one section is destroyed (and must be the high or low of sections), but not a painted section.
				for(int c=0;c<N; c++)
				{
					if(intSquaresArray[c]!= 1)
					{
						
					}	
				} 
				
				//Day two to nine
				//Artist selection section adjacent to previous days wall section
				//Artist paints section of wall. 
				//Painted section has a beauty score.
				//End of day one section is destroyed (and must be the high or low of sections), but not a painted section.
			 
				//Repeat until all connected sections are painted or destroyed.
			}// end for
			
			//Sum beauty scores.
			//B is the expected score.
			//What is the maximum score possible?			
 
			System.out.println("Case #" + i + ": " + beauty_score_total);
			beauty_score_total=0;
			
		}// end for		
	} // end main
} // end solution
