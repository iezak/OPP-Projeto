package modelo;

public class Terreno extends Financiamento {

    private String tipozona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipozona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipozona = tipozona;
    }

    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + ((this.taxaJurosAnual / 100) / 12)) * 1.02;
    }

    public void imprimeFinanciamento() {

        System.out.printf("Valor do imóvel: R$ %.2f\n", this.valorImovel);
        System.out.printf("Tipo de zona: %s\n", this.tipozona);
        System.out.printf("Prazo do Financiamento: %d anos\n", this.prazoFinanciamento);
        System.out.printf("Taxa de Juros Anual: %.1f%%\n", this.taxaJurosAnual);
        System.out.printf("Pagamento Mensal: R$ %.2f\n", this.calcularPagamentoMensal());
        System.out.printf("Total a pagar: R$ %.2f\n", this.calcularTotalPagamento());
    }

    @Override
    public String toString() {
        return "Terreno";
    }

}
