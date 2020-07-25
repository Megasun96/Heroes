/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroes;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author stefa
 */
public class HumanWarriorNGTest {
    
    public HumanWarriorNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of primaryFire method, of class HumanWarrior.
     */
    @Test
    public void testPrimaryFire() {
        System.out.println("primaryFire");
        HumanWarrior instance = new HumanWarrior();
        instance.primaryFire();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recieveHit method, of class HumanWarrior.
     */
    @Test
    public void testRecieveHit() {
        System.out.println("recieveHit");
        HumanWarrior instance = new HumanWarrior();
        instance.recieveHit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of show method, of class HumanWarrior.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        HumanWarrior instance = new HumanWarrior();
        instance.show();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
