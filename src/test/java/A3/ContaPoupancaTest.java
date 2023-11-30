
package A3;

import A3.Cliente;
import A3.Conta;
import A3.ContaPoupanca;
import java.io.ByteArrayInputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;


public class ContaPoupancaTest {
    
    private Cliente cliente;
    private Conta conta;
    private ContaPoupanca contaPoupanca;
    
    public ContaPoupancaTest() {
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
    public void testConstrutorContaPoupanca(){       
        System.out.println("testConstrutorContaPoupanca");
        
        Cliente clienteMock = mock(Cliente.class);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
        
        assertNotNull(contaPoupanca);
        assertEquals(1, contaPoupanca.getAgencia());
        assertNotNull(contaPoupanca.getNumero());
        
    }


    @Test
    public void testImprimirExtrato() {
        cliente = Mockito.mock(Cliente.class);

        ContaPoupanca contaPoupanca = Mockito.mock(ContaPoupanca.class);
        
        System.setIn(new ByteArrayInputStream("4\n".getBytes()));
        
        try{
            
            contaPoupanca.imprimirExtrato();
            Mockito.verify(contaPoupanca, Mockito.times(1)).imprimirExtrato();
        }catch(Exception e){
            
            e.printStackTrace();
        }finally{
            System.setIn(System.in);
            
        } 
    }
    
}
