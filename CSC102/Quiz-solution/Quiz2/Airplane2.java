import java.util.Scanner;
public class Airplane2{
	public static int findMin(int[][] arr,int idx){
		int minIdx = 0;
		for(int i=0;i<arr.length;i++)
			if(arr[i][idx] <= arr[minIdx][idx])
				minIdx = i;
		return minIdx;
	}
	public static int getSum(int[][] arr,int idx){
		int sum = 0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i][idx];
		return sum;
	}
	public static int f(int a){
		return a == 0 ? 1:0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nowN = new int[2];
		int[][] seat = new int[n][2];
		for(int i=0;i<n*2;i++){
			int weight = sc.nextInt(),idx=1;
			if(getSum(seat,0) <= getSum(seat,1)) idx = 0;
			if(nowN[idx] < n)
				seat[nowN[idx]++][idx] = weight;
			else{
				int tempIdx = findMin(seat,idx);
				seat[nowN[f(idx)]++][f(idx)] = seat[tempIdx][idx];
				seat[tempIdx][idx] = weight;
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(seat[i][0]+" "+seat[i][1]);
	}
}