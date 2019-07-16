package br.com.targettrust.exerciciobanco.model;

import br.com.targettrust.exerciciobanco.enumeration.TipoMovimentoEnum;

public class Movimento {

    public Movimento(TipoMovimentoEnum tipo, Double valor, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
    }

    private TipoMovimentoEnum tipo;
    private Double valor;
    private String descricao;

    public TipoMovimentoEnum getTipo(){
        return tipo;
    }

    public void setTipo(TipoMovimentoEnum tipo){
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoCompleta(){
        return String.format("Tipo: %s, Descrição: %s, Valor: R$ %.2f", this.tipo, this.descricao, this.valor);
    }
}
