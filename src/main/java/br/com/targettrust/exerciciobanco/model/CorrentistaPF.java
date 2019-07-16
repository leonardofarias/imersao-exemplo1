package br.com.targettrust.exerciciobanco.model;

import br.com.targettrust.exerciciobanco.enumeration.TipoDocumentoEnum;

public class CorrentistaPF extends Correntista {

    private TipoDocumentoEnum tipoDocumento;

    public CorrentistaPF(String nome, Conta conta, TipoDocumentoEnum tipoDocumento) {
        super(nome, conta);
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String obtemDescricao() {
        String descricaoClassePai = super.obtemDescricao();
        return String.format("%s, Tipo Documento: %s",
                descricaoClassePai,
                this.tipoDocumento);
    }

}
