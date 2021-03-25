package Servicos;

import Entidades.Imovel;

public class ImovelServico {

	public static Imovel criarImovel(Integer qtdQuartos, Integer qtdBanheiros, Integer qtdCozinhas, Integer qtdAndares,
			Integer qtdGaragens, Integer qtdAnimais, Integer tamanhoEstimadoCasa) {

		Imovel novoImovel = new Imovel(qtdQuartos, qtdBanheiros, qtdCozinhas, qtdAndares, qtdGaragens, qtdAnimais,
				tamanhoEstimadoCasa);

		System.out.println("Informaçoes do imovel abaixo");
		System.out.println("Quantidade de quartos no imovel: " + novoImovel.getQtdQuartos());
		System.out.println("Quantidade de banheiros no imovel: " + novoImovel.getQtdBanheiros());
		System.out.println("Quantidade de cozinhas no imovel: " + novoImovel.getQtdCozinhas());
		System.out.println("Quantidade de andares: " + novoImovel.getQtdAndares());
		System.out.println("Quantidade de garagens no imovel: " + novoImovel.getQtdGaragens());
		System.out.println("Quantidade de animais que tem no imovel: " + novoImovel.getQtdAnimais());
		System.out.println("Tamano do Imovel: " + novoImovel.getTamanhoEstimadoCasa());

		return novoImovel;

	}

}
