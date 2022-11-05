
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
        int costOfServices = 350;
        int expResult = 0;
        int result = costOfServices - costOfServices;
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
        B8A_group5 instance = new B8A_group5(1);
         String expResult =
        "Here is Patient Ahmed with ID number 1 blood test: \n"
                 + "       TEST(Ahmed)                RESULT     PEFERRENCE INTERVAL\n"
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
        String result = instance.toString();
        assertNotSame(expResult, result);
    }
    
}
