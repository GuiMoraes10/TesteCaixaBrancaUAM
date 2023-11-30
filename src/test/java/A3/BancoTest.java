
package A3;

import A3.Conta;
import A3.Banco;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

public class BancoTest {
    
    public BancoTest() {
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
        
        Banco banco = new Banco();
        
        banco.setNome("banco"); 
        assertEquals("banco", banco.getNome());
    }
    
    
    @Test
    public void testSetAndGetContas(){
        
        Banco banco = new Banco();        
        List<Conta> contas = mock(List.class);
        
        banco.setContas(contas);
        
        assertEquals(contas, banco.getContas());   
    }
    
    
    @Test
    public void testConstrutorBanco(){
        System.out.println("testConstrutorBanco");
        
        Banco banco = new Banco();
        assertNotNull(banco);
    }
    
}
