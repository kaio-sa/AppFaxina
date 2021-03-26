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
		String cep = lerTeclado.next();

		System.out.print("Informe o seu Estado ");
		String estado = lerTeclado.next();

		System.out.print("Informe a sua cidade ");
		String cidade = lerTeclado.next();

		System.out.print("Informe o seu bairro ");
		String bairro = lerTeclado.next();

		System.out.print("Informe a sua rua ");
		String rua = lerTeclado.next();

		System.out.print("Informe o numero da casa ");
		Integer numero = lerTeclado.nextInt();

		System.out.print("Informe o numero de quartos ");
		Integer quartos = lerTeclado.nextInt();

		System.out.print("Informe o numero Banheiros ");
		Integer banheiro = lerTeclado.nextInt();

		System.out.print("Informe o numero de cozinhas ");
		Integer cozinhas = lerTeclado.nextInt();

		System.out.print("Informe o numero de andares ");
		Integer andares = lerTeclado.nextInt();

		System.out.print("Informe o numero de garagens ");
		Integer garagens = lerTeclado.nextInt();

		System.out.print("Informe o numero de animais de estimação ");
		Integer animais = lerTeclado.nextInt();

		System.out.print("Informe o tamanho da casa (metro quadrado) ");
		Integer tamanhoCasa = lerTeclado.nextInt();

		System.out.print("Informe seu NOME ");
		String nome = lerTeclado.next();

		System.out.print("Informe seu Sobrenome ");
		String sobrenome = lerTeclado.next();

		System.out.print("Informe sua IDADE ");
		Integer idade = lerTeclado.nextInt();

		System.out.print("Informe seu NUMERO de celular ");
		Integer numCelular = lerTeclado.nextInt();

		System.out.print("Informe seu SEXO ");
		String sexo = lerTeclado.next();

		System.out.print("Informe qual seu tipo de usuario ");
		String usuario = lerTeclado.next();

		System.out.print("Informe seu login ");
		String login = lerTeclado.next();

		System.out.print("Informe sua senha ");
		String senha = lerTeclado.next();

		Endereco endereco = EnderecoServico.criarEndereco(cep, estado, cidade, bairro, rua, numero);
		System.out.println("   ");
		ImovelServico.criarImovel(quartos, banheiro, cozinhas, andares, garagens, animais, tamanhoCasa);
		System.out.println("   ");
		FaxineiraServico.criarFaxineira(nome, sobrenome, idade, numCelular, sexo, endereco);
		System.out.println("   ");
		PerfilUsuarioServico.criarPerfilUsuario(login, senha, usuario);
		System.out.println("   ");
		ProprietarioImovelServico.criarProprietarioImovel(nome, sobrenome, idade, numCelular, sexo, endereco);

	}

}
