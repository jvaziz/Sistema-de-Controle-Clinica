package br.ucsal;
import java.util.Date;

public class Exame {

private int id;
private String nome,
			   descricao,
			   observacao,
			   categoria;
private Date dataCadastro;
private boolean status;
	
	//Construtor da classe Exame com tratamento de erro
	public Exame(int id, String nome, String descricao, String observacao, String categoria, Date dataCadastro, boolean status) {
		try {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.observacao = observacao;
		this.categoria = categoria;
		this.dataCadastro = dataCadastro;
    	this.status = status;
		} catch (Exception e) {
	        System.out.println("Ocorreu um erro no método construtor.");
	        e.printStackTrace();
	    }
	}



	//Getters e Setters para acessar e modificar os atributos encapsulados.
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

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}
	
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
}
