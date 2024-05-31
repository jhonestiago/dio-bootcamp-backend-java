package map.pesquisa.estoqueprodutos;

public class Produto {

    // Atributos
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    // Sobrescrita do método toString()
    @Override
    public String toString() {
        return this.getNome() + ", R$" + String.format("%.2f", this.getPreco()) + ", " + this.getQuantidade() + " unidades, Total: R$" + String.format("%.2f", this.getPreco() * this.getQuantidade());
    }
    
}
