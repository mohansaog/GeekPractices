package Array_2D;

public class ExitPoint {

	public static void main(String[] args) {
		int[][] maze = {
				{0,0,1,0},
				{1,0,0,0},
				{0,0,0,0},
				{1,0,1,0}
		};
		
		int r =0;
		int c = 0;
		int dir = 0; // 0=east, 1 = south, west = 2, 3= north
		while(true) {
			int nr = r;
			int nc = c;
			dir = (dir+maze[r][c]) % 4;
			if(dir == 0) { // east
				nc++;
			}
			else if(dir == 1) { // south
				nr++;
			}
			else if(dir == 2) { //west
				nc--;
			}
			else if(dir == 3) { // north
				nr--;
			}
			
			if(nr < 0 || nr >= maze.length || nc <0 || nc >= maze[0].length) {
				System.out.println(r+" "+c);
				break;
			}
			else
			{
				r = nr;
				c = nc;
			}
		}
	}

}
