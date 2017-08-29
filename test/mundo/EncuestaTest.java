/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class EncuestaTest {

    private Encuesta enc;

    public EncuestaTest() {
        this.enc = new Encuesta();
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
     * Test of calcularPromedio method, of class Encuesta.
     */
    @Test
    public void testCalcularPromedio() {
        System.out.println("calcularPromedio");
        Encuesta instance = this.enc;
        int expResult = 0;
        int result = instance.calcularPromedio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularCantidadMayor method, of class Encuesta.
     */
    @Test
    public void testCalcularCantidadMayor() {
        System.out.println("calcularCantidadMayor");
        Encuesta instance = this.enc;
        int expResult = 2;
        int result = instance.calcularCantidadMayor();
        System.out.println("esto es el mayor" + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of addPersona method, of class Encuesta.
     */
    @Test
    public void testAddPersona() {
        System.out.println("addPersona");
        Persona p = new Persona(1093770352, 3000, 1);
        Encuesta instance = this.enc;
        String expResult = "OK";
        String result = instance.addPersona(p);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
