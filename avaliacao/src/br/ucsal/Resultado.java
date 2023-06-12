package br.ucsal;

import java.util.Date;
import java.util.List;

public class Resultado {

    public static void main(String[] args) {
        BaseDados baseDados = new BaseDados();
        Impressao impressao = new Impressao();

        // Lista com todos os pacientes
        List<Paciente> pacientes = baseDados.obtemPaciente();
        impressao.imprimirPacientes(pacientes);

        // Lista com todos os profissionais de saúde
        List<ProfissionalSaude> profissionaisSaude = baseDados.obtemProfissionalSaude();
        impressao.imprimirProfissionaisSaude(profissionaisSaude);

        // Lista com todos os exames cadastrados
        List<Exame> exames = baseDados.obtemExame();
        impressao.imprimirExames(exames);

        // Lista com todos os agendamentos do paciente em um determinado período
        List<Agendamento> agendamentosPaciente = baseDados.obtemAgendamento();
        impressao.imprimirAgendamentosPaciente(agendamentosPaciente);

        // Lista com todos os prontuários do paciente em um determinado período
        List<Prontuario> prontuariosPaciente = baseDados.obtemProntuario();
        impressao.imprimirProntuariosPaciente(prontuariosPaciente);

        // Lista com todos os agendamentos feitos para um determinado profissional
        List<Agendamento> agendamentosProfissional = baseDados.obtemAgendamento();
        impressao.imprimirAgendamentosProfissional(agendamentosProfissional);

        // Lista com todos os prontuários registrados por um determinado profissional de saúde
        List<Prontuario> prontuariosProfissional = baseDados.obtemProntuario();
        impressao.imprimirProntuariosProfissional(prontuariosProfissional);

        // Lista com todos os exames feitos por um determinado paciente
        List<Exame> examesPaciente = baseDados.obtemExame();
        impressao.imprimirExamesPaciente(examesPaciente);

        // Quantidade de atendimentos efetuados por profissional de saúde
        impressao.imprimirQuantidadeAtendimentosPorProfissional(profissionaisSaude);

        // Quantidade de agendamentos por paciente
        impressao.imprimirQuantidadeAgendamentosPorPaciente(pacientes);
    }
}
