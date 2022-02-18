
public class TestaBanco {

	public static void main(String[] args) {
		Cliente lucas = new Cliente();
		
		lucas.nome		= "Lucas Rocha";
		lucas.cpf		= "222.222.222-22";
		lucas.profissao	= "programador";
		
		Conta contaDoLucas = new Conta();
		contaDoLucas.deposita(100);
		
		contaDoLucas.titular = lucas;
		System.out.println(contaDoLucas.titular.nome);
		System.out.println(contaDoLucas.titular);
		System.out.println(lucas);
	}
}
