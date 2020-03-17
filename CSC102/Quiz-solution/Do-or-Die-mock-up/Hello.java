import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String surname = sc.next();
		System.out.println("Hello, "+name+" "+surname+".");
		System.out.println("Welcome to Do or Die exam.");
	}
}