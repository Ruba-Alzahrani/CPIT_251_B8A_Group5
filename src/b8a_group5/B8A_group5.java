package b8a_group5;

import java.util.Scanner;

public class B8A_group5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String Appintment_information[] = new String[3];
        Appintment_information[0] = "0- Dr.Razan, 10.11.2022 ,8 PM";
        Appintment_information[1] = "1- Dr.Ruba, 15.11.2022 ,9 PM";
        Appintment_information[2] = "2- Dr.Raghad, 29.11.2022 ,7 PM";
        
        String[] appointmentAnOnlineCon = new String[3];
        appointmentAnOnlineCon[0] = "0- Dr.Sky , Monday , 10.11.2021 , 7 pm";
        appointmentAnOnlineCon[1] = "1- Dr.Will , sunday , 9.11.2021 , 9 pm";
        appointmentAnOnlineCon[2] = "2- Dr.Hana , Thursday , 14.11.2021 , 6 pm";

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
            if (choose == 1) {
                System.out.println("Service: Appintments Booking");
                String h = Appintments(s, Appintment_information);

            }

            if (choose == 2) {
                System.out.println("Service: Online consultation");
                String store = consultation(appointmentAnOnlineCon);
            }

            if (choose == 3) {
                System.out.println("Service: Accessc Patient Profile");
                PatientProfile();

            }

            if (choose == 4) {
                System.out.println("Service: Blood Test Result");
                BloodTest();
            }

            System.out.print("Please choose other service or 5 to exit: ");
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

    public static String consultation(String appointmentAnOnlineCon[]) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < appointmentAnOnlineCon.length; i++) {
            System.out.println("The Appintments are:  ");
            System.out.println(appointmentAnOnlineCon[i]);
            System.out.println("-------------------------------------------");
        }

        System.out.print("Choose an online appointment from 0 to 2 = ");
        int onlineAppo = s.nextInt();
        String store = appointmentAnOnlineCon[onlineAppo];
        System.out.println("The selected online appointment has been added to your Profile");
        appointmentAnOnlineCon[onlineAppo] = "Is unavilable";
        
        payment();
        return store;      

    }

    public static int payment() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("-------------------------------------------");
        int costOfServices = 350;
        System.out.print("The Online consultation cost ");
        System.out.println(costOfServices);
        System.out.print("write the payment amount = ");
        int payAmount = s.nextInt();

        if (payAmount == costOfServices) {
            int sub = payAmount - costOfServices;
            System.out.println("The amount has been deducted");
        } else {
            while (payAmount - costOfServices != 0) {
                System.out.println("Try again! you typed the wrong amount");
                System.out.print("write the payment amount = ");
                payAmount = s.nextInt();
            }
            System.out.println("The correct amount has been deducted");
        }

        int store = costOfServices;

        return store;
    }

    public static void PatientProfile() {
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
                + "Gender: Female\n"
                + "Highet: 155 cm\n"
                + "Weight: 52 kg\n"
                + "Blood Type: O+\n";

        System.out.print("Enter Patient ID: ");
        int patientID = input.nextInt();
        checkPatientID(patientID);
        boolean result = false;
            do {
                if (checkPatientID(patientID) == false) {

                System.out.println("please Try again!");
                System.out.print("Enter Patient ID: ");
                patientID = input.nextInt();

                } else {
                   result = checkPatientID(patientID) ;
                }
            } while (result == false);
            
        
        
        System.out.println("\n"+PaitnetInfo[patientID]);

    }
    public static boolean checkPatientID(int patienid) {
        if (patienid == 0 || patienid == 1 || patienid == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static void BloodTest() {
        Scanner sec = new Scanner(System.in);
        System.out.print("Enter Your ID Number: ");
        int ID = sec.nextInt();
        String[] BloodTest = new String[3];
        BloodTest[0]
                = "       TEST(0)                  RESULT     PEFERRENCE INTERVAL\n"
                + "Comp. Metabolic Panel (14)        90             65-99\n"
                + "Sodium, Serum                     131            135-145\n"
                + "Potassium, Serum                  4              3.5-5.2\n"
                + "Chloride, Serum                   99            97-108\n"
                + "Carbon Dioxide, Serum             23             20-32\n"
                + "Calcium, Serum                    10.0            8.7-10.2\n"
                + "Protein, Serum                    6.6            6.0-8.5\n"
                + "Albumin, Serum                    4.9            3.5-5.5\n"
                + "Globulin, Serum                   2.7            1.5-4.5\n"
                + "A/G Ratio                         2.1            1.1-2.5";

        BloodTest[1]
                = "       TEST(1)                  RESULT     PEFERRENCE INTERVAL\n"
                + "Comp. Metabolic Panel (14)        77             65-99\n"
                + "Sodium, Serum                     145            135-145\n"
                + "Potassium, Serum                  3.8            3.5-5.2\n"
                + "Chloride, Serum                   105            97-108\n"
                + "Carbon Dioxide, Serum             30             20-32\n"
                + "Calcium, Serum                    8.9            8.7-10.2\n"
                + "Protein, Serum                    7.6            6.0-8.5\n"
                + "Albumin, Serum                    4.9            3.5-5.5\n"
                + "Globulin, Serum                   2.7            1.5-4.5\n"
                + "A/G Ratio                         1.6            1.1-2.5";

        BloodTest[2]
                = "       TEST(2)                  RESULT     PEFERRENCE INTERVAL\n"
                + "Comp. Metabolic Panel (14)        84             65-99\n"
                + "Sodium, Serum                     141            135-145\n"
                + "Potassium, Serum                  4.4            3.5-5.2\n"
                + "Chloride, Serum                   101            97-108\n"
                + "Carbon Dioxide, Serum             23             20-32\n"
                + "Calcium, Serum                    9.9            8.7-10.2\n"
                + "Protein, Serum                    7.6            6.0-8.5\n"
                + "Albumin, Serum                    4.9            3.5-5.5\n"
                + "Globulin, Serum                   2.7            1.5-4.5\n"
                + "A/G Ratio                         1.8            1.1-2.5";

        System.out.print("Here is Patient " + ID + " blood Test: \n" + BloodTest[ID] + '\n');
        
    }

}
