
package A3;

import A3.Cliente;
import A3.Conta;
import A3.ContaCorrente;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;


public class ContaCorrenteTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Cliente cliente;
    private Conta conta;
    private ContaCorrente contaCorrente;
    
    public ContaCorrenteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void tearDown() {
        System.setOut(System.out);
    }
    
    @Test
    public void testConstrutorContaCorrente(){
        
        System.out.println("testConstrutorContaCorrente");
        
        Cliente clienteMock = mock(Cliente.class);
        ContaCorrente contaCorrente = new ContaCorrente(cliente);
        
        assertNotNull(contaCorrente);
        assertEquals(1, contaCorrente.getAgencia());
        assertNotNull(contaCorrente.getNumero());
    }


    @Test
    public void testImprimirExtrato() {
        cliente = Mockito.mock(Cliente.class);

        ContaCorrente contaCorrente = Mockito.mock(ContaCorrente.class);
        
        System.setIn(new ByteArrayInputStream("4\n".getBytes()));
        
        try{
            
            contaCorrente.imprimirExtrato();
            Mockito.verify(contaCorrente, Mockito.times(1)).imprimirExtrato();  
        }catch(Exception e){
            
            e.printStackTrace();  
        }finally{  
            
            System.setIn(System.in);
        }  
    }
}
