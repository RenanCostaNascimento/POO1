package cci;

import cdp.Usuario;
import cih.Tela;

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

}
