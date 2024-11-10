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

    public int encontrarMaiorNumero(){

        int numeroMaior = numerosInteiros.get(1).getNumero();

        for(NumerosInteiros n: numerosInteiros){
            if (n.getNumero() > numeroMaior){
                numeroMaior = n.getNumero();
            }
        }
        return  numeroMaior;
    }

    public int encontrarMenorNumero(){

        int numeroMenor = numerosInteiros.get(1).getNumero();

        for(NumerosInteiros n: numerosInteiros){
            if (n.getNumero() < numeroMenor){
                numeroMenor = n.getNumero();
            }
        }
        return  numeroMenor;
    }

    public void exibirNumeros(){
        System.out.println(numerosInteiros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(45);
        somaNumeros.calcularSoma();
        System.out.println("O número maior da lista é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O número menor da lista é: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
