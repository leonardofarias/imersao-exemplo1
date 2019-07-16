package br.com.targettrust.exerciciobanco.view;

import br.com.targettrust.exerciciobanco.enumeration.TipoDocumentoEnum;
import br.com.targettrust.exerciciobanco.enumeration.TipoTelaEnum;
import br.com.targettrust.exerciciobanco.infra.DadosSingleton;
import br.com.targettrust.exerciciobanco.model.Conta;
import br.com.targettrust.exerciciobanco.model.Correntista;
import br.com.targettrust.exerciciobanco.model.CorrentistaPF;
import br.com.targettrust.exerciciobanco.model.CorrentistaPJ;

import java.util.Scanner;

import static java.util.Objects.isNull;

public class TelaCorrentista extends Tela{

    private TipoTelaEnum tipoTela;

    public void setTipoTela(TipoTelaEnum tipoTela) {
        this.tipoTela = tipoTela;
    }

    @Override
    public void abrirTela(){

        System.out.println("Informe a agencia: ");
        Integer agencia = pedirNumero();

        System.out.println("Informe o número: ");
        Integer numero = pedirNumero();

        Conta conta = new Conta(agencia, numero);

        System.out.println("Informe o nome do correntista: ");
        String nomeCorrentista = pedirTexto();
        Correntista correntista;

        if(TipoTelaEnum.PF.equals(tipoTela)){
            System.out.println("Informe o tipo do documento conforme a seguir: ");
            System.out.println(TipoDocumentoEnum.getValues());

            TipoDocumentoEnum tipoDocumento = pedirDocumento();
            correntista = new CorrentistaPF(nomeCorrentista, conta, tipoDocumento);

        }else if(TipoTelaEnum.PJ.equals(tipoTela)){
            correntista = new CorrentistaPJ(nomeCorrentista, conta);
        }else{
            return;
        }
        String descricao = correntista.obtemDescricao();
        System.out.println(descricao);

        DadosSingleton.getInstance().adicionaCorrentista(correntista);
    }

    private TipoDocumentoEnum pedirDocumento() {
        TipoDocumentoEnum tipoDocumentoEnum = null;
        while (isNull(tipoDocumentoEnum)){
            try {
                tipoDocumentoEnum = TipoDocumentoEnum.valueOf(this.pedirTexto());
            }catch (IllegalArgumentException e){
                System.err.println("Tipo inválido! Informe novamente.");
            }
        }
        return tipoDocumentoEnum;
    }
}
