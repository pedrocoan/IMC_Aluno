package br.entidades.com;

 //Criando a superclasse pessoa  Pessoa/*
public class Pessoa {
	private String nome;
    private String cpf;
    private double peso;
    private double altura;

    // Criando o construtor da superclasse/*
    public Pessoa(String nome, String cpf, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    //Criando os getters and setters/*
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Criando o metodo to string para exibir na tela depois/*
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", peso=" + peso + ", altura=" + altura + "]";
    }
}


