package list.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoNumeros {

    List<NumerosInteiros> numerosInteiros;

    public OrdenacaoNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosInteiros.add(new NumerosInteiros(numero));
    }

    public void exibirNumeros(){
        System.out.println(numerosInteiros);
    }

    public static void main(String[] args) {

        OrdenacaoNumeros ornadacaoNumeros = new OrdenacaoNumeros();

        ornadacaoNumeros.adicionarNumero(10);
        ornadacaoNumeros.adicionarNumero(7);
        ornadacaoNumeros.adicionarNumero(42);
        ornadacaoNumeros.adicionarNumero(3);
        ornadacaoNumeros.adicionarNumero(4);
        ornadacaoNumeros.adicionarNumero(93);
        ornadacaoNumeros.exibirNumeros();



    }

}
