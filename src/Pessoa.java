
public class Pessoa {
	
	private String nome;
	private Integer idade;
	private Integer altura;
	private Integer peso;
	public Pessoa(String nome, Integer idade, Integer altura, Integer peso) { //método contructor com campos
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	public Pessoa() { //método contructo vazio
		super();
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	
		
	
	
	

}
