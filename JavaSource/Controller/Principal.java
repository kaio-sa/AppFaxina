package Controller;

import Entidades.Endereco;
import Servicos.EnderecoServico;
import Servicos.FaxineiraServico;
import Servicos.ImovelServico;
import Servicos.PerfilUsuarioServico;

public class Principal {

	public static void main(String[] args) {
		
		Endereco endereco = EnderecoServico.criarEndereco("39401-434", "MG", "Montes Claros", "Vera Cruz", "Não sei", 1942);
		System.out.println("   ");
		ImovelServico.criarImovel(3, 2, 2, 1, 3, 1, 33);
		System.out.println("   ");
		FaxineiraServico.criarFaxineira("kaio", "Lima", 15, 988393785, "Homem",endereco );
		System.out.println("   ");
        PerfilUsuarioServico.criarPerfilUsuario("kaiolima", "12345senha", "diarista/faxineira");

	}

}
