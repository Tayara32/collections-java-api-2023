package list.Pesquisa.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaPorAutor = new ArrayList<>();
        if(!livros.isEmpty()){
            for (Livro livro : livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    listaPorAutor.add(livro);
                }
            }
        }
        return listaPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaPorIntervalo = new ArrayList<>();
        if(!livros.isEmpty()){
            for (Livro livro : livros) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    listaPorIntervalo.add(livro);
                }
            }
        }
        return listaPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroEncontrado = null;
        if(!livros.isEmpty()){
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontrado = livro;
                    break;
                }
            }
        }
        return livroEncontrado;

    }

    public static void main(String[] args) {
        
        CatalogoLivros catalogo = new CatalogoLivros();

        System.out.println(catalogo.livros);

        catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogo.adicionarLivro("1984", "George Orwell", 1949);
        catalogo.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);

        System.out.println(catalogo.livros);
        
    
        System.out.println("Livros de J.R.R. Tolkien: " + catalogo.pesquisarPorAutor("J.R.R. Tolkien"));
        System.out.println("Livros publicados entre 1930 e 1950: " + catalogo.pesquisarPorIntervaloAnos(1930, 1950));
        System.out.println("Livro com o título '1984': " + catalogo.pesquisarPorTitulo("1984"));
    }

    
}


