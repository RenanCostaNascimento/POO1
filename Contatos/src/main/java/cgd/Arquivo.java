package cgd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import cdp.Usuario;

public class Arquivo {

	public Usuario carregarAgenda() {
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\20121bsi0252\\Downloads\\usuario.dat"));
			Usuario usuario = (Usuario)in.readObject();
			in.close();
			return usuario;
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro de I/O.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Classe não encontrada.");
			e.printStackTrace();
		}
		
		return new Usuario();
		
	}

	
		
}
