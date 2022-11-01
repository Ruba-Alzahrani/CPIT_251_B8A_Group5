
package b8a_group5;
import java.util.Scanner;

public class B8A_group5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("---------------- Welcome to Hospital Application ----------------");
        System.out.println("1. Appintments Booking ");
        System.out.println("2. Online consultation  ");
        System.out.println("3. Accessc Patient Profile  ");
        System.out.println("4. Blood Test Result"); 
        System.out.println("5. exit");  
        System.out.println("------------------------------------------------------------------");
        System.out.print("Please choose the service ");
        
        int choose = s.nextInt();
        do {
            if (choose==1){
                System.out.println("Service: Appintments Booking");
                
            }
            
            if (choose==2){
                System.out.println("Service: Online consultation");
                
            }
            
            if (choose==3){
                System.out.println("Service: Accessc Patient Profile");
                
            }
            
            if (choose==4){
                System.out.println("Service: Blood Test Result");
                
            }
            
            
        } while (!(choose == 5));

    }

    public static void Appintments(String A){
        
    }
    
    public static void consultation(String A){
        
    }
    
    public static void PatientProfile(String A){
        
    }
    
    public static void BloodTest(String A){
        
    }
    
    
    
}
