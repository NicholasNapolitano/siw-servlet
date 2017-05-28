package model;

import java.util.Date;

public class Prodotto {
	private String nome;
	private String descrizione;
	private String codice;
	private Float prezzo;
	private Date dataScadenza;
	
	public Date getDataScadenza() {
		return dataScadenza;
	}
	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public Float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}
	
	public Prodotto(String nome, String descrizione, String codice, Float prezzo, Date dataScadenza) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.codice = codice;
		this.prezzo = prezzo;
		this.dataScadenza = dataScadenza;
	}
	
	public Prodotto() {}
	
}