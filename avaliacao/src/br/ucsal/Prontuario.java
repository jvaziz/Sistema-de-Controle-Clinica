package br.ucsal;
import java.util.Date;
import java.util.List;


public class Prontuario {
	 private int id;
	 private Paciente paciente;
	 private ProfissionalSaude profissionalDeSaude;
	 private String descricaoAtendimento;
	 private String tratamentoSugerido;
	 private List<Exame> examesSolicitados;
	 private String observacoes;
	 private Date dataDoCadastro;
	 private boolean status;
	    
	 
	 //Construtor da classe Prontuario com tratamento de erro	    
	 public Prontuario(int id, Paciente paciente, ProfissionalSaude profissionalDeSaude, String descricaoAtendimento, String tratamentoSugerido, Exame examesSolicitados, String observacoes, Date dataDoCadastro, boolean status) {
		try {
		this.id = id;
		this.paciente = paciente;
		this.profissionalDeSaude = profissionalDeSaude;
		this.descricaoAtendimento = descricaoAtendimento;
		this.tratamentoSugerido = tratamentoSugerido;
		this.examesSolicitados = (List<Exame>) examesSolicitados;
		this.observacoes = observacoes;
		this.dataDoCadastro = dataDoCadastro;
		this.status = status;
		} catch (Exception e) {
	        System.out.println("Ocorreu um erro no método construtor.");
	        e.printStackTrace();
	    }
	 }


	// Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public ProfissionalSaude getProfissionalDeSaude() {
		return profissionalDeSaude;
	}

	public void setProfissionalDeSaude(ProfissionalSaude profissionalDeSaude) {
		this.profissionalDeSaude = profissionalDeSaude;
	}

	public String getDescricaoAtendimento() {
		return descricaoAtendimento;
	}

	public void setDescricaoAtendimento(String descricaoAtendimento) {
		this.descricaoAtendimento = descricaoAtendimento;
	}

	public String getTratamentoSugerido() {
		return tratamentoSugerido;
	}

	public void setTratamentoSugerido(String tratamentoSugerido) {
		this.tratamentoSugerido = tratamentoSugerido;
	}

	public List<Exame> getExamesSolicitados() {
		return examesSolicitados;
	}

	public void setExamesSolicitados(List<Exame> examesSolicitados) {
		this.examesSolicitados = examesSolicitados;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Date getDataDoCadastro() {
		return dataDoCadastro;
	}

	public void setDataDoCadastro(Date dataDoCadastro) {
		this.dataDoCadastro = dataDoCadastro;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	    
}
