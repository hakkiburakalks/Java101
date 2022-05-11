import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("N Sayýsýný Giriniz: ");
		int n = scn.nextInt();
		double result = 0.0;
		
		for (double i=1; i<=n; i++) {
			result += (1.0/i);
		}

		
		System.out.println(result);
	}

}
