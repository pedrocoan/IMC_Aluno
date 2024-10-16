package main;

import br.entidades.com.Aluno;
import br.funcoes.com.Funcoesuteis;

// Criando a classe main pra testar todas as classes/*
public class Main {

	
		 public static void main(String[] args) {
		        //Criando o aluno/*
		        Aluno aluno = new Aluno("João Silva", "123.456.789-10", 70.0, 1.75, 8.0, 80.0);

		        //exibindo o aluno
		        System.out.println(aluno);

		        //Validando o cpf
		        boolean cpfValido = Funcoesuteis.validarCpf(aluno.getCpf());
		        System.out.println("CPF válido? " + cpfValido);

		        //calculando o cpf
		        double imc = Funcoesuteis.calcularImc(aluno.getPeso(), aluno.getAltura());
		        System.out.println("IMC do aluno: " + imc);

		        // verificando se o aluno foi aprovado/*
		        boolean aprovado = Funcoesuteis.avaliarAluno(aluno.getNota(), aluno.getPercentualPresenca());
		        System.out.println("Aluno aprovado? " + aprovado);
		    }

	}


