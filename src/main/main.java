package main;

import modelo.Financiamento;
import util.ImprimeFinanciamentos;
import util.InterfaceUsuario;

public class main {
    public static void main(String[] args) {
        ImprimeFinanciamentos imprimeFinanciamentos = new ImprimeFinanciamentos();
        for(int i = 4;i >= 1; i--) {
            System.out.println("-----------------------------------------");
            double valorDoImovel = new InterfaceUsuario().valorDoImovel();
            int prazoImovel = new InterfaceUsuario().prazoDoFinanciamento();
            double taxaDeJuros = new InterfaceUsuario().taxaJurosAnual();
            System.out.println("-----------------------------------------");


            Financiamento financiamento = new Financiamento(valorDoImovel, prazoImovel, taxaDeJuros);
            imprimeFinanciamentos.add(financiamento);
        }

        imprimeFinanciamentos.ImprimeLista();
    }
}
