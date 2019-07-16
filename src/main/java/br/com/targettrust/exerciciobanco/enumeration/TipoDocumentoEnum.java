package br.com.targettrust.exerciciobanco.enumeration;

public enum TipoDocumentoEnum {
    RG, CPF, CNH, CARTEIRINHA_DO_CLUBE;

    public static String getValues(){
        String valores = new String();
        for(TipoDocumentoEnum tipo : values()){
            valores += " - "+ tipo.name() +"\n";
        }
        return valores;
    }
}
