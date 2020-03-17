import java.util.Scanner;
public class AirPlane{
	public static int findMin(int[] arr){
		int min = arr[0],idx=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] <= min){
				min = arr[i];
				idx = i;
			}
		}
		return idx;
	}
	public static int getSum(int[] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumLeft=0,sumRight = 0,nLeft=0,nRight=0;
		int[] left = new int[n],right = new int[n];
		for(int i=0;i<n*2;i++){
			int weight = sc.nextInt();
			if(sumLeft <= sumRight){
				if(nLeft < n){
					left[nLeft++] = weight;
				}
				else{
					int idx = findMin(left),oldWeight = left[idx];
					left[idx] = weight;
					right[nRight++] = oldWeight;
				}
			}
			else{
				if(nRight < n){
					right[nRight++] = weight;
				}
				else{
					int idx = findMin(right),oldWeight = right[idx];
					right[idx] = weight;
					left[nLeft++] = oldWeight;
				}
			}
			sumLeft = getSum(left);
			sumRight = getSum(right);
		}
		for(int i=0;i<n;i++){
			System.out.println(left[i]+" "+right[i]);
		}
	}
}