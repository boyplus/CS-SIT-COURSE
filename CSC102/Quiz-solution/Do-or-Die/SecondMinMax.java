import java.util.Scanner;
import java.util.Arrays;
public class SecondMinMax{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextDouble();
		}
		Arrays.sort(arr);
		System.out.println(arr[1]+" "+arr[n-2]);
	}
}