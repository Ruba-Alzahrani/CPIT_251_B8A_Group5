
package b8a_group5;
import java.util.Scanner;

public class B8A_group5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("---------------- Welcome to Hospital Application ----------------");
        System.out.println("1. Appintments Booking ");
        System.out.println("2. Online consultation  ");
        System.out.println("3. Accessc Patient Profile  ");
        System.out.println("4. Payemnt"); 
        System.out.println("5. exit");  
        System.out.println("------------------------------------------------------------------");
        System.out.print("Please choose the service ");
        
        int choose = s.nextInt();
        do {
        } while (!(choose == 5));


    }

}
