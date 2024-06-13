package modelo;

public class Apartamento extends Financiamento {

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        //TODO Auto-generated constructor stub
    }

    public double calcularPagamentoMensal() {
        double taxaMensal = (super.taxaJurosAnual/100) / 12;
        int meses = super.prazoFinanciamento * 12;
        return (super.valorImovel * Math.pow((1 + taxaMensal), meses) * taxaMensal) / (Math.pow((1 + taxaMensal), meses) - 1);
    }
}
