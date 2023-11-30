package A3;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(Conta contaDestino, double valor);
	
	void imprimirExtrato();
	
	
}
