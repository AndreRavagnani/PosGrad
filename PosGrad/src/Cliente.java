
public class Cliente {

	/* 2� Quest�o a) N�o, por que est� tudo agrupado em uma classe, o correto seria
	 * agrupar por responsabilidade. Por exemplo, a classe Controlador, est� com todas as 
	 * responsabilidades, resolvemos este caso criando mais duas classes, sendo elas, Cliente e Conta
	 * cada uma com as responsabilidades que s�o de suas classes.
	 */	
	
	 public void CadastrarCliente(Cliente cliente){}
	 public void ExcluirCliente(long clienteId){}
	 public void ProcurarClientePeloNome(String nomeCliente){}
}
