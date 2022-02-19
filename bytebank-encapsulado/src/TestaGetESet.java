
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente lucas = new Cliente();
		// conta.titular = lucas;
		lucas.setNome("lucas rocha");
		
		conta.setTitular(lucas);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		//agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(lucas);
		System.out.println(conta.getTitular());
	}
}
