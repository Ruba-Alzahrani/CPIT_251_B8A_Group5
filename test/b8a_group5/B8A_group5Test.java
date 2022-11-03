/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group5;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author razan
 */
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
       // B8A_group5.Appintments(s, Appintment_information);
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
        String expResult = "";
        String result = B8A_group5.consultation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payment method, of class B8A_group5.
     */
    @Test
    public void testPayment() {
        System.out.println("payment");
        String expResult = "";
        String result = B8A_group5.payment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PatientProfile method, of class B8A_group5.
     */
    @Test
    public void testPatientProfile() {
        System.out.println("PatientProfile");
        B8A_group5.PatientProfile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
