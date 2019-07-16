package br.com.targettrust.exerciciobanco.model;

public abstract class Correntista{

    public Correntista(String nome, Conta conta){
        this.conta = conta;
        this.nome = nome;
    }

    private String nome;
    private Conta conta;

    public String obtemDescricao(){
        return String.format("Nome: %s, conta: %s", this.nome, conta);
    }

    public Conta getConta() {
        return this.conta;
    }
}
