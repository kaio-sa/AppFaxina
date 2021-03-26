package Entidades;

public class Faxineira extends PessoaAbstrata {

	public Faxineira() {
		super();
	}

	public Faxineira(String nome, String sobrenome, Integer idade, Integer numeroCeluar, String sexo,
			Endereco endereco) {
		super(nome, sobrenome, idade, numeroCeluar, sexo, endereco);
		}

}
