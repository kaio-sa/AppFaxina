package Entidades;

public class ProprietarioImovel extends PessoaAbstrata {


	public ProprietarioImovel() {
		super();
	}

	public ProprietarioImovel(String nome, String sobrenome, Integer idade, Integer numeroCeluar, String sexo,
			Endereco endereco) {
		super(nome, sobrenome, idade, numeroCeluar, sexo, endereco);
		}

	
}
