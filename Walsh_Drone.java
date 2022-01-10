//Author Name: Ryan Walsh
//Date: 01/10/2022
//Program Name: Walsh_Drone
//Purpose: Simulation using button, drone movement in x, y,z location
import java.util.*;
import java.util.Scanner;

public class Walsh_Drone 
{

	public static void main(String[] args) 
	{
		//list that contains possible orientations
		ArrayList<String> ori = new ArrayList<String>();
		ori.add("North");
		ori.add("East");
		ori.add("South");
		ori.add("West");
		
		int index = 0;
		
			int input1;
			do
			{
				//menu where scanner reads the users choice
				Scanner input = new Scanner(System.in);
				System.out.println("Which direction would you like to move the drone?");
				System.out.println("1 - Move Up");
				System.out.println("2 - Move Down");
				System.out.println("3 - Move Forward");
				System.out.println("4 - Move Backwards");
				System.out.println("5 - Turn Left");
				System.out.println("6 - Turn Right");
				System.out.println("7 - Display Position");
				System.out.println("8 - Exit Navigation");
			
				input1 = input.nextInt();
			
				input.nextLine();
				
				//handles invalid number inputs
				if (input1 > 8) 
				{
					System.out.println("invalid input");
					System.out.println();
				}
			
				else if (input1 < 1)
				{
					System.out.println("invalid input");
					System.out.println();
				}
				
				//handles user input for menu options
				else if (input1 == 1) 
				{
					//increase y coordinate
					GlobalCoordinates.z_pos++;
					
					System.out.println("You have moved up");
					System.out.println();
				}					
			    else if (input1 ==2) 
			    {
			    	//decrease y coordinate
					GlobalCoordinates.z_pos--;
					
					System.out.println("You have moved down");
					System.out.println();
			    }
			
			    else if (input1 == 3) 
			    {
			    	if (index == 0)
			    	{
			    		//when pointing north forwards increases y coordinate
			    		
						GlobalCoordinates.y_pos++;
						
			    	}
			    	else if (index == 1)
			    	{
			    		//when pointing east forwards increases x coordinate
			    		
						GlobalCoordinates.x_pos++;
						
			    	}
			    	else if (index == 2)
			    	{
			    		//when pointing south forwards decreases y coordinate
			    		
						GlobalCoordinates.y_pos--;
						
			    	}
			    	else if (index == 3)
			    	{
			    		//when pointing west forwards decreases x coordinate
			    		
						GlobalCoordinates.x_pos--;
						
			    	}
			    	System.out.println("You have moved fowards");
			    	System.out.println();
			    }
			
			    else if (input1 == 4) 
			    {
			    	if (index == 0)
			    	{
			    		//when pointing north backwards decreases y coordinate
			    		
						GlobalCoordinates.y_pos--;
						
			    	}
			    	else if (index == 1)
			    	{
			    		//when pointing east backwards decreases x coordinate
			    		
						GlobalCoordinates.x_pos--;
						
			    	}
			    	else if (index == 2)
			    	{
			    		//when pointing south backwards increases y coordinate
			    		
						GlobalCoordinates.y_pos++;
						
			    	}
			    	else if (index == 3)
			    	{
			    		//when pointing west backwards increases x coordinate
			    		
						GlobalCoordinates.x_pos++;
						
			    	}
			    	System.out.println("You have moved backwards");
			    	System.out.println();
			    }
				
			    else if (input1 == 5) 
			    {
			    	
			    	if (index == 0)
			    	{
			    		//goes from north to west
			    		index = 3;
			    		
			    	}
			    	else
			    	{
			    	
			    	index--; //increment value to next orientation on the list
		
			    	}
			    	System.out.println("You have turned left");
			    	System.out.println();
			    }
				
			    else if (input1 == 6) 
			    {
			    	
			    	if (index == 3)
			    	{
			    		//goes from west to north
			    		index = 0;
			    		
			    	}
			    	else
			    	{
			    	
			    	index++; //increment value to next orientation on the list
			    
			    	}
			    	System.out.println("You have turned right");
			    	System.out.println();	
			    }
				
			    else if (input1 == 7) 
			    {
			    	//displays current position
			    	System.out.println("X coordinates:");
			    	System.out.println( GlobalCoordinates.x_pos);
			    	System.out.println("Y coordinates:");
			    	System.out.println(GlobalCoordinates.y_pos);
			    	System.out.println("Z coordinates:");
			    	System.out.println(GlobalCoordinates.z_pos);
			    	System.out.println("Direction:");
			    	System.out.println(ori.get(index));
			    	System.out.println();
			    }
				
		}
		while(input1 != 8);
			
			//exit
			System.out.println("Thank you for using the Drone Application, Goodbye.");
		

	}
	
	public static class GlobalCoordinates
	{
	  //position variables to be manipulated from outside of this class
	  static int x_pos = 0;
	  static int y_pos = 0;
	  static int z_pos = 0;
	}
}
