import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Kaç tane sayý girmek istersiniz");
		int howManyInput = input.nextInt();
	    int min = 0 , max = 0 , n;
	    
	    
	    for(int i=1;i<=howManyInput;i++){
            System.out.print(i+". sayiyi giriniz:");
            n= input.nextInt();
            if(i==1){
                min=n;
                max=n;
                
            }else if(n>=max){
                max=n;
                
            }else if(n<=min){
                min=n;
                
            }
	
            System.out.println("Max"+max);
            System.out.println("Min:"+min);
		
		
		
		

	}

	}
}
