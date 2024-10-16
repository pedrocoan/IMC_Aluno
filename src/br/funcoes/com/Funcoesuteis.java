package br.funcoes.com;

import java.util.regex.Pattern;

// criando a classe que vai armazenar as funcoes e metodos que serao aplicados na main /*
public class Funcoesuteis {
	 
	// Criando o metodo para validar o cpf/*
    public static boolean validarCpf(String cpf) {
    	String regex = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}";
    	return Pattern.matches(regex, cpf);
    }
        

   // Criando o metodo para calcular o Imc/*
    public static double calcularImc(double peso, double altura) {
        if (altura <= 0 || peso <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser maiores que zero.");
        }
        return peso / (altura * altura);
    }

   // Metodo para verficar se o aluno foi aprovado/*
    public static boolean avaliarAluno(double nota, double percentualPresenca) {
        return nota >= 5.0 && percentualPresenca >= 75.0;
    }
}


