
package A3;

import A3.Cliente;
import A3.Conta;
import A3.ContaCorrente;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.mockito.Mockito;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class ContaTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    
    private Cliente cliente;
    private Cliente cliente2;
    private Conta conta;
    private Conta conta2;

    
    public ContaTest() {
    }
    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void restoreStreams(){
        System.setOut(originalOut);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        cliente = Mockito.mock(Cliente.class);
        conta = new ContaCorrente(cliente);
        
        cliente2 = Mockito.mock(Cliente.class); 
        conta2 = new ContaCorrente(cliente2);
        
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testSacarSaldoSuficiente() {
        System.out.println("sacar");
        
        conta.depositar(100.0);
        conta.sacar(50);
        assertEquals(50.0, conta.getSaldo(), 0.01);
    }
    
    @Test
    public void testSacarSaldoInsuficiente() {
        System.out.println("sacar sem saldo");
        
        conta.sacar(50.0);
        assertEquals(0.0, conta.getSaldo(), 0.01);
    }


    @Test
    public void testDepositar() {
        conta.depositar(100.0);
        assertEquals(100.0, conta.getSaldo(), 100.0);
    }

    @Test
    public void testTransferirSaldoSuficuente() {
        System.out.println("transferir");
        
        conta.depositar(100);
        conta.transferir(conta2, 50.0);
        assertEquals(50.0, conta.getSaldo(), 0.01);
        assertEquals(50.0, conta2.getSaldo(), 0.01);
    }
    
    @Test
    public void testTransferirSaldoInsuficuente() {
        System.out.println("transferir");
        
        conta.transferir(conta2, 50.0);
        assertEquals(0, conta.getSaldo(), 0.01);
        assertEquals(0, conta2.getSaldo(), 0.01);
    }


    @Test
    public void testGetAgencia() {
        Conta conta = Mockito.mock(Conta.class);
        
        when(conta.getAgencia()).thenReturn(42);
        assertEquals(42, conta.getAgencia());
        verify(conta, times(1)).getAgencia();
    }


    @Test
    public void testGetNumero() {
        Conta conta = Mockito.mock(Conta.class);
        
        when(conta.getNumero()).thenReturn(123);
        assertEquals(123, conta.getNumero());
        verify(conta, times(1)).getNumero();
    }


    @Test
    public void testGetSaldo() {
        Conta conta = Mockito.mock(Conta.class);
        
        when(conta.getSaldo()).thenReturn(1000.0);
        assertEquals(1000.0, conta.getSaldo(), 0.01);
        verify(conta, times(1)).getSaldo();
    }
    
    @Test
    public void testCostrutorConta(){
        System.out.println("testConstrutorConta");
        
        assertNotNull(conta);
        assertEquals(1, conta.getAgencia());
        assertNotNull(conta.getAgencia());
    }



}
