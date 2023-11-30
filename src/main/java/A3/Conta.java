package A3;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		if(valor<=this.saldo) {
			this.saldo -= valor;
                        System.out.println("Saque completo");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
                System.out.println("Deposito completo");
	}
	
	@Override
	public void transferir(Conta contaDestino, double valor) {
                if(valor<=this.saldo) {
                    this.saldo -= valor;
                    contaDestino.depositar(valor);
                    System.out.println("Trasferencia completa");
		}else {
                    System.out.println("Saldo insuficiente");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: " + this.cliente.getNome() + "\nAgencia: " + this.agencia + "\nNumero: " + this.numero +"\nSaldo: " + this.saldo));
	}
	
	
	
	
	
	
}
