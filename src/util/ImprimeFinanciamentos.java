package util;

import java.util.*;

import modelo.Financiamento;

public class ImprimeFinanciamentos {
    private static List<Financiamento> listaDeFinanciamentos = new ArrayList<Financiamento>();

    private double valorTotalImoveis;
    private double valorTotalFinanciamento;

    public void add(Financiamento financiamento) {
        listaDeFinanciamentos.add(financiamento);
    }

    public void ImprimeLista(){
        for (Financiamento financiamento : listaDeFinanciamentos) {
            System.out.printf("===== Dados do Financiamento %d (%s)===== \n\n", listaDeFinanciamentos.indexOf(financiamento)+1, financiamento.toString());
            financiamento.imprimeFinanciamento();
            System.out.println("-----------------------------------------");

            valorTotalImoveis += financiamento.getValorImovel();
            valorTotalFinanciamento += financiamento.calcularTotalPagamento();
        }
        System.out.printf("Total de todos os imóveis: %.2f \ntotal de todos os financiamentos: R$ %.2f.", valorTotalImoveis, valorTotalFinanciamento);
    }
}
