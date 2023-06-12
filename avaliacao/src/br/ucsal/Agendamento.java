package br.ucsal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Agendamento {
	
	 private int Id;
	 private Paciente paciente;
	 private String especialidade;
	 private ProfissionalSaude profissionalSaude;
	 private String Convenio;
	 private String TipoAtendimento;
	 private String Local;
	 private Date DataAtendimento;
	 private String Situacao;
	 private boolean status;
	 
	 
	 
	 
	 //Construtor de Agendamento com tratamento de erro 
	 public Agendamento(int id, Paciente paciente, ProfissionalSaude profissionalSaude, Date dataAtendimento, String tipoAtendimento, String local, boolean status) {
		    try {
		        this.Id = id;
		        this.paciente = paciente;
		        this.profissionalSaude = profissionalSaude;
		        this.DataAtendimento = dataAtendimento;
		        this.TipoAtendimento = tipoAtendimento;
		        this.Local = local;
		        this.status = status;
		    } catch (Exception e) {
		        System.out.println("Ocorreu um erro no método construtor.");
		        e.printStackTrace();
		    }
		}


	//Getters e Setters para acessar e modificar os atributos encapsulados.
	 public int getId() {
	  return Id;
	 }
	 public void setId(int id) {
	  Id = id;
	 }



	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	 


	 public String getEspecialidade() {
	  return especialidade;
	 }
	 public void setEspecialidade(String especialidade) {
	  this.especialidade = especialidade;
	 }


	 
	 public ProfissionalSaude getProfissionalSaude() {
			return profissionalSaude;
		}
	public void setProfissionalSaude(ProfissionalSaude profissionalSaude) {
			this.profissionalSaude = profissionalSaude;
		}



	 public String getConvenio() {
	  return Convenio;
	 }
	 public void setConvenio(String convenio) {
	  Convenio = convenio;
	 }



	 public String getTipoAtendimento() {
	  return TipoAtendimento;
	 }
	 public void setTipoAtendimento(String tipoAtendimento) {
	  TipoAtendimento = tipoAtendimento;
	 }



	 public String getLocal() {
	  return Local;
	 }
	 public void setLocal(String local) {
	  Local = local;
	 }



	 public Date getDataAtendimento() {
	  return DataAtendimento;
	 }
	 public void setDataAtendimento(Date dataAtendimento) {
	  DataAtendimento = dataAtendimento;
	 }



	 public String getSituacao() {
	  return Situacao;
	 }
	 public void setSituacao(String situacao) {
	  Situacao = situacao;
	 }



	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
		}

	}

