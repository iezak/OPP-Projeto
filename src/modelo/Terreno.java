package modelo;

// Classe que representa um financiamento de Terreno, especializando a classe Financiamento
public class Terreno extends Financiamento {

    // Atributo específico de Terreno
    private String tipozona;  // Tipo de zona onde o terreno está localizado

    // Construtor que inicializa os atributos de Terreno e os herdados de Financiamento
    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipozona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipozona = tipozona;
    }

    // Método implementado para calcular o pagamento mensal do financiamento de Terreno
    public double calcularPagamentoMensal() {
        // Cálculo do pagamento mensal com um acréscimo de 2% sobre o valor total do financiamento
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + ((this.taxaJurosAnual / 100) / 12)) * 1.02;
    }

    // Método para imprimir os detalhes do financiamento de Terreno
    public String imprimeFinanciamento() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Valor do imóvel: R$ %.2f\n", this.valorImovel));
        sb.append(String.format("Tipo de zona: %s\n", this.tipozona));
        sb.append(String.format("Prazo do Financiamento: %d anos\n", this.prazoFinanciamento));
        sb.append(String.format("Taxa de Juros Anual: %.1f%%\n", this.taxaJurosAnual));
        sb.append(String.format("Pagamento Mensal: R$ %.2f\n", this.calcularPagamentoMensal()));
        sb.append(String.format("Total a pagar: R$ %.2f\n", this.calcularTotalPagamento()));
        return sb.toString();
    }

    // Sobrescrita do método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "Terreno";
    }

}
