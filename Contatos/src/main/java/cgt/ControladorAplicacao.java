package cgt;

import cci.ControladorTela;
import cdp.Usuario;
import cgd.Arquivo;

public class ControladorAplicacao {

	private ControladorTela controladorTela = new ControladorTela();
	private Usuario usuario = new Usuario();
	private Arquivo arquivo = new Arquivo();
	
	public void inicio(){
		
		arquivo.carregarAgenda();
		
		menuInicial();
		
	}
	
	private void menuInicial() {

		int opcao = controladorTela.telaInicial();

		switch (opcao) {
			case 1: {
				criarContato();
				menuInicial();
				break;
			}
			case 2: {
				listarContatos();
				menuInicial();
				break;
			}
			default: {
				System.out.println("Sair");
			}
		}

	}
	
	private void criarContato(){
		
		usuario.getContatos().add(controladorTela.criarContato());
		
	}
	
	private void listarContatos(){
		
		controladorTela.listarContatos(usuario);
		
	}

}
