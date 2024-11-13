package map.OperacoesBasicas.PesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public Double calcularValorTotalEstoque(){
        Double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco()> maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = 10.00;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco()<menorPreco){
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtorMaiorQuantidadeValorTotalNoEstoque = null;
        double quantidadeXPreco = 0.0;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                if( (p.getPreco()*p.getQuantidade()) > quantidadeXPreco){
                    produtorMaiorQuantidadeValorTotalNoEstoque = p;
                }
            }
        }
        return produtorMaiorQuantidadeValorTotalNoEstoque;
    }



    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Sabão", 30, 10.00);
        estoqueProdutos.adicionarProduto(2, "Luva", 10, 12.00);
        estoqueProdutos.adicionarProduto(3, "Frango", 10, 25.00);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro do estoque: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato do estoque: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto de quantidade no estoque (quant. * preço):  " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());



    }
}
