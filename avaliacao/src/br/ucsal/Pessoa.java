package br.ucsal;

import java.util.Date;

public class Pessoa {
	private int id;
	private String nome;
	private Date dataCadastro;
	protected boolean status;
	
	//Construtor da classe Pessoa com tratamento de erro
	public Pessoa(int id, String nome, int contato) {
		try {
		this.id = id;
		this.nome = nome;
		this.dataCadastro = new Date();
		this.status = true;
		} catch (Exception e) {
	        System.out.println("Ocorreu um erro no método construtor.");
	        e.printStackTrace();
	    }
	}
	
	//Getters e Setters para acessar e modificar os atributos encapsulados.
	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

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
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
