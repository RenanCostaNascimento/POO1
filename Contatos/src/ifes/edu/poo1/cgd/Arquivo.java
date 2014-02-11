package ifes.edu.poo1.cgd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Arquivo<T extends Serializable> {
	
	private String path;
	

	public T carregarAgenda() {
		
		T object = null;
		
		try { //"C:\\Users\\20121bsi0252\\Downloads\\usuario.dat
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\20121bsi0252\\Downloads\\usuario.dat"));
			object = (T) in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado.");
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			System.out.println("Classe não encontrada.");
			e.printStackTrace();
		}
		
		return object;
		
	}
	
	public void salvar(T t){
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\20121bsi0252\\Downloads\\usuario.dat"));
			out.writeObject(t);
			out.close();
		} catch (Exception e) {
			System.out.println("Erro de salvamento!");
			e.printStackTrace();
		}
		
	}
}
