public class MinPath{
    public static int fallingPathSum(int[][] a){
	for(int i = a.length-2; i >= 0; i--){
	    for(int j = 0; j < a.length; j++){
		int sum = a[i+1][j];
		if(j > 0)
		    sum = Math.min(sum, a[i+1][j-1]);
		if(j+1 < a.length)
		    sum = Math.min(sum, a[i+1][j+1]);
		a[i][j] += sum;
	    }
	}
	int result = Integer.MAX_VALUE;
	for(int x: a[0])
	    result = Math.min(result,x);
	return result;
    }
}
