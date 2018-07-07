import java.util.*;
public class Solution{
	public static int calSwaps(int [] a){
		HashSet<Integer>odds = new HashSet<>();
		for (int i = 0 ; i < a.length ; i++){
			if (a[i] % 2  != 0){
				odds.add(a[i]);
			}
		}
		int count = 0;
		for (int i = 0 ; i < a.length ; i++){
			if (a[i] % 2 != 0)
				continue;
			if (i != 0 && a[i-1] == a[i]+1)
				continue;
			if (i != a.length-1 && a[i+1] == a[i]+1)
				continue;
			if (!odds.contains(a[i]+1))
				continue;
			count++;

		}
		if (count == 0 || count == 1)
			return count;
		else
			return count-1;
	}
	public static void main(String[] args) {
		int [][] a = {{0,2,1,3},{3,2,0,1},{1,0}};

		for (int i = 0 ; i < a.length ; i++){
			System.out.println(Arrays.toString(a[i]));
			System.out.println(calSwaps(a[i]));
		}
	}
}