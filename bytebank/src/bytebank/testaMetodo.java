package bytebank;

public class testaMetodo {

	public static void main(String[] args) {

		Conta contaDoLucas = new Conta();
		contaDoLucas.saldo = 100;
		contaDoLucas.deposita(50);
		System.out.println(contaDoLucas.saldo);
		contaDoLucas.saca(20);
		System.out.println(contaDoLucas.saldo);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		if (contaDaMarcela.transfere(300, contaDoLucas)) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoLucas.saldo);
		
		contaDoLucas.titular = "Lucas Rocha";
		System.out.println(contaDoLucas.titular);
	}

}
