package br.com.fiap.passageiroapi.android29scj.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Passageiro {

    @Id
    private int id;
    private String nome;
    private String sexo;
    private String uf;
    private boolean primeiraClasse;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public boolean isPrimeiraClasse() {
		return primeiraClasse;
	}
	public void setPrimeiraClasse(boolean primeiraClasse) {
		this.primeiraClasse = primeiraClasse;
	}
}