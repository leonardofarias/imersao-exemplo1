package br.com.targettrust.exerciciobanco.view;

import br.com.targettrust.exerciciobanco.enumeration.TipoDocumentoEnum;
import br.com.targettrust.exerciciobanco.enumeration.TipoMovimentoEnum;
import br.com.targettrust.exerciciobanco.infra.DadosSingleton;
import br.com.targettrust.exerciciobanco.model.Correntista;
import br.com.targettrust.exerciciobanco.model.Movimento;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.isNull;

public class TelaMovimentos extends Tela implements TelaSomenteLeitura {

    @Override
    public void abrirTela() {

        Correntista correntista = pedirCorrentista();

        System.out.println("Informe o tipo do movimento conforme a seguir: ");
        for(TipoMovimentoEnum tipo : TipoMovimentoEnum.values()){
            System.out.println(" - "+tipo.name());
        }

        TipoMovimentoEnum tipo = pedirMovimento();
        System.out.println("Escreva o valor");
        Double valor = pedirValor();
        System.out.println("Escreva a descrição: ");
        String descricao = pedirTexto();
        Movimento movimento = new Movimento(tipo, valor, descricao);

        correntista.getConta().adicionarMovimento(movimento);

        System.out.println(correntista.obtemDescricao());
    }

    private TipoMovimentoEnum pedirMovimento(){
        TipoMovimentoEnum retorno = null;
        while (isNull(retorno)) {
            try {
                retorno = TipoMovimentoEnum.valueOf(pedirTexto());
            }catch (IllegalArgumentException e){
                System.err.println("Valor inválido. Digite uma das opções de Tipo: ");
            }
        }
        return retorno;
    }

    public Correntista pedirCorrentista(){
        List<Correntista> correntistas = DadosSingleton.getInstance().getCorrentistas();

        System.out.println("Correntistas: ");

        int i = 0;
        for (Correntista c : correntistas){
            if(Objects.nonNull(c)){
                System.out.println(c.getClass().getSimpleName());
                System.out.println(i + " -> "+ c.obtemDescricao());
            }
            i++;
        }

        int correntistaEscolhido;
        while (true){
            System.out.println("Digite o número do mesmo: ");
            correntistaEscolhido = pedirNumero();

            if(correntistaEscolhido >= correntistas.size()
                    || correntistaEscolhido < 0
                    || isNull(correntistas.get(correntistaEscolhido))){
                System.out.println("Número do correntista inválido.");
            }else{
                break;
            }
        }

        return correntistas.get(correntistaEscolhido);

        //Outra forma:
//        for (int v = 0; v < correntistas.length-1; i++){
//            System.out.println(v + " -> "+ correntistas[v].obtemDescricao());
//        }

    }

}
