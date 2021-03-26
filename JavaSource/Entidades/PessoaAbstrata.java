package Entidades;

public abstract class PessoaAbstrata {

	private String nome;
	private String sobrenome;
	private Integer idade;
	private Integer numeroCeluar;
	private String sexo;
	private Endereco endereco;
	
	
	public PessoaAbstrata() {
		super();
	}	

	public PessoaAbstrata(String nome, String sobrenome, Integer idade, Integer numeroCeluar, String sexo,
			Endereco endereco) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.numeroCeluar = numeroCeluar;
		this.sexo = sexo;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getNumeroCeluar() {
		return numeroCeluar;
	}

	public void setNumeroCeluar(Integer numeroCeluar) {
		this.numeroCeluar = numeroCeluar;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
