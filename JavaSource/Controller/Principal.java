package Controller;

import java.math.BigInteger;
import java.util.Scanner;

import Entidades.Endereco;
import Servicos.EnderecoServico;
import Servicos.FaxineiraServico;
import Servicos.ImovelServico;
import Servicos.PerfilUsuarioServico;
import Servicos.ProprietarioImovelServico;

public class Principal {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		System.out.print("Informe o CEP ");
		String cep =lerTeclado.next();
		System.out.print("Informe o seu Estado ");
		String estado =lerTeclado.next();
		System.out.print("Informe a sua cidade ");
		String cidade =lerTeclado.next();
		System.out.print("Informe o seu bairro ");
		String bairro =lerTeclado.next();
		System.out.print("Informe a sua rua ");
		String rua =lerTeclado.next();
		System.out.print("Informe o numero da casa ");
		Integer numero =lerTeclado.nextInt();
		
		Endereco endereco = EnderecoServico.criarEndereco(cep, estado, cidade, bairro, rua, numero);
		System.out.println("   ");
		ImovelServico.criarImovel(3, 2, 2, 1, 3, 1, 33);
		System.out.println("   ");
		FaxineiraServico.criarFaxineira("kaio", "Lima", 15, 988393785, "Homem",endereco );
		System.out.println("   ");
        PerfilUsuarioServico.criarPerfilUsuario("kaiolima", "12345senha", "Diarista/faxineira");
        System.out.println("   ");
        ProprietarioImovelServico.criarProprietarioImovel("aline", "lima", 19, 988393785, "Mulher",endereco );

	}

}
