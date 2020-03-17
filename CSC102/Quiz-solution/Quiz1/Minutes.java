import java.util.Scanner;
public class Minutes{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a/60/24;
		System.out.println(b/365 +" "+b%365);
	}
}