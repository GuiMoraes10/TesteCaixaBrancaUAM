package A3;

import java.util.Scanner;

public class Menu {

    private Conta contaCorrente;
    private Conta contaPoupanca;
    private Scanner scanner;
    private Cliente cliente;

    public Menu(Cliente cliente, Scanner scanner) {
        this.contaCorrente = new ContaCorrente(cliente);
        this.contaPoupanca = new ContaPoupanca(cliente);
        this.scanner = scanner;
    }

    public void exibirMenuPrincipal() {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Bem-vindo ao seu banco!");
            System.out.println("Digite seu nome:");
            String nome = ler.nextLine();
            Cliente cliente = new Cliente();
            cliente.setNome(nome);

            System.out.println("1) Conta corrente\n2) Conta poupança\n3) Sair");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    exibirMenuContaCorrente(cliente);
                    break;

                case 2:
                    exibirMenuContaPoupanca(cliente);
                    break;

                case 3:
                    System.out.println("Encerrado");
                    contaCorrente.imprimirExtrato();
                    contaPoupanca.imprimirExtrato();
                    break;

                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }

        } while (opcao != 3);
    }

    public void exibirMenuContaCorrente(Cliente cliente) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("MENU CONTA CORRENTE");
            System.out.println("1) Saques\n2) Depósitos \n3) Extrato\n4) Sair");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor:");
                    int valorSaque = ler.nextInt();
                    contaCorrente.sacar(valorSaque);
                    break;

                case 2:
                    System.out.println("Digite o valor do depósito");
                    double valorDeposito = ler.nextDouble();
                    contaCorrente.depositar(valorDeposito);
                    break;

                case 3:
                    contaCorrente.imprimirExtrato();
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar!");
                    break;

                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        } while (opcao != 4);
    }

    public void exibirMenuContaPoupanca(Cliente cliente) {
        Scanner ler = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("MENU CONTA POUPANÇA");
            System.out.println("1) Saques\n2) Depósitos \n3) Extrato\n4) Sair");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor:");
                    int valorSaque = ler.nextInt();
                    contaPoupanca.sacar(valorSaque);
                    break;

                case 2:
                    System.out.println("Digite o valor do depósito");
                    double valorDeposito = ler.nextDouble();
                    contaPoupanca.depositar(valorDeposito);
                    break;

                case 3:
                    contaPoupanca.imprimirExtrato();
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar!");
                    break;

                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        } while (opcao != 4);
    }
}
