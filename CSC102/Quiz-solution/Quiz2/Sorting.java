import java.util.Scanner;
import java.util.Arrays;
public class Sorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int a=n-1,b=0;
        while(a > b){
            System.out.print(arr[a]+" "+arr[b]+" ");
            a--;
            b++;
        }
        if(a == b){
            System.out.print(arr[a]);
        }
    }
    
}
