package cih;

import java.util.Scanner;

import cdp.Endereco;
import cdp.Usuario;


public class Tela {
	
	Scanner scanner = new Scanner(System.in);

	public int telaInicial(){
		
		System.out.println("1-Novo usuario\n" +
				"2-Listar usuarios\n" +
				"3-Sair");
		
		return scanner.nextInt();
		
	}
	
	public Usuario criarContato(){
		
		Usuario usuario = new Usuario();
		Endereco endereco = new Endereco();
		
		/*preenchendo dados do usuario*/
		System.out.println("Nome: ");
		usuario.setNome(scanner.next());
		System.out.println("Idade: ");
		usuario.setIdade(scanner.next());
		System.out.println("Telefone: ");
		usuario.setTelefone(scanner.next());
		
		/*preenchendo endereco do usuario*/
		System.out.println("Logradouro: ");
		endereco.setLogradouro(scanner.next());
		System.out.println("Numero: ");
		endereco.setNumero(scanner.next());
		System.out.println("Bairro: ");
		endereco.setBairro(scanner.next());
		System.out.println("Cidade: ");
		endereco.setCidade(scanner.next());
		System.out.println("Estado: ");
		endereco.setEstado(scanner.next());
		
		usuario.setEndereco(endereco);
		
		return usuario;
		
		
	}

	public void listarContatos(Usuario usuario) {
		
		for(Usuario contato : usuario.getContatos()){
			System.out.println("-- " + contato.toString());
		}
		
	}
	
	



}
