package modelo;

// Classe abstrata que representa um financiamento genérico
public abstract class Financiamento {
    // Atributos protegidos para armazenar informações básicas do financiamento
    protected double valorImovel;             // Valor total do imóvel financiado
    protected int prazoFinanciamento;         // Prazo do financiamento em anos
    protected double taxaJurosAnual;          // Taxa de juros anual do financiamento

    // Construtor da classe Financiamento
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Métodos de acesso aos atributos
    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // Método abstrato para calcular o pagamento mensal do financiamento
    public abstract double calcularPagamentoMensal();

    // Método para calcular o total de pagamento ao longo do financiamento
    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento * 12; // Multiplica pelo número de meses em anos
    }

    // Métodos abstratos para imprimir informações específicas do financiamento
    public abstract String imprimeFinanciamento();

    // Método toString abstrato para representar o financiamento como uma string
    public abstract String toString();
}
