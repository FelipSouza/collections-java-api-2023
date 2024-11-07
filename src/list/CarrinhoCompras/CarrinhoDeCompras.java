package list.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    System.out.println("Adicionando no carrinho... \nItem: " + nome + "\nValor: " + preco + "\nQuantidade: " + quantidade + "\n");
    }

    public List<Item> removerItem(String nome){
        if(!carrinhoDeCompras.isEmpty()){
            for(Item i : carrinhoDeCompras){
                if(i.getNome().equalsIgnoreCase(nome)){
                    carrinhoDeCompras.remove(i);
                    System.out.println("Item: [" + nome + "] foi removido do carrinho!\n");
                    break;
                }
            }
        }
        return null;
    }


    public void exibirItens(){
        System.out.println(carrinhoDeCompras);
    }
    /* resolver erro
    public void calcularValorTotal(){

        //variável que armazena valor total
        double valorTotal = 0.0;

        for(Item i : carrinhoDeCompras){
            valorTotal += i.getQuantidade();
            System.out.println("O preço total dos itens no carrinho é: R$" + valorTotal);
        }
    }
    */

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Feijão", 7.99, 2);
        carrinhoDeCompras.removerItem("Feijão");
        //carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.adicionarItem("Sabão", 10.45, 4);
        carrinhoDeCompras.adicionarItem("Farinha", 6.50, 2);
        carrinhoDeCompras.adicionarItem("Suco de Uva", 12.99 , 2);
        carrinhoDeCompras.exibirItens();

    }


}
