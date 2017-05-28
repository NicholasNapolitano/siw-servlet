package it.uniroma3.servlet;
public class Studente {

	private String matricola;
	private String nome;
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Studente(String matricola, String nome) {
		super();
		this.matricola = matricola;
		this.nome = nome;
	}
	
}