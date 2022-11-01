
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
            
            if (choose == 2) {
                System.out.println("Service: Online consultation");
                String store = consultation();
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

    public static String consultation() {
        Scanner s = new Scanner(System.in);

        String[] appointmentAnOnlineCon = new String[3];
        System.out.println(appointmentAnOnlineCon[0] = "0- Dr.Sky , Monday , 10.11.2021 , 7 pm");
        System.out.println(appointmentAnOnlineCon[1] = "1- Dr.Will , sunday , 9.11.2021 , 9 pm");
        System.out.println(appointmentAnOnlineCon[2] = "2- Dr.Hana , Thursday , 14.11.2021 , 6 pm");

        System.out.print("Choos an online appointment from 0 to 2 = ");
        int onlineAppo = s.nextInt();
        String store = appointmentAnOnlineCon[onlineAppo];
        System.out.println("The appointment at " + appointmentAnOnlineCon[onlineAppo] + " is resived");
        appointmentAnOnlineCon[onlineAppo] = "Is unavilable";

        return store;

    }

    public static String payment() {
        Scanner s = new Scanner(System.in);

        String[] systemServices = {"Online con", "boold test"};
        int[] costOfServices = {350, 100};
        int i = 0;
        while (i != 2) {
            System.out.println(systemServices[i] + "  " + costOfServices[i]);
            i++;
        }

        System.out.print("Choos an servise from 0 to 1 = ");
        int chooseSivr = s.nextInt();
        System.out.println("you choose " + systemServices[chooseSivr] + "  " + costOfServices[chooseSivr]);

        System.out.print("write the payment amount = ");
        int payAmount = s.nextInt();

        if (payAmount == costOfServices[chooseSivr]) {
            int sub = payAmount - costOfServices[chooseSivr];
            System.out.println("The amount have has been taken");
        } else {
            while (payAmount - costOfServices[chooseSivr] != 0) {
                System.out.println("Try again!");
                System.out.print("write the payment amount = ");
                payAmount = s.nextInt();
            }
        }

        String store = systemServices[chooseSivr] + "  " + costOfServices[chooseSivr];

        return store;
    }

    public static void PatientProfile(String A){
   
        String PaitnetInfo[] = new String[3];
        Scanner input = new Scanner(System.in);
        
        PaitnetInfo[0] = "Name: Lama\n"
                       + "Gender: Female\n"
                       + "Highet: 160 cm\n"
                       + "Weight: 55 kg\n"
                       + "Blood Type: O\n";
        
        PaitnetInfo[1] = "Name: Ahmed\n"
                       + "Gender: Male\n"
                       + "Highet: 180 cm\n"
                       + "Weight: 70 kg\n"
                       + "Blood Type: A\n";
        
        PaitnetInfo[2] = "Name: Sarah\n"
                       + "Gender: Fmale\n"
                       + "Highet: 155 cm\n"
                       + "Weight: 52 kg\n"
                       + "Blood Type: O+\n";

        System.out.print("Enter Patient ID: ");
        int patientID = input.nextInt();
        
        if (!(patientID == 0 || patientID == 1 || patientID == 2)) {
            boolean g = false;
            do {

                System.out.println("please Try again!");
                System.out.print("Enter Patient ID: ");
                patientID = input.nextInt();

                if ((patientID == 0 || patientID == 1 || patientID == 2)) {
                    g = true;
                }
            } while (g == false);
            {

            }
        }

        System.out.println(PaitnetInfo[patientID]);

    
        
    }
    
    public static void BloodTest(String A){
        
    }
    
    
    
}
