/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ST10218375_MATHALISE_VUSANI
 */
public class LoginTest {
    
    public LoginTest() {
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
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String userName = "Vus_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkPassWordComplexity method, of class Login.
     */
    @Test
    public void testCheckPassWordComplexity() {
        System.out.println("checkPassWordComplexity");
        String password = "Vusi@1234";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPassWordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "kg_";
        String password = "Vusi@123";
        Login instance = new Login();
        String expResult = "The two above conditions have been met and the user has been registered successfully.";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "KGM_";
        String password = "Vusi@123";
        String loginUsername = "Lih_";
        String loginPassword = "Vusi@123";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginUser(username, password, loginUsername, loginPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String first = "Vusani";
        String last = "Hope";
        String username = "KGM_";
        String password = "Vusi@123";
        String loginUsername = "KGM_";
        String loginPassword = "Vusi@123";
        Login instance = new Login();
        String expResult = "Welcome "+first+" "+last+" it is great to see you again";
        String result = instance.returnLoginStatus(first, last, username, password, loginUsername, loginPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        // TODO review the generated test code and remove the default call to fail.
   
    }
    
}
