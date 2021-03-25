package Controller;

import Servicos.EnderecoServico;
import Servicos.ImovelServico;

public class Principal {

	public static void main(String[] args) {
		
		EnderecoServico.criarEndereco("39401-434", "MG", "Montes Claros", "Vera Cruz", "Não sei", 1942);
		System.out.println("   ");
		ImovelServico.criarImovel(3, 2, 2, 1, 3, 1, 33);


	}

}
