package br.ucsal;

import java.util.Date;

//herança 
public class Paciente extends Pessoa {

private double contato;
private String rua,
			   bairro,
			   cidade,
			   estado;
private int cep;
private Date data;
private int QtdAtendimentos;



//Construtor da classe Paciente com tratamento de erro
public Paciente(int id, String nome, int contato, String rua, String bairro, String cidade, String estado, int cep, Date data, boolean b) {
	super(id, nome, contato);
	try {
	this.rua = rua;
	this.bairro = bairro;
	this.cidade = cidade;
	this.estado = estado;
	this.cep = cep;
	} catch (Exception e) {
        System.out.println("Ocorreu um erro no método construtor.");
        e.printStackTrace();
    }
}

//Getters e Setters para acessar e modificar os atributos encapsulados.
public double getContato() {
	return contato;
}
public void setContato(int contato) {
	this.contato = contato;
}

public String getRua() {
	return rua;
}
public void setRua(String rua) {
	this.rua = rua;
}

public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}

public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}

public int getCep() {
	return cep;
}
public void setCep(int cep) {
	this.cep = cep;
}

public int getQtdAtendimentos() {
	return QtdAtendimentos;
}
public void setQtdAtendimentos(int qtdAtendimentos) {
	QtdAtendimentos = qtdAtendimentos;
}
}

