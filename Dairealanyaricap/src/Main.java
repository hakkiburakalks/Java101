import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int r , centerDegree;
		
		double PI = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yar� �ap� Giriniz");
		r = input.nextInt();
		
		System.out.println("Merkez A��y� Giriniz:");
		centerDegree = input.nextInt();
		
		double area = (PI * Math.pow(r, 2)*centerDegree) / 360;
		
		
		System.out.println("Daire Diliminin Alan�" +area);

	}

}
