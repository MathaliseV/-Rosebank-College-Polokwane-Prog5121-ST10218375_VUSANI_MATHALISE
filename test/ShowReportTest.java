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
 * @author lzulu
 */
public class ShowReportTest {
    
    public ShowReportTest() {
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
     * Test of delete method, of class ShowReport.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String tName = "";
        ShowReport.delete(tName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of statusOfDone method, of class ShowReport.
     */
    @Test
    public void testStatusOfDone() {
        System.out.println("statusOfDone");
        String expResult = "";
        String result = ShowReport.statusOfDone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of longestDuration method, of class ShowReport.
     */
    @Test
    public void testLongestDuration() {
        System.out.println("longestDuration");
        String expResult = "";
        String result = ShowReport.longestDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of searchTaskName method, of class ShowReport.
     */
    @Test
    public void testSearchTaskName() {
        System.out.println("searchTaskName");
        String tName = "";
        String expResult = "";
        String result = ShowReport.searchTaskName(tName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of searchDeveloper method, of class ShowReport.
     */
    @Test
    public void testSearchDeveloper() {
        System.out.println("searchDeveloper");
        String developerName = "";
        String expResult = "";
        String result = ShowReport.searchDeveloper(developerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of fullReport method, of class ShowReport.
     */
    @Test
    public void testFullReport() {
        System.out.println("fullReport");
        String expResult = "";
        String result = ShowReport.fullReport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
