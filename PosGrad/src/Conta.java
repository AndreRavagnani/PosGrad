
public class Conta {

	public Cliente cliente;

	public void DepositarQuantiaEmConta(int contaId, double quantia) {
	}

	public void SacarQuantiaEmConta(long contaId, double quantia) {
	}

	public Conta ProcurarContaPeloId(long contaId) {
		return new Conta();
	}

	public void CriarNovaConta(Cliente cliente) {
	}

	public void ExcluirConta(long contaId) {
	}

	public void TransferirQuantia(Conta ctaOrigem, Conta ctaDestino) {
	}
}
