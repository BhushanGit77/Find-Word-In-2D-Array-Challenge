public class FindWord {
	
	int objRow, objColumn;
	
	FindWord(int row, int column) {
		this.objRow = row;
		this.objColumn = column;
	}

	// For searching in 2 direction
	static int[] x = {0, 1};
	static int[] y = {1, 0};
	
	
	public static void main(String[] args) {
		
		char[][] grid1 = {{'k', 'w', 'h', 'd', 'e', 't', 'a', 'w', 's', 'u', 'w', 's', 'i', 'b', 'o', 'v', 'z', 'e', 'z', 'b'},
				 		  {'l', 'v', 'd', 'd', 'c', 'j', 'z', 'w', 'o', 'd', 'g', 'v', 'e', 'y', 's', 'e', 'k', 'w', 'w', 'm'},
				 		  {'o', 'b', 'w', 'j', 'e', 'k', 'y', 'u', 'm', 'j', 'm', 'a', 'f', 'i', 's', 'w', 'o', 'r', 'u', 'c'},
				 		  {'q', 'l', 'h', 'y', 'x', 'c', 'p', 'y', 'e', 'q', 'p', 'y', 't', 't', 'a', 'x', 'u', 'x', 'k', 'b'},
				 		  {'e', 'x', 'v', 'd', 'h', 'z', 'v', 'z', 'n', 'h', 'q', 'e', 'c', 'i', 'h', 'd', 'l', 'x', 'c', 'k'},
				 		  {'m', 'w', 't', 'o', 'e', 'c', 'm', 'h', 'g', 'k', 'b', 'k', 'x', 't', 'e', 't', 'h', 'a', 'p', 'y'},
				 		  {'j', 'o', 'y', 'b', 'e', 'y', 'i', 'a', 'y', 'j', 'n', 'y', 'w', 'r', 'q', 'x', 'v', 'p', 'o', 'h'},
				 		  {'e', 'p', 'r', 'w', 'm', 'p', 'b', 't', 'z', 'i', 'c', 'c', 'x', 'l', 'g', 'm', 'f', 'z', 'i', 't'},
				 		  {'s', 'e', 'i', 'a', 'm', 'o', 'q', 'p', 'v', 'y', 'x', 'r', 's', 'c', 'r', 'w', 't', 'g', 'm', 'f'},
				 		  {'z', 'o', 'z', 'i', 'y', 'v', 'e', 'p', 'y', 'y', 'w', 'a', 'i', 'y', 'p', 't', 'm', 'e', 's', 'd'},
				 		  {'p', 's', 'c', 'i', 'p', 'q', 'w', 'g', 'l', 'k', 'd', 'o', 'w', 'y', 's', 'o', 'b', 'v', 'j', 'm'},
				 		  {'t', 'o', 'u', 'k', 'i', 'j', 'h', 'j', 'q', 'l', 'l', 'y', 'z', 'c', 'u', 'a', 'l', 'b', 'q', 'g'},
				 		  {'x', 'y', 'k', 'd', 'r', 'b', 'x', 'z', 'v', 'o', 'j', 'd', 's', 'k', 'x', 'e', 'q', 's', 'p', 'c'},
				 		  {'p', 't', 'e', 'x', 's', 'a', 'm', 'm', 'l', 'i', 'c', 'n', 'z', 'q', 'j', 'm', 'y', 'y', 'k', 'd'},
				 		  {'s', 's', 'n', 't', 'w', 'n', 'i', 'd', 'c', 'm', 'x', 'l', 'f', 'j', 'g', 'v', 'm', 'z', 'y', 'v'},
				 		  {'e', 'j', 'e', 'n', 'm', 'f', 'w', 'l', 's', 'h', 'h', 'c', 'm', 'z', 'u', 't', 'x', 'q', 'j', 'c'},
				 		  {'x', 'f', 's', 's', 'h', 'h', 'a', 'p', 'x', 'q', 'y', 'v', 'l', 'm', 'h', 'q', 'n', 's', 's', 'k'},
				 		  {'y', 'x', 'q', 'n', 'i', 'v', 'v', 'd', 'k', 'b', 'b', 'c', 'e', 'e', 'y', 'd', 'r', 'a', 'n', 'b'},
				 		  {'l', 'f', 'i', 's', 'g', 'p', 'p', 'l', 'm', 'a', 'z', 'n', 'm', 'd', 'z', 'w', 'k', 'h', 's', 'b'},
				 		  {'n', 'j', 'q', 'e', 'g', 'e', 'm', 'a', 'j', 'm', 'i', 'z', 'x', 'i', 'o', 'g', 'x', 'i', 'x', 'i'}};
		
		FindWord firstWord = new FindWord(grid1.length, grid1[0].length);	
		int[] retVal1= firstWord.patternSearch(grid1, "netapp");
		System.out.println("x=" + retVal1[0] + ", y= " + retVal1[1] + ", count=" + retVal1[2]);
		
		char[][] grid2 =  {{'i', 'w', 'j', 'm', 'j', 'w', 'v', 'v', 't', 'x', 'm', 'p', 'x', 'b', 's', 'j', 'k', 'i', 'f', 'r'},
				 		   {'q', 'p', 'k', 'l', 'j', 'x', 'a', 'o', 'd', 'b', 'd', 'v', 's', 'y', 'k', 't', 'l', 'd', 'w', 'n'},
				 		   {'g', 'y', 'b', 'x', 'j', 'p', 'd', 'q', 'v', 'p', 'l', 'j', 'j', 'b', 'p', 'd', 'n', 'p', 'y', 'k'},
				 		   {'s', 'v', 'n', 'y', 'h', 'r', 't', 'c', 'o', 'w', 'x', 'd', 'c', 'o', 'y', 's', 'k', 'x', 'q', 'j'},
				 		   {'w', 'v', 'e', 'u', 'a', 'd', 'b', 'x', 's', 'j', 'w', 'u', 'y', 'f', 'x', 'j', 'k', 'b', 'd', 'g'},
				 		   {'c', 'q', 's', 'y', 's', 'b', 'q', 'e', 'l', 'i', 'c', 's', 'z', 'e', 'w', 'p', 'm', 'c', 'z', 'z'},
				 		   {'z', 'a', 'h', 'd', 'e', 'h', 'w', 'd', 'q', 'v', 'j', 'd', 'z', 'b', 'f', 'y', 'w', 'i', 'z', 'v'},
				 		   {'o', 'o', 'q', 'g', 'l', 'g', 'k', 'h', 'h', 'l', 'r', 'y', 'w', 'n', 's', 'p', 'h', 'g', 's', 'w'},
				 		   {'i', 'j', 'l', 'g', 'b', 'i', 'n', 'c', 'e', 'x', 'w', 'v', 'z', 'g', 'h', 'c', 'b', 'z', 'd', 'v'},
				 		   {'e', 'e', 'k', 'q', 'v', 'y', 'n', 'k', 'a', 'r', 'n', 'k', 'i', 'v', 'n', 'j', 'z', 't', 'c', 'u'},
				 		   {'y', 'z', 'k', 's', 'y', 'n', 'p', 't', 'p', 'l', 'a', 'q', 'i', 'd', 'a', 'h', 'z', 's', 'a', 's'},
				 		   {'g', 'n', 'r', 'o', 'f', 'e', 'g', 'b', 'u', 'b', 'b', 'v', 'a', 't', 'k', 'g', 'z', 'l', 'w', 'm'},
				 		   {'d', 'v', 'f', 'i', 'v', 'g', 'f', 'j', 's', 't', 'e', 'i', 'l', 'q', 's', 'f', 's', 'm', 'z', 'n'},
				 		   {'q', 'c', 'u', 'e', 'z', 'l', 'n', 'i', 'n', 't', 'x', 'o', 'p', 'h', 's', 'n', 't', 'e', 'f', 'k'},
				 		   {'u', 'e', 'u', 'r', 'u', 'f', 'n', 'y', 'r', 'y', 'l', 'i', 'v', 'm', 'l', 'p', 'n', 'c', 'g', 'e'},
				 		   {'g', 'o', 'j', 'q', 'i', 'q', 'l', 'm', 'l', 'g', 'a', 'e', 'x', 'i', 'q', 'g', 'n', 'z', 'a', 'b'},
				 		   {'h', 'm', 'd', 'w', 'c', 'u', 'h', 'm', 'q', 'p', 'r', 'd', 's', 'q', 'n', 'b', 'y', 'k', 'v', 'c'},
				 		   {'x', 'o', 'm', 'i', 'z', 'r', 'w', 'b', 'v', 'd', 't', 'g', 'k', 'm', 'r', 't', 'p', 'v', 'n', 's'},
				 		   {'y', 'y', 'x', 'i', 'u', 'd', 'k', 'e', 't', 'o', 'u', 'v', 'a', 's', 'c', 'z', 's', 'x', 'j', 'x'},
				 		   {'j', 'e', 'x', 'f', 'k', 'l', 'h', 'l', 'r', 'p', 's', 'b', 'q', 'r', 'c', 'h', 'x', 'l', 'x', 'd'}};
		
		FindWord secondWord = new FindWord(grid2.length, grid2[0].length);	
		int[] retVal2 = secondWord.patternSearch(grid2, "containers");
		System.out.println("x=" + retVal2[0] + ", y= " + retVal2[1] + ", count=" + retVal2[2]);
	}
	
	int[] patternSearch(char[][] grid, String word) {
		int [] retArr = {-1, -1, -1};
	    
		int i = 1;
		while(i <= 25) {
			
			this.shiftChars(grid);			
			// Consider every point as starting point and search given word
			for (int row = 0; row < this.objRow; row++) {
				for (int col = 0; col < this.objColumn; col++) {
					if (grid[row][col] == word.charAt(0) && this.searchRemaining(grid, row, col, word)) {
						retArr[0] = col;
						retArr[1] = row;
						retArr[2] = i;
						break;
					}
				}
				if(retArr[0] != -1 && retArr[1] != -1)
					break;
			}
			if(retArr[0] != -1 && retArr[1] != -1) {
				break;
			}
			i++;
		}
		return retArr;
	}
	
	boolean searchRemaining(char[][] grid, int row, int column, String word) {
		
		// If first character of word doesn't match with given starting point in grid.
		if (grid[row][column] != word.charAt(0))
			return false;

		int len = word.length();

		// Search word in 2 directions starting from (row, col)
		for (int dir = 0; dir < 2; dir++) {
			
			// Initialize starting point for current direction
			int k, rd = row + x[dir], cd = column + y[dir];

			// First character is already checked, match remaining characters
			for (k = 1; k < len; k++) {
				// If out of bound break
				if (rd >= this.objRow || cd >= this.objColumn)
					break;

				// If not matched, break
				if (grid[rd][cd] != word.charAt(k))
					break;

				// Moving in particular direction
				rd += x[dir];
				cd += y[dir];
			}

			// If all character matched, then value of must be equal to length of word
			if (k == len)
				return true;
		}
		return false;
	}
	
	void shiftChars(char inputArr[][]) {
		
		for(int i = 0; i < this.objRow; i++) {
			for(int j = 0; j < this.objColumn; j++) {
				inputArr[i][j] = (char) (((inputArr[i][j] - 'a' + 1) % 26) + 'a');
			}	
		}
	}
}
