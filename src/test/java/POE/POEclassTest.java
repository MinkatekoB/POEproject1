/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package POE;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author minka
 */
public class POEclassTest {
    private POEclass instance;
    
    public POEclassTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        instance = new POEclass();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of userDetails method, of class POEclass.
     */
    @Test
    public void testUserDetails() {
        System.out.println("userDetails");
       
        instance.userDetails();
        assertNotNull(userDetails,"User details shouldnot be null");
        
    }

    /**
     * Test of checkUsername method, of class POEclass.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");

        boolean expResult = false;
        boolean result = instance.checkUsername();
        assertEquals(expResult, result);
     
        
    }

    /**
     * Test of PasswordPrompt method, of class POEclass.
     */
    @Test
    public void testPasswordPrompt() {
        System.out.println("PasswordPrompt");
       
        instance.PasswordPrompt();
    }

    /**
     * Test of checkPasswordComplexity method, of class POEclass.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Username_Prompt method, of class POEclass.
     */
    @Test
    public void testUsername_Prompt() {
        System.out.println("Username_Prompt");
        
        instance.Username_Prompt();
        
        
    }

    /**
     * Test of RegisterUser method, of class POEclass.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("RegisterUser");
        
        instance.RegisterUser();
        
    }

    /**
     * Test of login_Status method, of class POEclass.
     */
    @Test
    public void testLogin_Status() {
        System.out.println("login_Status");
       
        boolean expResult = false;
        boolean result = instance.login_Status();
        assertEquals(expResult, result);
    }

    /**
     * Test of LoginUser method, of class POEclass.
     */
    @Test
    public void testLoginUser() {
        System.out.println("LoginUser");
       
        instance.LoginUser();
    }}
