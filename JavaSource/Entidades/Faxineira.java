package Entidades;

public class Faxineira extends PessoaAbstrata {

	public Faxineira() {
		super();
	}

	public Faxineira(String nome, String sobrenome, Integer idade, Integer numCelular, String sexo,
			Endereco endereco) {
		super(nome, sobrenome, idade, numCelular, sexo, endereco);
		}

}
