package ifes.edu.poo1.cgt;

import ifes.edu.poo1.cci.ControladorTela;
import ifes.edu.poo1.cdp.Endereco;
import ifes.edu.poo1.cdp.Usuario;
import ifes.edu.poo1.cgd.Arquivo;

import java.util.Iterator;

public class ControladorAplicacao {

	private ControladorTela controladorTela = new ControladorTela();
	private Usuario usuario = new Usuario();
	private Arquivo<Usuario> arquivo = new Arquivo<Usuario>();
	
	public void inicio(){
				
		usuario = arquivo.carregarAgenda();
		
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
			case 3: {
				removerContato();
				menuInicial();
				break;
			}
			default:{
				sair();
				System.out.println("Adeus!");
			}
		}

	}
	
	private void removerContato() {
		
		String nome = controladorTela.removerContato();
		
		Iterator iterator = usuario.getContatos().iterator();
		
		while(iterator.hasNext()){
			Usuario contato = (Usuario) iterator.next();
			if(contato.getNome().equals(nome)){
				iterator.remove();
				break;
			}
		}
		
	}

	private void criarContato(){
		
		usuario.getContatos().add(controladorTela.criarContato());
		
	}
	
	private void listarContatos(){
		
		controladorTela.listarContatos(usuario);
		
	}
	
	private void sair(){
		arquivo.salvar(usuario);
	}

}
