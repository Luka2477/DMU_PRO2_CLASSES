/*
 * Created on 2005-03-03
 */
package given.rekursion;

public class Maze {
	private final int TRIED = 2;
	private final int PATH = 3;
	// private int[][] grid = {{1,1,1,0,1,1,0,0,0,1,1,1,1},
	// {1,0,1,1,1,0,1,1,1,1,0,0,1},
	// {0,0,0,0,1,0,1,0,1,0,1,0,0},
	// {1,1,1,0,1,1,1,0,1,0,1,1,1},
	// {1,0,1,0,0,0,0,1,1,1,0,0,1},
	// {1,0,1,1,1,1,1,1,0,1,1,1,1},
	// {1,0,0,0,0,0,0,0,0,0,0,0,0},
	// {1,1,1,1,1,1,1,1,1,1,1,1,1}} ;

	private int[][] grid = { { 1, 1, 0, 0, 1 }, { 0, 1, 1, 1, 0 },
			{ 0, 1, 0, 1, 1 }, { 1, 1, 0, 0, 1 } };

	public void tryPosition(int row, int col) {
		grid[row][col] = TRIED;
	}

	public void markParth(int row, int col) {
		grid[row][col] = PATH;
	}

	public int getRows() {
		return grid.length;
	}

	public int getCols() {
		return grid[0].length;
	}

	public boolean validPosistion(int row, int column) {
		boolean result = false;
		if (row >= 0 && row < grid.length && column >= 0
				&& column < grid[row].length) {
			if (grid[row][column] == 1) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("\n");
		for (int[] ints : grid) {
			for (int anInt : ints) {
				result.append(anInt).append(" ");
			}
			result.append("\n");
		}
		return result.toString();
	}
}
