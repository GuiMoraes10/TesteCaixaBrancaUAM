
package A3;

import A3.Menu;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;


public class MenuTest {
    
    public MenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Cliente cliente = new Cliente();
    }
    
    @After
    public void tearDown() {
    }
   
    
    @Test
    public void testMenuPrincipal(){

        Cliente clienteMock = Mockito.mock(Cliente.class);

        
        Menu menu = new Menu(clienteMock, null);


        System.setIn(new ByteArrayInputStream("Nome do Cliente\n".getBytes()));

        try {

            menu.exibirMenuPrincipal();


            Mockito.verify(clienteMock).setNome("Nome do Cliente");

        } catch (Exception e) {
       
            e.printStackTrace();
        } finally {
            
            System.setIn(System.in);
        }    
    }
    @Test
    public void testMenuContaCorrente() {
        Cliente clienteMock = Mockito.mock(Cliente.class);
        Menu menu = new Menu(clienteMock, null);
        clienteMock.setNome("nome");

        
        System.setIn(new ByteArrayInputStream("5\n2\n100\n1\n200\n1\n50\n3\n4\n3\n".getBytes()));

        try {
            menu.exibirMenuContaCorrente(clienteMock);

            
            Mockito.verify(clienteMock, Mockito.times(1)).setNome(Mockito.anyString());
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            System.setIn(System.in);
        }
    }

    @Test
    public void testMenuContaPoupanca() {
        Cliente clienteMock = Mockito.mock(Cliente.class);
        Menu menu = new Menu(clienteMock, null);
        clienteMock.setNome("nome");

        
        System.setIn(new ByteArrayInputStream("5\n2\n100\n1\n200\n1\n50\n3\n4\n3\n".getBytes()));

        try {
            menu.exibirMenuContaPoupanca(clienteMock);

            
            Mockito.verify(clienteMock, Mockito.times(1)).setNome(Mockito.anyString());
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            System.setIn(System.in);
        }
    }

}
