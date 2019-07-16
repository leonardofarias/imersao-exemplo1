import br.com.targettrust.exerciciobanco.enumeration.TipoTelaEnum;
import br.com.targettrust.exerciciobanco.model.Movimento;
import br.com.targettrust.exerciciobanco.view.Tela;
import br.com.targettrust.exerciciobanco.view.TelaCorrentista;
import br.com.targettrust.exerciciobanco.view.TelaMovimentos;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Tela tela;
        while (true) {
            System.out.println("Escolha uma opção: 1- Correntista PF, 2- Correntista PJ, 3- Movimentos");

            Integer opcao = pedirNumero();
            if(Objects.isNull(opcao)){
                continue;
            }
            switch (opcao) {
                case 1:
                    tela = new TelaCorrentista();
                    ((TelaCorrentista) tela).setTipoTela(TipoTelaEnum.PF);
                    break;

                case 2:
                    tela = new TelaCorrentista();
                    ((TelaCorrentista) tela).setTipoTela(TipoTelaEnum.valueOf("PJ"));
                    break;

                case 3:
                    tela = new TelaMovimentos();
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
                    continue;
            }
            tela.abrirTela();
        }
    }

    public static Integer pedirNumero(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();

        }catch (InputMismatchException e){
            System.out.println("Número inválido!");
            return pedirNumero();
        }
    }

//        new TelaCorrentista().criarCorrentista();
//
//        Movimento movimento = new Movimento();
//
//        //null
//        //System.out.println(movimento.getDescricao());
//
//        movimento.setDescricao("Saque conta corrente");
//        movimento.setTipo("DEBITO");
//        movimento.setValor(Double.valueOf(120));
//
//        System.out.println(movimento.getDescricao());
//        System.out.println(movimento.getValor());
//
//        movimento.setValor(12D);
//        System.out.println(movimento.getValor());
//
//        System.out.println(movimento.getDescricaoCompleta());


}
