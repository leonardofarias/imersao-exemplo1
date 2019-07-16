package comparator;

import model.Pessoa;

import java.util.Comparator;

public class PessoaComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        if(o1.getId() > o2.getId()){
            return o2.getId();
        }else{
            return  o1.getId();
        }
    }
}
