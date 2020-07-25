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
public class HeroesNGTest {
    
    public HeroesNGTest() {
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
     * Test of primaryFire method, of class Heroes.
     */
    @Test
    public void testPrimaryFire() {
        System.out.println("primaryFire");
        Heroes instance = new HeroesImpl();
        instance.primaryFire();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recieveHit method, of class Heroes.
     */
    @Test
    public void testRecieveHit() {
        System.out.println("recieveHit");
        Heroes instance = new HeroesImpl();
        instance.recieveHit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HeroesImpl extends Heroes {

        public void primaryFire() {
        }

        public void recieveHit() {
        }
    }
    
}
