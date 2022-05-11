import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int number,i,j;
		System.out.println("Sayý Giriniz");
		number = scan.nextInt();
		
		
		System.out.println("4'ün katlarý");
		for (i=1;i<=number;i*=4) {
			
		
			System.out.println(i);	
			
			
		}
		
		System.out.println("5'in katlarý");
		
		for (j=1;j<=number;j*=5) {
			
			
			System.out.println(j);	
			
			
		}
		
		
		
	

	}

}
