
package b8a_group5;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;


public class B8A_group5Test {
    
    public B8A_group5Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class B8A_group5.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        B8A_group5.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Appintments method, of class B8A_group5.
     */
    @Test
    public void testAppintments() {
        System.out.println("Appintments");
        Scanner s ;
        String[] Appintment_information=new String[3] ;
        Appintment_information[0] = "0- Dr.Razan, 10.11.2022 ,8 PM";
        Appintment_information[1] = "1- Dr.Ruba, 15.11.2022 ,9 PM";
        Appintment_information[2] = "2- Dr.Raghad, 29.11.2022 ,7 PM";
       int user_selection=0;
        String expResult = "0- Dr.Razan, 10.11.2022 ,8 PM";
        String result =  Appintment_information[user_selection];
        assertEquals(expResult, result);
     
    }

    /**
     * Test of consultation method, of class B8A_group5.
     */
    @Test
    public void testConsultation() {
        System.out.println("consultation");
        String[] appointmentAnOnlineCon = new String[3];
        appointmentAnOnlineCon[0] = "0- Dr.Sky , Monday , 10.11.2021 , 7 pm";
        appointmentAnOnlineCon[1] = "1- Dr.Will , sunday , 9.11.2021 , 9 pm";
        appointmentAnOnlineCon[2] = "2- Dr.Hana , Thursday , 14.11.2021 , 6 pm";
        int userChoose = 2;
        String expResult = "2- Dr.Hana , Thursday , 14.11.2021 , 6 pm";
        String result = appointmentAnOnlineCon[userChoose];
        assertEquals(expResult, result);

    }

    /**
     * Test of payment method, of class B8A_group5.
     */
    @Test
    public void testPayment() {
        System.out.println("payment");
        String[] format = {"0- ", "1- "};
        String[] systemServices = {"Online consultation", "boold test"};
        int[] costOfServices = {350, 100};
        int userChooseService = 0;
        int payAmountEnterd = 350;
        int expResult = 0;
        //HERE THE USER ALREADY CHOOSE THE FIRST SERVER.
        int result = payAmountEnterd - costOfServices[userChooseService];
        assertEquals(expResult, result);

    }

    /**
     * Test of PatientProfile method, of class B8A_group5.
     */
    @Ignore
    public void testPatientProfile() {
        System.out.println("PatientProfile");
        B8A_group5.PatientProfile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     @Test
    public void testCheckPatientID() {
        System.out.println("checkPatientID");
        // testing for a vaule in the range
        assertTrue(B8A_group5.checkPatientID(2));
        // testing for a value out of the range 
        assertFalse(B8A_group5.checkPatientID(4));

    }

    /**
     * Test of BloodTest method, of class B8A_group5.
     */
    @Test
    public void testBloodTest() {
        System.out.println("BloodTest");
        B8A_group5.BloodTest();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
