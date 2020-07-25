/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stefa
 */
public class HeroesTest {
    
    public HeroesTest() {
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
