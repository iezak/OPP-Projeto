package modelo;

import util.JurosMaiorQueAcrecimoException;

public class Casa extends Financiamento {

    private double areaConstruida;
    private double areaTerreno;
    private int acrecimo = 80;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double areaTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    private void validaAcresimo() throws JurosMaiorQueAcrecimoException {
        if(acrecimo <= (super.valorImovel/(super.prazoFinanciamento*12))*(((super.taxaJurosAnual/100)/12))) {
            acrecimo = 0;
            throw new JurosMaiorQueAcrecimoException("O valor do acressimo sera ajustado para 0.");
        }
    }

    public double calcularPagamentoMensal() {
        try {
            this.validaAcresimo();
        } catch (JurosMaiorQueAcrecimoException e) {
            System.out.println(e.getMessage());
        }
        return (super.valorImovel/(super.prazoFinanciamento*12))*(1 + ((super.taxaJurosAnual/100)/12))+this.acrecimo;
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
