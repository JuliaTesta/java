package entities;

import java.time.LocalDate;

public class Paciente {
	
			//Dados pessoais
			private String nome;
			private String email;
			private String cpf; 
			private String telefone;
			private LocalDate dataNascimento;
			private String numeroCarteiraConvenio;
			private String historicoMedico;
			private String convenio;
			
			//Construtores
			public Paciente() {
				
			}
			public Paciente(String nome, String email, String cpf, String telefone, LocalDate dataNascimento,
					String numeroCarteiraConvenio, String historicoMedico, String convenio) {
				super();
				this.nome = nome;
				this.email = email;
				this.cpf = cpf;
				this.telefone = telefone;
				this.dataNascimento = dataNascimento;
				this.numeroCarteiraConvenio = numeroCarteiraConvenio;
				this.historicoMedico = historicoMedico;
				this.convenio = convenio;
			}
			
			//Getters e Setters
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getCpf() {
				return cpf;
			}
			public void setCpf(String cpf) {
				this.cpf = cpf;
			}
			public String getTelefone() {
				return telefone;
			}
			public void setTelefone(String telefone) {
				this.telefone = telefone;
			}
			public LocalDate getDataNascimento() {
				return dataNascimento;
			}
			public void setDataNascimento(LocalDate dataNascimento) {
				this.dataNascimento = dataNascimento;
			}
			public String getNumeroCarteiraConvenio() {
				return numeroCarteiraConvenio;
			}
			public void setNumeroCarteiraConvenio(String numeroCarteiraConvenio) {
				this.numeroCarteiraConvenio = numeroCarteiraConvenio;
			}
			public String getHistoricoMedico() {
				return historicoMedico;
			}
			public void setHistoricoMedico(String historicoMedico) {
				this.historicoMedico = historicoMedico;
			}
			public String getConvenio() {
				return convenio;
			}
			public void setConvenio(String convenio) {
				this.convenio = convenio;
			}
			
			@Override
			public String toString() {
				return "Paciente{" + "Nome: " + nome;
			}
	}


