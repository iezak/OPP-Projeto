package modelo;

import util.JurosMaiorQueAcrecimoException;

// Classe que representa um financiamento de Casa, especializando a classe Financiamento
public class Casa extends Financiamento {

    // Atributos específicos de Casa
    private double areaConstruida;   // Área construída da casa em metros quadrados
    private double areaTerreno;      // Área do terreno da casa em metros quadrados
    private int acrecimo = 80;       // Acréscimo inicial para o financiamento

    // Construtor que inicializa os atributos de Casa e os herdados de Financiamento
    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double areaTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    // Método privado para validar e ajustar o acréscimo conforme condição estabelecida
    private void validaAcresimo() throws JurosMaiorQueAcrecimoException {
        // Condição para validar o acréscimo baseado na taxa de juros
        if (acrecimo <= (super.valorImovel / (super.prazoFinanciamento * 12)) * (((super.taxaJurosAnual / 100) / 12))) {
            acrecimo = 0;
            throw new JurosMaiorQueAcrecimoException("O valor do acréscimo será ajustado para 0.");
        }
    }

    // Método implementado para calcular o pagamento mensal do financiamento de Casa
    public double calcularPagamentoMensal() {
        try {
            this.validaAcresimo(); // Tenta validar o acréscimo
        } catch (JurosMaiorQueAcrecimoException e) {
            System.out.println(e.getMessage()); // Exibe mensagem de exceção caso ocorra
        }
        // Cálculo do pagamento mensal, considerando o acréscimo
        return (super.valorImovel / (super.prazoFinanciamento * 12)) * (1 + ((super.taxaJurosAnual / 100) / 12)) + this.acrecimo;
    }

    // Método para imprimir os detalhes do financiamento de Casa
    public String imprimeFinanciamento() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Valor do imóvel: R$ %.2f\n", this.valorImovel));
        sb.append(String.format("Área construída: M² %.2f\n", this.areaConstruida));
        sb.append(String.format("Área do terreno: M² %.2f\n", this.areaTerreno));
        sb.append(String.format("Prazo do Financiamento: %d anos\n", this.prazoFinanciamento));
        sb.append(String.format("Taxa de Juros Anual: %.2f%%\n", this.taxaJurosAnual));
        sb.append(String.format("Pagamento Mensal: R$ %.2f\n", this.calcularPagamentoMensal()));
        sb.append(String.format("Total a pagar: R$ %.2f\n", this.calcularTotalPagamento()));
        System.out.println(sb.toString()); // Imprime os detalhes no console
        return sb.toString();
    }

    // Sobrescrita do método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "casa";
    }

}
