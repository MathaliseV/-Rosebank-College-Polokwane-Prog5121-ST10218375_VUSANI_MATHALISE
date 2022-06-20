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
 * ST10218375_MATHALISE_VUSANI
 */
public class TaskTest {
    
    public TaskTest() {
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
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String taskDescription = "Create Login to authenticate users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskName = "Login Feature";
        String devName = "Robyn";
        Task instance = new Task();
        String expResult = "LO:0:BYN";
        String result = instance.createTaskID(taskName, devName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String taskStatus = "To Do";
        String devName = "Robyn";
        String devSurname = "Harrison";
        String taskName = "Login Feature";
        String taskDescription = "Create Login to authenticate users";
        String taskID = "LO:0:BYN";
        int taskDuration = 0;
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails(taskStatus, devName, devSurname, taskName, taskDescription, taskID, taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.returnTotalHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
