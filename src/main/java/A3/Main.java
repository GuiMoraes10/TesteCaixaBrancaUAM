package A3;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        System.out.println("Ola");
        Scanner ler = new Scanner(System.in);

        Cliente c1 = new Cliente();

        Menu menu = new Menu(c1, ler);
        menu.exibirMenuPrincipal();
    }
}

