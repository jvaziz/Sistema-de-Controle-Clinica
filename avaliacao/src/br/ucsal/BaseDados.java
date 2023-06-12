package br.ucsal;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class BaseDados {
	
	private Exame exame1, exame2;
	private Paciente paciente1, paciente2;
	private Agendamento agendamento1, agendamento2;
	private Prontuario prontuario1, prontuario2;
	private ProfissionalSaude profissionalSaude1, profissionalSaude2; 
	
	// Método para obter uma lista de profissionais de saúde.
	public List<ProfissionalSaude> obtemProfissionalSaude() {
		List<ProfissionalSaude> profissionaisSaude = new ArrayList<>();
		// Criação de um objeto ProfissionalSaude.
		profissionalSaude1 = new ProfissionalSaude(1, "Joe", 12345, "Rua Patativas", "Bairro Imbui", "Cidade Salvador", "Estado Bahia", 54321, new Date(), true);
		profissionalSaude2 = new ProfissionalSaude(2, "Leonardo", 67890, "Rua das Gaivotas", "Bairro Imbui", "Cidade Salvador", "Estado Bahia", 98765, new Date(), true);
		profissionaisSaude.add(profissionalSaude1);// Adiciona o objeto à lista de profissionaisSaude.
		profissionaisSaude.add(profissionalSaude2);
		return profissionaisSaude;
	}
	
    // Método para obter uma lista de pacientes.
	public List<Paciente> obtemPaciente() {
		List<Paciente> pacientes = new ArrayList<>();
		// Criação de um objeto Paciente.
		paciente1 = new Paciente(1, "Carlos", 59222, "Rua Blabla", "Bairro Pituba", "Cidade Salvador", "Estado Bahia", 43534, new Date(), true);
		paciente2 = new Paciente(2, "Joao", 33424, "Rua Creucreu", "Bairro Itapua", "Cidade Salvador", "Estado Bahia", 94923, new Date(), true);
		pacientes.add(paciente1);// Adiciona o objeto à lista de paciente.
		pacientes.add(paciente2);
		return pacientes;
	}

	
	// Método para obter uma lista de exames.
	public List<Exame> obtemExame() {
		List<Exame> exames = new ArrayList<>();
		// Criação de um objeto Exame.
		exame1 = new Exame(1, "Exame 1", "Descrição 1", "Observação 1", "Categoria 1", new Date(), true);
		exame2 = new Exame(2, "Exame 2", "Descrição 2", "Observação 2", "Categoria 2", new Date(), true);
		exames.add(exame1);// Adiciona o objeto à lista de exame.
		exames.add(exame2);
		return exames;
	}

	
	// Método para obter uma lista do agendamento
	public List<Agendamento> obtemAgendamento() {
		List<Agendamento> agendamentos = new ArrayList<>();
		//Criação de um objeto Agendamento
		agendamento1 = new Agendamento(1, paciente1, profissionalSaude1, new Date(), "Tipo 1", "Local 1", true);
		agendamento2 = new Agendamento(2, paciente2, profissionalSaude2, new Date(), "Tipo 2", "Local 2", true);
		agendamentos.add(agendamento1);// Adiciona o objeto à lista de agendamento.
		agendamentos.add(agendamento2);
		return agendamentos;
	}

	
	//Método para obter uma lista do prontuario
	public List<Prontuario> obtemProntuario() {
		List<Prontuario> prontuarios = new ArrayList<>();
		//Criação de um objeto Prontuario
		prontuario1 = new Prontuario(1, paciente1, profissionalSaude1, "Descrição 1", "Tratamento 1", null, "Observações 1", new Date(), true);
		prontuario2 = new Prontuario(2, paciente2, profissionalSaude2, "Descrição 2", "Tratamento 2", null, "Observações 2", new Date(), true);
		prontuarios.add(prontuario1);//Adiciona o objeto à lista de prontuario
		prontuarios.add(prontuario2);
		return prontuarios;
	}
}
