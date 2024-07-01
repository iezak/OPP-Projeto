package main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Terreno;
import util.ImprimeFinanciamentos;
import util.InterfaceUsuario;

public class main {
    public static void main(String[] args) {
        ImprimeFinanciamentos imprimeFinanciamentos = new ImprimeFinanciamentos();
        int quantidadeFinanciamentos = new InterfaceUsuario().qtdaFinanciamentos();

        for (int i = 0; i < quantidadeFinanciamentos; i++) {
            System.out.println("-----------------------------------------");
            String tipoFinanciamento = new InterfaceUsuario().tipoFinanciamento();
            if (tipoFinanciamento.equals("casa")) {
                double valorDoImovel = new InterfaceUsuario().valorDoImovel();
                int prazoImovel = new InterfaceUsuario().prazoDoFinanciamento();
                double taxaDeJuros = new InterfaceUsuario().taxaJurosAnual();
                double areaConstruida = new InterfaceUsuario().areaConstruida();
                double areaTerreno = new InterfaceUsuario().areaTerreno();

                Casa casa = new Casa(valorDoImovel, prazoImovel, taxaDeJuros, areaConstruida, areaTerreno);
                imprimeFinanciamentos.add(casa);
            }
            if (tipoFinanciamento.equals("apartamento")) {
                double valorDoImovel = new InterfaceUsuario().valorDoImovel();
                int prazoImovel = new InterfaceUsuario().prazoDoFinanciamento();
                double taxaDeJuros = new InterfaceUsuario().taxaJurosAnual();
                int numeroVagas = new InterfaceUsuario().numeroVagas();
                int numeroAndar = new InterfaceUsuario().numeroAndar();

                Apartamento apartamento = new Apartamento(valorDoImovel, prazoImovel, taxaDeJuros, numeroVagas,
                        numeroAndar);
                imprimeFinanciamentos.add(apartamento);
            }
            if (tipoFinanciamento.equals("terreno")) {
                double valorDoImovel = new InterfaceUsuario().valorDoImovel();
                int prazoImovel = new InterfaceUsuario().prazoDoFinanciamento();
                double taxaDeJuros = new InterfaceUsuario().taxaJurosAnual();
                String zona = new InterfaceUsuario().tipoZona();

                Terreno terreno = new Terreno(valorDoImovel, prazoImovel, taxaDeJuros, zona);
                imprimeFinanciamentos.add(terreno);
            }
        }

        imprimeFinanciamentos.ImprimeLista();
    }
}
