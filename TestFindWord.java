import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestFindWord {
	
	@Test
	void testShiftArrayPositive() {
		
		
		char[][] input = {{ 'z', 'e', 'z'},
						  { 'w', 'n', 'a'},
						  { 'n', 'q', 'b'}};
		
		char[][] expOutput = {{ 'a', 'f', 'a'},
				 		   	  { 'x', 'o', 'b'},
				 		   	  { 'o', 'r', 'c'}};
		
		FindWord fw = new FindWord(3,3);
		assertTrue(Arrays.deepEquals(fw.shiftChars(input), expOutput));
	}
	
	@Test
	void testShiftArrayNegative() {
		
		
		char[][] input = {{ 'z', 'e', 'z'},
						  { 'w', 'n', 'a'},
						  { 'n', 'q', 'b'}};
		
		char[][] expOutput = {{ 'a', 'f', 'a'},
				 		   	  { 'x', 'o', 'b'},
				 		   	  { 'c', 'r', 'c'}};
		
		FindWord fw = new FindWord(3,3);
		assertFalse(Arrays.deepEquals(fw.shiftChars(input), expOutput));
	}
	
	@Test
	void testSearchRemainingPositive() {
		
		char[][] grid = {{ 'a', 'f', 'a'},
						 { 'x', 'o', 'b'},
	 		   	  		 { 'o', 'r', 'c'}};
		
		FindWord fw = new FindWord(3,3);
		assertEquals(true, fw.searchRemaining(grid, 0, 1, "for"));
	}
	
	@Test
	void testSearchRemainingNegative() {
		
		char[][] grid = {{ 'a', 'f', 'a'},
						 { 'x', 'o', 'b'},
	 		   	  		 { 'o', 'r', 'c'}};
		
		FindWord fw = new FindWord(3,3);
		assertEquals(false, fw.searchRemaining(grid, 0, 1, "foo"));
	}
	
	@Test
	void testSearchRemainingNegativeFirstChar() {
		
		char[][] grid = {{ 'a', 'f', 'a'},
						 { 'x', 'o', 'b'},
	 		   	  		 { 'o', 'r', 'c'}};
		
		FindWord fw = new FindWord(3,3);
		assertEquals(false, fw.searchRemaining(grid, 0, 1, "pop"));
	}
	
	@Test
	void testPatternSearchPositive() {
		
		char[][] grid = {{ 'z', 'e', 'y'},
				  		 { 'w', 'n', 'z'},
				  		 { 'n', 'q', 'a'}};
		
		FindWord fw = new FindWord(3,3);
		String word = "qrs";
		int[] retVals = fw.patternSearch(grid, word);
		assertEquals(2, retVals[0]);
		assertEquals(0, retVals[1]);
		assertEquals(18, retVals[2]);
	}
	
	@Test
	void testPatternSearchNegative() {
		
		char[][] grid = {{ 'z', 'e', 'y'},
				  		 { 'w', 'n', 'z'},
				  		 { 'n', 'q', 'a'}};
		
		FindWord fw = new FindWord(3,3);
		String word = "zxp";
		int[] retVals = fw.patternSearch(grid, word);
		assertEquals(-1, retVals[0]);
		assertEquals(-1, retVals[1]);
		assertEquals(-1, retVals[2]);
	}
}
