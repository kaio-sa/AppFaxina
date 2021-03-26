package Servicos;

import Entidades.Endereco;
import Entidades.ProprietarioImovel;

public class ProprietarioImovelServico {

	public static ProprietarioImovel criarProprietarioImovel(String nome, String sobrenome, Integer idade, Integer numCelular,
			String sexo, Endereco endereco) {

		ProprietarioImovel propritarioImovel = new ProprietarioImovel(nome, sobrenome, idade, numCelular, sexo, endereco);

		System.out.println("Nome: "+ propritarioImovel.getNome());
		System.out.println("Sobrenome: "+ propritarioImovel.getSobrenome());
		System.out.println("Sua idade: "+ propritarioImovel.getIdade());
		System.out.println("Seu numero de celular: "+ propritarioImovel.getNumeroCeluar());
		System.out.println("Sua sexualidade: "+ propritarioImovel.getSexo());
		System.out.println("Seu estado: "+ endereco.getEstado());
		System.out.println("Sua cidade: "+ endereco.getCidade());
		System.out.println("Seu bairro: "+ endereco.getBairro());
		System.out.println("Sua rua: "+ endereco.getRua());
		
		return propritarioImovel;

	}
}
