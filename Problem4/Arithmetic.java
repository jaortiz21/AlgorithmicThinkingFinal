import java.util.*;

public class Arithmetic{
    public ArrayList<int[]> arithmeticSlices(int[] a){
	int[] dp = new int[a.length];
	int c = 0;
	ArrayList<int[]> slices = new ArrayList<>();
	for(int i = 2; i < dp.length; i++){
	    if(a[i] - a[i-1] == a[i-1] - a[i-2]){
		dp[i] = 1 + dp[i-1];
		c++;
		int[] t = {a[i-2],a[i-1],a[i]};
		slices.add(t);
	    }
	}
	return slices;
    }
}
