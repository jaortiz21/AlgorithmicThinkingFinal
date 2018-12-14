import java.util.*;

public class LongestChain{
    public static int longestChain(int[][] pairs){
	Arrays.sort(pairs, (a,b) -> a[0] - b[0]);
	int[] dp = new int[pairs.length];
	Arrays.fill(dp,1);

	for(int i = 1; i < pairs.length; i++){
	    for(int j = 0; j < i; j++){
		if(pairs[j][1] < pairs[i][0])
		    dp[i] = Math.max(dp[i], dp[j]+1);
	    }
	}
	int ans = 0;
	for(int x: dp)
	    if(x > ans) ans = x;
	return ans;
    }
}
