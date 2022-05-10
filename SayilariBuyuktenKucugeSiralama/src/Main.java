import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 	//  a  b  c
		int n1,n2,n3;
		Scanner input = new Scanner(System.in);	
		System.out.println("Birinci Sayiyi Giriniz");
        n1 = input.nextInt();
        System.out.println("Ýkinci Sayiyi Giriniz");
        n2 = input.nextInt();
        System.out.println("Ucuncu Sayiyi Giriniz");
        n3 = input.nextInt();

        if (n1>n2 && n1>n3) {
        
        	if(n2>n3) {
        		System.out.println("a>b>c");
        	}
        	else {
        		System.out.println("a>c>b");
        	}
        	
        }
        else if(n2>n1 && n2>n3) {
        	if(n1>n3) {
        		System.out.println("b,a,c");
        	}
        	else {
        		System.out.println("b,c,a");
        	}
        	
        	
        }
        else if(n3>n1 && n3>n2) {
        
         if (n1 > n2) {
			System.out.println("c,a,b");
		}
         else {
        	 System.out.println("c,b,a");
         }
        
        
        }
        
        
        
	}

}
