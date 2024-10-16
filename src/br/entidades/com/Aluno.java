package br.entidades.com;

   // Criando a classe Pessoas e tendo como base a superclasse Pessoas/*
	public class Aluno extends Pessoa {
	    private double nota;
	    private double percentualPresenca;

	    //Criando o construtor da classe/*
	    public Aluno(String nome, String cpf, double peso, double altura, double nota, double percentualPresenca) {
	        super(nome, cpf, peso, altura);// chamando o construtor da superclase/*
	        this.nota = nota;
	        this.percentualPresenca = percentualPresenca;
	    }

	    //criando os getters and setters
	    public double getNota() {
	        return nota;
	    }

	    public void setNota(double nota) {
	        this.nota = nota;
	    }

	    public double getPercentualPresenca() {
	        return percentualPresenca;
	    }

	    public void setPercentualPresenca(double percentualPresenca) {
	        this.percentualPresenca = percentualPresenca;
	    }

	    
	    //Criando o metodo toString/*
	    @Override
	    public String toString() {
	        return "Aluno [nome=" + getNome() + ", cpf=" + getCpf() + ", peso=" + getPeso() +
	                ", altura=" + getAltura() + ", nota=" + nota + ", percentualPresenca=" + percentualPresenca + "]";
	    }
	}
	

	
