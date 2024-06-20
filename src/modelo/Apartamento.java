package modelo;

public class Apartamento extends Financiamento {

    private int numeroVagas;
    private int numeroAndar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int numeroVagas, int numeroAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.numeroAndar = numeroAndar;
        this.numeroVagas = numeroVagas;
    }

    public double calcularPagamentoMensal() {
        double taxaMensal = (super.taxaJurosAnual/100) / 12;
        int meses = super.prazoFinanciamento * 12;
        return (super.valorImovel * Math.pow((1 + taxaMensal), meses) * taxaMensal) / (Math.pow((1 + taxaMensal), meses) - 1);
    }

    public void imprimeFinanciamento() {
        
        System.out.printf("Valor do imóvel: R$ %.2f\n", this.valorImovel);
        System.out.printf("Número de vagas da garagem: %d\n", this.numeroVagas);
        System.out.printf("Andar nº: %d\n", this.numeroAndar);
        System.out.printf("Prazo do Financiamento: %d anos\n", this.prazoFinanciamento);
        System.out.printf("Taxa de Juros Anual: %.1f%%\n", this.taxaJurosAnual);
        System.out.printf("Pagamento Mensal: R$ %.2f\n", this.calcularPagamentoMensal());
        System.out.printf("Total a pagar: R$ %.2f\n", this.calcularTotalPagamento());
    }

    @Override
    public String toString() {
        return "Apartamento";
    }
}
