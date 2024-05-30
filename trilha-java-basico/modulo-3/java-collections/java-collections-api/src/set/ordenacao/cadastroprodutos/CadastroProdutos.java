package set.ordenacao.cadastroprodutos;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<Produto>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        this.produtos.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<Produto>(this.produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<Produto>(new ComparatorPorPreco());
        produtosPorPreco.addAll(this.produtos);
        return produtosPorPreco;
    }

}
