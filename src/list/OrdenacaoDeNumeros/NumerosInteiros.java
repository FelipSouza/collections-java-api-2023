package list.OrdenacaoDeNumeros;

public class NumerosInteiros {
    private int numero;

    public NumerosInteiros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "NumerosInteiros{" +
                "numero=" + numero +
                '}';
    }
}
