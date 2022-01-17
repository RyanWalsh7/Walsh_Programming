//Author Name: Ryan Walsh
//Date: 01/17/2022
//Program Name: Walsh_SpellCheck
//Purpose: Spell check of a reference file against a dictionary file
import java.io.*;
import java.util.*;
public class Walsh_SpellCheck 
{
	public static void main(String[] args) throws Exception
	{
		//uses scanner input from keyboard and gets it ready to call the dictionary file
		 String dictFile;
		System.out.println("Enter file name for the dictionary file: ");				
		java.util.Scanner write = new Scanner(System.in);
	    dictFile = write.nextLine();	    
	    
	    //reads file specified by the user input above, then reads it off in a loop and writes it as a string to an arraylist
	    BufferedReader dictReader = new BufferedReader(new FileReader(dictFile));
	    ArrayList<String> dictionary = new ArrayList<>();
	    String line = dictReader.readLine();
	    while (line != null)
	    { 
	    	dictionary.add(line);
	    	line = dictReader.readLine(); 
	    }
	    dictReader.close();
	    
	    //uses scanner input from keyboard and gets it ready to call the testStates file
	    String checkFile;
		System.out.println("Enter file name for the testStates file: ");				
	    checkFile = write.nextLine();	    
	    
	    //reads file specified by the user input above, then reads it off in a loop and writes it as a string to an arraylist
	    BufferedReader checkReader = new BufferedReader(new FileReader(checkFile));
	    ArrayList<String> testStates = new ArrayList<>();
	    String states = checkReader.readLine();
	    while (states != null)
	    { 
	    	testStates.add(states);
	    	states = checkReader.readLine();
	    }
	    checkReader.close();
	    
	    String z = new String();
	    
	    //compares each file and determines whether or not there is a matching corresponding word, if not then it prints it out
	    for (int ctr = 0; ctr < testStates.size(); ctr++)
	    {
	    	z = testStates.get(ctr);
	    	
	    	if (!dictionary.contains(z))
	    	{
	    		System.out.println(z + " : unknown word");    
	    	}
	    }

	}
	
}
