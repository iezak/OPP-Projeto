package util;

import java.util.*;
import modelo.Financiamento;

// Classe para gerenciar e imprimir informações sobre financiamentos
public class ImprimeFinanciamentos {
    private static List<Financiamento> listaDeFinanciamentos = new ArrayList<Financiamento>(); // Lista de financiamentos cadastrados

    private double valorTotalImoveis;       // Total do valor de todos os imóveis financiados
    private double valorTotalFinanciamento; // Total do valor de todos os financiamentos

    // Método para adicionar um financiamento à lista
    public void add(Financiamento financiamento) {
        listaDeFinanciamentos.add(financiamento);
    }

    // Método para imprimir todos os financiamentos cadastrados
    public String imprimeLista() {
        StringBuilder sb = new StringBuilder();

        // Itera sobre todos os financiamentos na lista
        for (Financiamento financiamento : listaDeFinanciamentos) {
            // Imprime cabeçalho com o número do financiamento e seu tipo
            sb.append(String.format("===== Dados do Financiamento %d (%s)=====\n\n", listaDeFinanciamentos.indexOf(financiamento) + 1, financiamento.toString()));
            // Imprime detalhes do financiamento específico
            sb.append(financiamento.imprimeFinanciamento());
            sb.append("\n-----------------------------------------\n");

            // Calcula e acumula o total de valor dos imóveis e dos financiamentos
            valorTotalImoveis += financiamento.getValorImovel();
            valorTotalFinanciamento += financiamento.calcularTotalPagamento();
        }

        // Imprime o total de todos os imóveis e financiamentos no final do relatório
        sb.append(String.format("Total de todos os imóveis: R$ %.2f \nTotal de todos os financiamentos: R$ %.2f.",
                valorTotalImoveis, valorTotalFinanciamento));

        return sb.toString(); // Retorna o relatório completo como uma string
    }

}
