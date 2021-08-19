/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorsmp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Elix
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void testMakeFormula() {
        System.out.println("MakeFormula");
        boolean expResult = true;
        String result = Operations.MakeFormula();

        String[] l = result.split("-|\\+|\\*|\\/");
        for(int i=0; i<l.length; i++){
            result.replace(l[i], "");
        }
        for(int j=0; j<result.length();j++){
            if(!("/".equals(result.charAt(j)) || "+".equals(result.charAt(j)) || "-".equals(result.charAt(j)) || "*".equals(result.charAt(j)))){
                expResult=false;
            }
        }
        assertTrue(expResult);
    }

    /**
     * Test of Solve method, of class Operations.
     */

    @Test
    public void testSolve() {
        System.out.println("Solve");
        String formula = "";
        String expResult = "";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
    }
    
}
