package br.com.targettrust.exerciciobanco.model;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

public class Conta {

//    public Conta(){
//    }

    public Conta(Integer agencia, Integer numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 0D;
        this.movimentos = new ArrayList<Movimento>();
    }

    private Integer agencia;
    private Integer numero;
    private Double saldo;
    private List<Movimento> movimentos;
//    private int movimentoAtual;

    public String toString() {

        String textoMovimentos = "";
        for (int i = 0; i < movimentos.size(); i++) {
            if (nonNull(movimentos.get(i))) {
                textoMovimentos += "\n";
                textoMovimentos += movimentos.get(i).getDescricaoCompleta();
            }
        }

        return String.format(
                "Agência: %s, Número: %s, Saldo: %s, Movimentos: %s",
                this.agencia, this.numero, this.saldo, textoMovimentos);
    }

    public void adicionarMovimento(Movimento movimento) {
        movimentos.add(movimento);
    }
}
