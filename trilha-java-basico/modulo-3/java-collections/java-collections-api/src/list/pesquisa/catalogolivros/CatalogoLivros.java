package list.pesquisa.catalogolivros;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!this.livros.isEmpty()) {
            for (Livro livro : this.livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        for (Livro livro : this.livros) {
            int anoPublicacao = livro.getAnoPublicacao();
            if (anoPublicacao >= anoInicial && anoPublicacao <= anoFinal) {
                livrosPorIntervaloAnos.add(livro);
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTítulo(String titulo) {
        Livro livroPorTitulo = null;
        for (Livro livro : this.livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = livro;
                break;
            }
        }
        return livroPorTitulo;
    }

}
