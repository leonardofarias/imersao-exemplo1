package br.com.targettrust.exerciciobanco.infra;

import br.com.targettrust.exerciciobanco.model.Correntista;

import java.util.ArrayList;
import java.util.List;

public class DadosSingleton {
    private List<Correntista> correntistas;
    private static DadosSingleton dadosSingleton;

    private DadosSingleton(){
        System.out.println("Fui inicializado...."+getClass().getName());

        this.correntistas = new ArrayList<Correntista>();
    }

    public static DadosSingleton getInstance(){
        if(dadosSingleton == null){
            dadosSingleton = new DadosSingleton();
        }
        return dadosSingleton;
    }

    public void adicionaCorrentista(Correntista correntista){
        this.correntistas.add(correntista);
    }

    public List<Correntista> getCorrentistas(){
        return correntistas;
    }

}
