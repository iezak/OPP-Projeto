package modelo;
public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        return (this.valorImovel/(this.prazoFinanciamento*12))*(1 + (this.taxaJurosAnual/12));
    }

    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal()*this.prazoFinanciamento*12;
    }

    public void imprimeFinanciamento() {
        System.out.println("Resumo do Financiamento: ");
        System.out.printf("Valor do imóvel: R$ %.2f\n", this.valorImovel);
        System.out.printf("Prazo do Financiamento: %d anos\n", this.prazoFinanciamento);
        System.out.printf("Taxa de Juros Anual: %.1f%%\n", this.taxaJurosAnual);
        System.out.printf("Pagamento Mensal: R$ %.2f\n", this.calcularPagamentoMensal());
        System.out.printf("Total a pagar: R$ %.2f\n", this.calcularTotalPagamento());
        System.out.println("-----------------------------------------");
    }
}
