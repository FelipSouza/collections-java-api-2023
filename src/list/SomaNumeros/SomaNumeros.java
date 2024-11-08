package list.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributo
    List<NumerosInteiros> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        System.out.println("Adicionado na lista número: " + numero);
        numerosInteiros.add(new NumerosInteiros(numero));
    }

    public void calcularSoma(){

        int somaNumeros = 0;

        for(NumerosInteiros n : numerosInteiros){
            somaNumeros += n.getNumero();
        }

        System.out.println("Resultado da soma dos números da lista é: " + somaNumeros);
    }



    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(45);
        somaNumeros.calcularSoma();
    }
}
