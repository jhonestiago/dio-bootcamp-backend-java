package set.ordenacao.cadastroprodutos;

import java.util.Objects;

public class Produto {

    // Atributos
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getter
    public long getCodigo() {
        return this.codigo;
    }

    public String getNome() {   
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    // Sobrescrições
    @Override
    public String toString() {
        return "Código: " + this.codigo + ",\n Nome: " + this.nome + ",\n Preço: " + this.preco + ",\n Quantidade: " + this.quantidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true;}
        if (!(obj instanceof Produto produto)) {return false;}
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

}
