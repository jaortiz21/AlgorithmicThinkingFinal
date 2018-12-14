public class Squares{
    public static int getMinSquares(int n){
	int[] dp = new int[n+1];
	dp[0] = 0;
	dp[1] = 1;
	dp[2] = 2;
	dp[3] = 3;

	for(int i = 4; i <= n; i++){
	    dp[i] = i;

	    for(int x = 1; x <= i; x++){
		int t = x*x;
		if(t > i)// done
		    break;
		else
		    dp[i] = Math.min(dp[i], 1+dp[i-t]);
	    }
	}
	return dp[n];
    }
}
