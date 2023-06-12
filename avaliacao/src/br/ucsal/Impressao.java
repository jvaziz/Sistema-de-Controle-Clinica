package br.ucsal;
import java.util.List;

import br.ucsal.Paciente;
import br.ucsal.*;

public class Impressao {

    public void imprimirPacientes(List<Paciente> pacientes) {
        System.out.println("Lista de Pacientes:");
        for (Paciente paciente : pacientes) {
            System.out.println("Identificador: " + paciente.getId());
            System.out.println("Nome: " + paciente.getNome());
            System.out.println("Contato: " + paciente.getContato());
            System.out.println("Rua: " + paciente.getRua());
            System.out.println("Bairro: " + paciente.getBairro());
            System.out.println("Cidade: " + paciente.getCidade());
            System.out.println("Estado: " + paciente.getEstado());
            System.out.println("CEP: " + paciente.getCep());
            System.out.println("Data do Cadastro: " + paciente.getDataCadastro());
            System.out.println("Situação: " + (paciente.isStatus() ? "Ativo" : "Inativo"));
            System.out.println();
        }
    }

    public void imprimirProfissionaisSaude(List<ProfissionalSaude> profissionais) {
        System.out.println("Lista de Profissionais de Saúde:");
        for (ProfissionalSaude profissional : profissionais) {
            System.out.println("Identificador: " + profissional.getId());
            System.out.println("Nome: " + profissional.getNome());
            System.out.println("Tipo: " + profissional.getTipo());
            System.out.println("Especialidades: " + profissional.getEspecialidade());
            System.out.println("Data do Cadastro: " + profissional.getDataCadastro());
            System.out.println("Situação: " + (profissional.isStatus() ? "Ativo" : "Inativo"));
            System.out.println();
        }
    }

    public void imprimirExames(List<Exame> exames) {
        System.out.println("Lista de Exames:");
        for (Exame exame : exames) {
            System.out.println("Identificador: " + exame.getId());
            System.out.println("Nome do Exame: " + exame.getNome());
            System.out.println("Descrição: " + exame.getDescricao());
            System.out.println("Observação: " + exame.getObservacao());
            System.out.println("Categoria: " + exame.getCategoria());
            System.out.println("Data do Cadastro: " + exame.getDataCadastro());
            System.out.println("Situação: " + (exame.isStatus() ? "Ativo" : "Inativo"));
            System.out.println();
        }
    }

    public void imprimirAgendamentosPaciente(List<Agendamento> agendamentos) {
        System.out.println("Lista de Agendamentos do Paciente:");
        for (Agendamento agendamento : agendamentos) {
            System.out.println("Identificador: " + agendamento.getId());
            System.out.println("Paciente: " + agendamento.getPaciente().getNome());
            System.out.println("Especialidade: " + agendamento.getEspecialidade());
            System.out.println("Profissional de Saúde: " + agendamento.getProfissionalSaude().getNome());
            System.out.println("Convênio/Particular: " + agendamento.getConvenio());
            System.out.println("Data do Atendimento: " + agendamento.getDataAtendimento());
            System.out.println("Tipo de Atendimento: " + agendamento.getTipoAtendimento());
            System.out.println("Local: " + agendamento.getLocal());
            System.out.println("Situação: " + (agendamento.isStatus() ? "Ativo" : "Inativo"));
            System.out.println();
        }
    }

    public void imprimirProntuariosPaciente(List<Prontuario> prontuarios) {
        System.out.println("Lista de Prontuários do Paciente:");
        for (Prontuario prontuario : prontuarios) {
            System.out.println("Identificador: " + prontuario.getId());
            System.out.println("Paciente: " + prontuario.getPaciente().getNome());


System.out.println("Profissional de Saúde: " + prontuario.getProfissionalDeSaude().getNome());
            System.out.println("Descrição do Atendimento: " + prontuario.getDescricaoAtendimento());
            System.out.println("Tratamento Sugerido: " + prontuario.getTratamentoSugerido());
            System.out.println("Exames Solicitados: " + prontuario.getExamesSolicitados());
            System.out.println("Observações: " + prontuario.getObservacoes());
            System.out.println("Data do Cadastro: " + prontuario.getDataDoCadastro());
            System.out.println("Situação: " + (prontuario.isStatus() ? "Ativo" : "Inativo"));
            System.out.println();
        }
    }

    public void imprimirAgendamentosProfissional(List<Agendamento> agendamentos) {
        System.out.println("Lista de Agendamentos do Profissional de Saúde:");
        for (Agendamento agendamento : agendamentos) {
            System.out.println("Identificador: " + agendamento.getId());
            System.out.println("Paciente: " + agendamento.getPaciente().getNome());
            System.out.println("Especialidade: " + agendamento.getEspecialidade());
            System.out.println("Convênio/Particular: " + agendamento.getConvenio());
            System.out.println("Data do Atendimento: " + agendamento.getDataAtendimento());
            System.out.println("Tipo de Atendimento: " + agendamento.getTipoAtendimento());
            System.out.println("Local: " + agendamento.getLocal());
            System.out.println("Situação: " + (agendamento.isStatus() ? "Ativo" : "Inativo"));
            System.out.println();
        }
    }

    public void imprimirProntuariosProfissional(List<Prontuario> prontuarios) {
        System.out.println("Lista de Prontuários do Profissional de Saúde:");
        for (Prontuario prontuario : prontuarios) {
            System.out.println("Identificador: " + prontuario.getId());
            System.out.println("Paciente: " + prontuario.getPaciente().getNome());
            System.out.println("Descrição do Atendimento: " + prontuario.getDescricaoAtendimento());
            System.out.println("Tratamento Sugerido: " + prontuario.getTratamentoSugerido());
            System.out.println("Exames Solicitados: " + prontuario.getExamesSolicitados());
            System.out.println("Observações: " + prontuario.getObservacoes());
            System.out.println("Data do Cadastro: " + prontuario.getDataDoCadastro());
            System.out.println("Situação: " + (prontuario.isStatus() ? "Ativo" : "Inativo"));
            System.out.println();
        }
    }

    public void imprimirExamesPaciente(List<Exame> exames) {
        System.out.println("Lista de Exames do Paciente:");
        for (Exame exame : exames) {
            System.out.println("Identificador: " + exame.getId());
            System.out.println("Nome do Exame: " + exame.getNome());
            System.out.println("Descrição: " + exame.getDescricao());
            System.out.println("Observação: " + exame.getObservacao());
            System.out.println("Categoria: " + exame.getCategoria());
            System.out.println("Data do Cadastro: " + exame.getDataCadastro());
            System.out.println("Situação: " + (exame.isStatus() ? "Ativo" : "Inativo"));
            System.out.println();
        }
    }

    public void imprimirQuantidadeAtendimentosPorProfissional(List<ProfissionalSaude> profissionais) {
        System.out.println("Quantidade de Atendimentos por Profissional de Saúde:");
        for (ProfissionalSaude profissional : profissionais) {
            System.out.println("Profissional: " + profissional.getNome());
            System.out.println("Quantidade de Atendimentos: " + profissional.getQtdAtendimentos());
            System.out.println();
        }
    }


public void imprimirQuantidadeAgendamentosPorPaciente(List<Paciente> pacientes) {
        System.out.println("Quantidade de Agendamentos por Paciente:");
        for (Paciente paciente : pacientes) {
            System.out.println("Paciente: " + paciente.getNome());
            System.out.println("Quantidade de Agendamentos: " + paciente.getQtdAtendimentos());
            System.out.println();
        }
    }
}
