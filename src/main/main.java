package main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Terreno;
import util.ImprimeFinanciamentos;
import util.InterfaceUsuario;

public class main {
    public static void main(String[] args) {
        ImprimeFinanciamentos imprimeFinanciamentos = new ImprimeFinanciamentos();
        System.out.println("-----------------------------------------");
        double valorDoImovel = new InterfaceUsuario().valorDoImovel();
        int prazoImovel = new InterfaceUsuario().prazoDoFinanciamento();
        double taxaDeJuros = new InterfaceUsuario().taxaJurosAnual();
        System.out.println("-----------------------------------------");


        Casa financiamento_Casa_1 = new Casa(valorDoImovel, prazoImovel, taxaDeJuros);
        imprimeFinanciamentos.add(financiamento_Casa_1);

        Casa financiamento_Casa_2 = new Casa(valorDoImovel-50000, prazoImovel, taxaDeJuros);
        imprimeFinanciamentos.add(financiamento_Casa_2);

        Apartamento financiamento_Apartamento_1 = new Apartamento(valorDoImovel, prazoImovel, taxaDeJuros);
        imprimeFinanciamentos.add(financiamento_Apartamento_1);

        Apartamento financiamento_Apartamento_2 = new Apartamento(valorDoImovel-50000, prazoImovel, taxaDeJuros);
        imprimeFinanciamentos.add(financiamento_Apartamento_2);

        Terreno financiamento_Terreno_1 = new Terreno(valorDoImovel, prazoImovel, taxaDeJuros);
        imprimeFinanciamentos.add(financiamento_Terreno_1);

        imprimeFinanciamentos.ImprimeLista();
    }
}
