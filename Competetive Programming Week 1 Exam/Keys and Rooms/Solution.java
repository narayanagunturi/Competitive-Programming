import java.util.*;
public class Solution{
	public static boolean keysAndRooms(int [][] a){
		HashSet<Integer>hs = new HashSet<>();
		System.out.print("[");
		for (int i = 0 ; i < a.length ; i++){
			System.out.print(Arrays.toString(a[i]));
			if (i != a.length-1)
				System.out.print(", ");
		}
		System.out.print("]");
		for (int i = 0 ; i < a.length ; i++){

			for (int j = 0 ; j < a[i].length ; j++){
				if (!hs.contains(a[i][j]))
					hs.add(a[i][j]);
			}

			if (i != a.length-1 && !hs.contains(i+1))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[][][] a = {{{1}, {0,2},{3}}, {{1,3}, {3,0,1},{2},{0}}, {{1,2,3},{0},{0},{0}}, {{1},{0,2,4},{1,3,4},{2},{1,2}}, {{1},{2,3},{1,2},{4},{1},{5}}, {{1},{2},{3},{4},{2}}, {{1},{1,3},{2},{2,4,6},{},{1,2,3},{1}}};
		for (int i = 0 ; i < a.length ; i++){
			System.out.println("-"+keysAndRooms(a[i]));
		}
		
	}
}