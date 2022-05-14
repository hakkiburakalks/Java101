import java.util.Scanner;

public class Main {
	
    static int result=1;
    public static int power(int us, int taban) {

        if (us == 0) 
        {
        	return 1;
        }
            
        result *= taban;
        power(us-1,taban);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int us, taban;

        System.out.print("Taban degeri giriniz : ");
        taban = scan.nextInt();

        System.out.print("Us degerini giriniz : ");
        us = scan.nextInt();

        System.out.println("Sonuc : "+power(us,taban));



    }
}
