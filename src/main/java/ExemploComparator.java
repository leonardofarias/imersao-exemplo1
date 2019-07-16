import comparator.Artista;
import comparator.ArtistaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploComparator {

    public static void main(String[] args) {

        List<Artista> artistas = new ArrayList<Artista>();
        artistas.add(new Artista(1,"Tim Maria"));
        artistas.add(new Artista(2,"Juca Bala"));
        artistas.add(new Artista(3,"Ary Tarrago"));
        artistas.add(new Artista(4,"Robertão"));


        System.out.println(artistas);
        Collections.sort(artistas, Collections.reverseOrder());
        System.out.println(artistas);
        Collections.sort(artistas, new ArtistaComparator());
        System.out.println(artistas);


    }
}
