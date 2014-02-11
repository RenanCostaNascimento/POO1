package cdp;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Usuario implements Serializable{
	
	private String nome;
	private String idade;
	private String telefone;
	private Endereco endereco;
	private List<Usuario> contatos = new ArrayList<Usuario>();
	
	public Usuario(){
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public List<Usuario> getContatos() {
		return contatos;
	}
	public void setContatos(List<Usuario> contatos) {
		this.contatos = contatos;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void adicionarEndereco(){
		
		
	}
	
	public void adicionarAmigo(){
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("usuario.dat"));
			//out.writeObject(vetor);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void listarAmigo(){
		
	}
	
	public String toString(){
		
		return this.nome + ", " + this.idade + "anos, " + "telefone: " + this.telefone + ". " + this.endereco.toString();
	}
}
