package util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner entrada = new Scanner(System.in);

    public double valorDoImovel() {
        double valorImovel = 0.0;

        while (true) {
            try {
                System.out.print("Digite o valor do imóvel (em reais): ");
                valorImovel = entrada.nextDouble();

                if (valorImovel <= 0) {
                    throw new Exception("Valor inválido. Digite um valor positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor digitado não é um número. Tente novamente.");
                entrada.nextLine(); // limpa o buffer do scanner
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Valor do imóvel: " + valorImovel);
        return valorImovel;
    }

    public int prazoDoFinanciamento() {
        int prazoImovel = 0;

        while (true) {
            try {
                System.out.print("Digite o prazo do imóvel (em anos): ");
                prazoImovel = entrada.nextInt();

                if (prazoImovel <= 0) {
                    throw new Exception("Valor inválido. Digite um valor positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor digitado não é um número inteiro. Tente novamente.");
                entrada.nextLine(); // limpa o buffer do scanner
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Prazo do imóvel: " + prazoImovel);
        return prazoImovel;
    }

    public double taxaJurosAnual() {
        double taxaDeJuros = 0.0;

        while (true) {
            try {
                System.out.print("Digite o valor da taxa de juros: ");
                taxaDeJuros = entrada.nextDouble();

                if (taxaDeJuros <= 0) {
                    throw new Exception("Valor inválido. Digite um valor positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor digitado não é um número. Tente novamente.");
                entrada.nextLine(); // limpa o buffer do scanner
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Valor da taxa de juros: " + taxaDeJuros);
        return taxaDeJuros;
    }
}