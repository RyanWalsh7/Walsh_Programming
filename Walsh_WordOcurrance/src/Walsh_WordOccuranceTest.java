//Author Name: Ryan Walsh
//Date: 03/07/2022
//Program Name: Walsh_WordOccuranceTest
//Purpose: To create a Junit test cases for the word occurrences class
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

class Walsh_WordOccuranceTest {

		//declare arraylists that can hold the original contents from the word occurrences file
		//arraylists to be compared
		ArrayList<Entry<String,Integer>> detailsActual = new ArrayList<>();
		ArrayList<Entry<String,Integer>> detailsExpected = new ArrayList<>();
		
	@Test
	public void test() throws FileNotFoundException {
	
		//creates new test case and assigns the original word occurrence list
		//to each arraylist for testing
		Walsh_WordOccurance test = new Walsh_WordOccurance();
		detailsActual = test.getList();
		detailsExpected = test.getList();
		
		
		//assert method that compares arraylists to see if they are equal
		assertEquals(detailsActual, detailsExpected);
		
	}
	
	@Test
	public void test2() throws FileNotFoundException {

		Walsh_WordOccurance test = new Walsh_WordOccurance();
		detailsActual = test.getList();
		detailsExpected = test.getList();
		
		//assert method that compares arraylists to see if they are Java's definition of the same
		assertSame(detailsActual, detailsExpected);
		
	}
	
	@Test
	public void test3() throws FileNotFoundException {
	
		Walsh_WordOccurance test = new Walsh_WordOccurance();
		detailsActual = test.getList();
		detailsExpected = test.getList();
		
		//assert method that compares arraylists to see if they are not the same
		assertNotSame(detailsActual, detailsExpected);
		
	}
	
	@Test
	public void test4() throws FileNotFoundException {
	
		Walsh_WordOccurance test = new Walsh_WordOccurance();
		detailsActual = test.getList();
		detailsExpected = test.getList();
		
		//assert method that determines if the specified arraylist is null
		assertNull(detailsActual);
		
	}
	
	@Test
	public void test5() throws FileNotFoundException {
	
		Walsh_WordOccurance test = new Walsh_WordOccurance();
		detailsActual = test.getList();
		detailsExpected = test.getList();
		
		//assert method that determines if the specified arraylist is not null
		assertNotNull(detailsActual);
		
	}
	
	@Test
	public void test6() throws FileNotFoundException {
	
		Walsh_WordOccurance test = new Walsh_WordOccurance();
		detailsActual = test.getList();
		detailsExpected = test.getList();
		
		//assert method that determines if the specified arraylist contains the string "string"
		assertTrue(detailsActual.contains("string"));
		
	}

}
