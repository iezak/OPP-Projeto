package main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Terreno;
import util.ImprimeFinanciamentos;
import util.InterfaceUsuario;
import util.ArquivoUtil; // Importe a classe ArquivoUtil aqui

public class main {
    public static void main(String[] args) {
        // Instanciação dos objetos necessários
        ImprimeFinanciamentos imprimeFinanciamentos = new ImprimeFinanciamentos();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        // Solicitação da quantidade de financiamentos a serem inseridos
        int quantidadeFinanciamentos = interfaceUsuario.qtdaFinanciamentos();

        // Loop para cada financiamento
        for (int i = 0; i < quantidadeFinanciamentos; i++) {
            System.out.println("-----------------------------------------");
            String tipoFinanciamento = null;

            // Solicita o tipo de financiamento ao usuário
            tipoFinanciamento = interfaceUsuario.tipoFinanciamento();

            // Condições para cada tipo de financiamento
            if (tipoFinanciamento.equals("casa")) {
                // Solicitação dos dados específicos para uma casa
                double valorDoImovel = interfaceUsuario.valorDoImovel();
                int prazoImovel = interfaceUsuario.prazoDoFinanciamento();
                double taxaDeJuros = interfaceUsuario.taxaJurosAnual();
                double areaConstruida = interfaceUsuario.areaConstruida();
                double areaTerreno = interfaceUsuario.areaTerreno();

                // Criação de um objeto Casa com os dados fornecidos
                Casa casa = new Casa(valorDoImovel, prazoImovel, taxaDeJuros, areaConstruida, areaTerreno);
                imprimeFinanciamentos.add(casa);
            }

            if (tipoFinanciamento.equals("apartamento")) {
                // Solicitação dos dados específicos para um apartamento
                double valorDoImovel = interfaceUsuario.valorDoImovel();
                int prazoImovel = interfaceUsuario.prazoDoFinanciamento();
                double taxaDeJuros = interfaceUsuario.taxaJurosAnual();
                int numeroVagas = interfaceUsuario.numeroVagas();
                int numeroAndar = interfaceUsuario.numeroAndar();

                // Criação de um objeto Apartamento com os dados fornecidos
                Apartamento apartamento = new Apartamento(valorDoImovel, prazoImovel, taxaDeJuros, numeroVagas, numeroAndar);
                imprimeFinanciamentos.add(apartamento);
            }

            if (tipoFinanciamento.equals("terreno")) {
                // Solicitação dos dados específicos para um terreno
                double valorDoImovel = interfaceUsuario.valorDoImovel();
                int prazoImovel = interfaceUsuario.prazoDoFinanciamento();
                double taxaDeJuros = interfaceUsuario.taxaJurosAnual();
                String zona = interfaceUsuario.tipoZona();

                // Criação de um objeto Terreno com os dados fornecidos
                Terreno terreno = new Terreno(valorDoImovel, prazoImovel, taxaDeJuros, zona);
                imprimeFinanciamentos.add(terreno);
            }
        }

        // Escrever no arquivo "financiamentos.txt"
        String conteudo = imprimeFinanciamentos.imprimeLista();
        ArquivoUtil.escreveArquivo("financiamentos.txt", conteudo);

        // Ler e exibir os dados do arquivo "financiamentos.txt"
        String conteudoLido = ArquivoUtil.leArquivo("financiamentos.txt");
        System.out.println("Dados lidos do arquivo 'financiamentos.txt':");
        System.out.println(conteudoLido);
    }
}
