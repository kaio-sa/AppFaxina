package Servicos;

import Entidades.PerfilUsuario;

public class PerfilUsuarioServico {


	public static PerfilUsuario criarPerfilUsuario(String login, String senha, String tipoUsuario) {
		
		PerfilUsuario usuario = new PerfilUsuario(login, senha, tipoUsuario);
		
		  System.out.println("Seu login: "+ usuario.getLogin());
		  System.out.println("Sua senha: "+ usuario.getSenha());
		  System.out.println("Seu tipo de usuario: "+ usuario.getTipoUsuario());
		  
		return usuario;
		
	}
	

}
