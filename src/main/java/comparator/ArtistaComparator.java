package comparator;

import java.util.Comparator;

public class ArtistaComparator implements Comparator<Artista> {

    @Override
    public int compare(Artista o1, Artista o2) {
        return o1.compareTo(o2);
    }
}
