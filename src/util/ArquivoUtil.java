package util;

import java.io.*;

// Classe utilitária para operações de leitura e escrita de arquivos
public class ArquivoUtil {

    // Método estático para escrever conteúdo em um arquivo
    public static void escreveArquivo(String nomeArquivo, String conteudo) {
        try (FileWriter escreve = new FileWriter(nomeArquivo)) {
            escreve.write(conteudo); // Escreve o conteúdo no arquivo
            System.out.println("Dados foram salvos no arquivo '" + nomeArquivo + "'.");
        } catch (IOException e) {
            e.printStackTrace(); // Imprime detalhes do erro, se houver
        }
    }

    // Método estático para ler o conteúdo de um arquivo
    public static String leArquivo(String nomeArquivo) {
        StringBuilder conteudo = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                conteudo.append(linha).append("\n"); // Lê cada linha e adiciona ao StringBuilder
            }
        } catch (IOException e) {
            e.printStackTrace(); // Imprime detalhes do erro, se houver
        }
        return conteudo.toString(); // Retorna o conteúdo do arquivo como uma string
    }
}
