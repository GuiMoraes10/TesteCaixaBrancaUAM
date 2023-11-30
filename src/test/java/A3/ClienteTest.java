
package A3;

import A3.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ClienteTest {
    
    public ClienteTest() {
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
    
    @Test
    public void testSetAndGetNome(){
        Cliente cliente = new Cliente();
        cliente.setNome("gui");
        assertEquals("gui", cliente.getNome());
    }
    
    @Test
    public void testConstrutorCliente(){
        System.out.println("testConstrutorCliente");
        
        Cliente cliente = new Cliente();
        assertNotNull(cliente);
    }
    
}
