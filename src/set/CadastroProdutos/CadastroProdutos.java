package set.CadastroProdutos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); //deixa organizado o TreeSet por ordem de produto, diferente do HashSet.
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "FITA ISOLANTE", 5.99, 20);
        cadastroProdutos.adicionarProduto(2L, "SSD SATA", 349.50,10);
        cadastroProdutos.adicionarProduto(3L, "MEMÓRIA RAM 8GB", 120.00, 30);
        cadastroProdutos.adicionarProduto(4L, "A PLACA DE VÍDEO 1080 4GB", 825.99, 23);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
