package map.pesquisa.estoqueprodutos;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos () {
        this.estoqueProdutos = new HashMap<Long, Produto>();
    }

    public void adicionarProduto(Long id, String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        this.estoqueProdutos.put(id, produto);
    }

    public void exibirProdutos() {
        System.out.println(this.estoqueProdutos);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!(this.estoqueProdutos.isEmpty())) {
            for (Produto produto : this.estoqueProdutos.values()) {
                valorTotalEstoque += (produto.getPreco() * produto.getQuantidade());
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!(this.estoqueProdutos.isEmpty())) {
            for (Produto produto : this.estoqueProdutos.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }
    
}
