package ifes.edu.poo1.cci;

import ifes.edu.poo1.cdp.Usuario;
import ifes.edu.poo1.cih.Tela;

public class ControladorTela {
	
	Tela tela = new Tela();

	public int telaInicial(){
		
		return tela.telaInicial();
		
	}
	
	public Usuario criarContato(){
		
		return tela.criarContato();
		
	}
	
	public void listarContatos(Usuario usuario){
		
		tela.listarContatos(usuario);
		
	}
	
	public String removerContato(){
		
		return tela.removerContato();
		
	}

}
