package modelo;

public class Casa extends Financiamento {

    private double areaConstruida;
    private double areaTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double areaTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    public double calcularPagamentoMensal() {
        return (super.valorImovel/(super.prazoFinanciamento*12))*(1 + ((super.taxaJurosAnual/100)/12))+80;
    }

    public void imprimeFinanciamento() {
        
        System.out.printf("Valor do imóvel: R$ %.2f\n", this.valorImovel);
        System.out.printf("área construída: M² %.2f\n", this.areaConstruida);
        System.out.printf("área do terreno: M² %.2f\n", this.areaTerreno);
        System.out.printf("Prazo do Financiamento: %d anos\n", this.prazoFinanciamento);
        System.out.printf("Taxa de Juros Anual: %.1f%%\n", this.taxaJurosAnual);
        System.out.printf("Pagamento Mensal: R$ %.2f\n", this.calcularPagamentoMensal());
        System.out.printf("Total a pagar: R$ %.2f\n", this.calcularTotalPagamento());
    }

    @Override
    public String toString() {
        return "Casa";
    }

}
