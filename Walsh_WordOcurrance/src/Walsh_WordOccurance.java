//Author Name: Ryan Walsh
//Date: 03/03/2022
//Program Name: Walsh_WordOccurance
//Purpose: To create a GUI where users are shown the word occurrences of a play

import static org.junit.Assert.assertEquals;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import javax.swing.*;

import org.junit.jupiter.api.Test;
/**
 * 
 * @author Ryan Walsh
 *
 */
public class Walsh_WordOccurance extends JFrame
{

	static ArrayList<Map.Entry<String, Integer>> sortedList;
	//Since we are reading a file, FileNotFoundException 
	//is thrown in multiple places to ensure issue handling
/**
 * 	Creates JPanel layout, sizing, title, and default close operation.
 * @throws FileNotFoundException Issue handled if file is not found.
 */
   public Walsh_WordOccurance() throws FileNotFoundException 
   {
	   //Creates JPanel, layout, sizing, title, and default close operation
      setTitle("Word Occurrences");
      setLayout(new BorderLayout());
      JPanel panel = createPanel();
     add(BorderLayout.CENTER, new JScrollPane(panel));
      setSize(375, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   /**
    * Creates JPanel, reads file, maps word occurrences, and sorts the map.
    * @return Scroll panel with sorted list of word occurrences.   
    * @throws FileNotFoundException Exception is handled in case the file to count word occurrences is not found.
    */
   public static JPanel createPanel() throws FileNotFoundException 
   {
      JPanel panel = new JPanel();
      //Scroll panel set up with 5360 rows, 1 column, 
      //and the height and width difference is 1
      panel.setLayout(new GridLayout(5360, 1, 1, 1));
      

      //Reads the file containing the play
      File file = new File("play.txt");
      Scanner scanner = new Scanner(file);
      
     //A map to store the word (string), and the occurrence of the word (integer)
      Map<String,Integer> occuranceMap = new HashMap<String, Integer>(); 
      while (scanner.hasNext())
      {
    	  //Reads file while there is another line
          String val = scanner.next();
          
          //If there are not yet any duplicates, then when added to the map, 
          //the value is not increased, instead set to 1
          if(occuranceMap.containsKey(val) == false)
              occuranceMap.put(val,1);
          
          //Adds the frequency to the occuranceMap by replacing 
          //existing frequency value by re inserting the word and increasing the frequency 1
          else // otherwise remove the entry from occuranceMap and again insert by adding 1 in the frequency
          {
              int count = (int)(occuranceMap.get(val));
              occuranceMap.remove(val);
              occuranceMap.put(val,count+1);
          }
      }
      //Returns a set view of the occuranceMappings contained in this occuranceMap
      Set<Map.Entry<String, Integer>> set = occuranceMap.entrySet();
      
      //Converts set into an array list
     sortedList = new ArrayList<Map.Entry<String, Integer>>(set);
      
      //Sort the array list
      Collections.sort( sortedList, new Comparator<Map.Entry<String, Integer>>()
      {
    	  //Compare function to sort
          public int compare( Map.Entry<String, Integer> x, Map.Entry<String, Integer> y )
          {
              return (y.getValue()).compareTo( x.getValue() );
 
          }
        
          
      } );
      
      //Print the list in the GUI
     
      for(Map.Entry<String, Integer> i:sortedList){
    	 
    	  JLabel label = new JLabel("'" + i.getKey() + "' has occurred " + i.getValue() + " times");
    	  panel.add(label);
      }
     
      return panel;
   }
  /**
   *  Word occurrences map is inputed.
   * @return Returns sorted list.
   */
  public ArrayList<Map.Entry<String, Integer>> getList()
  {
	  return sortedList;
  }
   
  /**
   * Executes the program.
   * @param args Main method.
   * @throws FileNotFoundException Exception is handled in case the file to count word occurrences is not found.
   */
   public static void main(String [] args) throws FileNotFoundException 
   {
	 //Main method implements the GUI method
	 
      new Walsh_WordOccurance();
   }

}