
public class Cliente {

	/* 2ª Questão a) Não, por que está tudo agrupado em uma classe, o correto seria
	 * agrupar por responsabilidade. Por exemplo, a classe Controlador, está com todas as 
	 * responsabilidades, resolvemos este caso criando mais duas classes, sendo elas, Cliente e Conta
	 * cada uma com as responsabilidades que são de suas classes.
	 */	
	
	 public void CadastrarCliente(Cliente cliente){}
	 public void ExcluirCliente(long clienteId){}
	 public void ProcurarClientePeloNome(String nomeCliente){}
}
