
package b8a_group5;
import java.util.Scanner;

public class B8A_group5 {

    public static void main(String[] args) {
        String Appintment_information[] = new String[3];
       
        Appintment_information[0] = "0- Dr.Razan, 10.11.2022 ,8 PM";
        Appintment_information[1] = "1- Dr.Ruba, 15.11.2022 ,9 PM";
        Appintment_information[2] = "2- Dr.Raghad, 29.11.2022 ,7 PM";
        Scanner s = new Scanner(System.in);

        System.out.println("---------------- Welcome to Hospital Application ----------------");
        System.out.println("1. Appintments Booking ");
        System.out.println("2. Online consultation  ");
        System.out.println("3. Accessc Patient Profile  ");
        System.out.println("4. Blood Test Result"); 
        System.out.println("5. exit");  
        System.out.println("------------------------------------------------------------------");
        System.out.print("Please choose the service: ");
        
        int choose = s.nextInt();
        do {
            if (choose==1){
                System.out.println("Service: Appintments Booking");
                String h=Appintments(s,Appintment_information);
               
 
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
            
     System.out.println("Please choose other service or 5 to exit: ");
              choose = s.nextInt();
            
                } while (!(choose == 5));

    }

    public static String Appintments(Scanner s, String Appintment_information[]) {
        for (int i = 0; i < Appintment_information.length; i++) {
            System.out.println("The Appintments are:  ");
            System.out.println(Appintment_information[i]);
            System.out.println("-------------------------------------------");
        }
        System.out.print("Enter your chosen Appintment (from 0 to 2): ");
        int choice = s.nextInt();
        String store = Appintment_information[choice];
        System.out.print("The selected Appintment has been added to your Profile\n");
        Appintment_information[choice] = "This Appintment has been reserved! ";  
        return store;
    }

    public static void consultation(String A) {

    }
    
    public static void PatientProfile(String A){
        
    }
    
    public static void BloodTest(String A){
        
    }
    
    
    
}
