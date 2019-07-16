package comparator;

public class Artista implements Comparable<Artista>{

    private int id;
    private String nome;

    public Artista(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Artista o) {
        return this.nome.compareTo(o.nome);
    }
}
