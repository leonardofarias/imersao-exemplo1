import comparator.ArtistaComparator;
import comparator.PessoaComparator;
import model.Pessoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Ex1 {

    /**
     * Exercício: use a classe a seguir para fazer a leitura do arquivo.
     * 1 - Crie um HashSet com o nome e ordene.
     * 2 - Crie uma classe Pessoa com os campos id e nome. Crie uma pessoa para cada linha do arquivo.
     *     Ordene as pessoas pelo nome.
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(getInputFile());

        List<Pessoa> listaPessoas = new ArrayList<>();

        if(sc.hasNextLine()){
            sc.nextLine();
        }

        while (sc.hasNextLine()) {

            try{
                String linha = sc.nextLine();
                String[] partes = linha.split(",");

                String id = partes[0];
                String nome = partes[1];

                //System.out.println(id);
                //System.out.println(nome);

                listaPessoas.add(new Pessoa(Integer.parseInt(id), nome));

            }catch (NumberFormatException e){
                System.out.println("Desconsidera o primeiro");
            }

        }
        sc.close();

        Collections.sort(listaPessoas, new PessoaComparator());
        System.out.println(listaPessoas);
    }

    //Conteúdo de https://paste.ee/p/nSLSB
    // Coloque na pasta /resources/
    private static File getInputFile() {
        // Ou return new File(SuaClasse.class.getClassLoader().getResource("input_1.csv").toURI());
        return new File("src/main/resources/input_1.txt");
    }
}

