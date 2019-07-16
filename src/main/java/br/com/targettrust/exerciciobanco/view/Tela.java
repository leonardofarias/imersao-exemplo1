package br.com.targettrust.exerciciobanco.view;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public abstract class Tela {
    public abstract void abrirTela();

    public Integer pedirNumero(){
        Integer retorno = null;
        while(Objects.isNull(retorno)){
            try {
                retorno = new Scanner(System.in).nextInt();
            }catch (InputMismatchException e){
                System.err.println("Input inválido: "+e.getMessage());
            }
        }
        return retorno;
    }

    public String pedirTexto(){
        String texto = null;
        while (Objects.isNull(texto)){
            try {
                texto = new Scanner(System.in).nextLine();
            }catch (InputMismatchException e){
                System.err.println("Input inválido: "+e.getMessage());
            }
        }
        return texto;
    }

    public Double pedirValor() {
        Double valor = null;
        while (Objects.isNull(valor)){
            try {
                valor = new Scanner(System.in).nextDouble();
            }catch (InputMismatchException e){
                System.err.println("Input inválido: "+e.getMessage());
            }
        }
        return valor;
    }
}
