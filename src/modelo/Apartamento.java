package modelo;

// Classe que representa um financiamento de Apartamento, especializando a classe Financiamento
public class Apartamento extends Financiamento {

    // Atributos específicos de Apartamento
    private int numeroVagas;     // Número de vagas na garagem do apartamento
    private int numeroAndar;     // Número do andar onde está localizado o apartamento

    // Construtor que inicializa os atributos de Apartamento e os herdados de Financiamento
    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int numeroVagas, int numeroAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.numeroAndar = numeroAndar;
        this.numeroVagas = numeroVagas;
    }

    // Método implementado para calcular o pagamento mensal do financiamento de Apartamento
    public double calcularPagamentoMensal() {
        // Cálculo da taxa de juros mensal
        double taxaMensal = (super.taxaJurosAnual / 100) / 12;
        // Conversão do prazo de financiamento para meses
        int meses = super.prazoFinanciamento * 12;
        // Cálculo do pagamento mensal utilizando a fórmula de amortização de empréstimos
        return (super.valorImovel * Math.pow((1 + taxaMensal), meses) * taxaMensal) / (Math.pow((1 + taxaMensal), meses) - 1);
    }

    // Método para imprimir os detalhes do financiamento de Apartamento
    public String imprimeFinanciamento() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Valor do imóvel: R$ %.2f\n", this.valorImovel));
        sb.append(String.format("Número de vagas da garagem: %d\n", this.numeroVagas));
        sb.append(String.format("Andar nº: %d\n", this.numeroAndar));
        sb.append(String.format("Prazo do Financiamento: %d anos\n", this.prazoFinanciamento));
        sb.append(String.format("Taxa de Juros Anual: %.1f%%\n", this.taxaJurosAnual));
        sb.append(String.format("Pagamento Mensal: R$ %.2f\n", this.calcularPagamentoMensal()));
        sb.append(String.format("Total a pagar: R$ %.2f\n", this.calcularTotalPagamento()));
        return sb.toString();
    }

    // Sobrescrita do método toString para representar o objeto como uma string
    @Override
    public String toString() {
        return "Apartamento";
    }
}
