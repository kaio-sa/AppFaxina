package Servicos;

import Entidades.Endereco;
import Entidades.Faxineira;

public class FaxineiraServico {

	public static Faxineira criarFaxineira(String nome, String sobrenome, Integer idade, Integer numCelular,
			String sexo, Endereco endereco) {

		Faxineira aFaxineira = new Faxineira(nome, sobrenome, idade, numCelular, sexo, endereco);

		System.out.println("Nome: "+ aFaxineira.getNome());
		System.out.println("Sobrenome: "+ aFaxineira.getSobrenome());
		System.out.println("Sua idade: "+ aFaxineira.getIdade());
		System.out.println("Seu numero de celular: "+ aFaxineira.getNumeroCeluar());
		System.out.println("Sua sexualidade: "+ aFaxineira.getSexo());
		System.out.println("Seu estado: "+ endereco.getEstado());
		System.out.println("Sua cidade: "+ endereco.getCidade());
		System.out.println("Seu bairro: "+ endereco.getBairro());
		System.out.println("Sua rua: "+ endereco.getRua());
		
		return aFaxineira;

	}

}
