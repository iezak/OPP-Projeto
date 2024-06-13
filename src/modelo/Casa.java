package modelo;

public class Casa extends Financiamento {

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    public double calcularPagamentoMensal() {
        return (super.valorImovel/(super.prazoFinanciamento*12))*(1 + ((super.taxaJurosAnual/100)/12))+80;
    }

}
