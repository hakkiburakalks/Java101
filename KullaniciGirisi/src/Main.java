import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName,password,select,newPassword;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullan�c� Ad� Giriniz");
		userName = input.nextLine();
		
		System.out.println("�ifre Giriniz");
		password = input.nextLine();
		
		
       if (userName.equals("patika") && password.equals("java123")) {
    	   
		System.out.println("Giri� Yapt�n�z");
		
       }
       
       else {
		
    	   System.out.println("�ifreniz Yanl��");
    	   System.out.println("Yeni Bir �ifre Olu�turmak �stiyorsan�z 1-Hay�r 2-Evet");
    	   select = input.nextLine();
    	   
    	   switch(select) {
    	   
    	   case "1":System.out.println("�yi G�nler");break;
    	   case "2":System.out.println("Yeni �ifre Giriniz");
    	             newPassword = input.nextLine();
    	   
    	         if (newPassword.equals(password)) {
    	        	 System.out.println("Yanl�� �ifre Girdiniz Tekrar Deneyiniz");
    	         }
    	   
    	         else {
    	        	 password = newPassword;
    	        	 System.out.println("Parola Olu�turuldu");
    	        	 
    	         }   break;
    	         
    	         
    	   default:System.out.println("Yanl�� Se�im");break;      
    	   
    	   }
    	   
	}
     
       
       
       }

}
