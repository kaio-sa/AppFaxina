package Servicos;

import Entidades.Endereco;

public class EnderecoServico {

	public static Endereco criarEndereco(String cep, String estado, String cidade,
			String bairro, String rua, Integer numero) {

		Endereco novoEndereco = new Endereco(cep, estado, cidade, bairro, rua, numero);

		System.out.println("Novo Endereço Criado Abaixo");
		System.out.println("Cep: " + novoEndereco.getCep());
		System.out.println("Estado: " + novoEndereco.getEstado());
		System.out.println("Cidade: " + novoEndereco.getCidade());
		System.out.println("Bairro: " + novoEndereco.getBairro());
		System.out.println("Rua: " + novoEndereco.getRua());
		System.out.println("Numero da Casa: " + novoEndereco.getNumCasa());

		return novoEndereco;
	}

}
