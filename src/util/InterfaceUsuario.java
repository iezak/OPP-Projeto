package util;

import java.util.InputMismatchException;
import java.util.Scanner;

// Classe para interação com o usuário via console
public class InterfaceUsuario {
    private Scanner entrada = new Scanner(System.in); // Scanner para ler entrada do usuário

    // Método para obter a quantidade de financiamentos desejada pelo usuário
    public int qtdaFinanciamentos() {
        int qtdaFinanciamentos = 0;

        while (true) {
            try {
                System.out.print("Digite a quantidade de financiamentos que deseja fazer: ");
                qtdaFinanciamentos = entrada.nextInt();

                if (qtdaFinanciamentos <= 0) {
                    throw new Exception("Valor inválido. Digite um valor positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor digitado não é um número inteiro. Tente novamente.");
                entrada.nextLine(); // Limpa o buffer do scanner para tentar novamente
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Quantidade de financiamentos: " + qtdaFinanciamentos);
        return qtdaFinanciamentos;
    }

    // Método para obter o tipo de financiamento desejado pelo usuário
    public String tipoFinanciamento() {
        entrada.nextLine(); // Limpar o buffer do Scanner antes de solicitar nova entrada

        while (true) {
            try {
                System.out.print("Digite o tipo do financiamento (casa, apartamento, terreno): ");
                String tipoFinanciamento = entrada.nextLine().trim().toLowerCase();

                if (tipoFinanciamento.equals("casa") || tipoFinanciamento.equals("apartamento") || tipoFinanciamento.equals("terreno")) {
                    System.out.println("Tipo do financiamento selecionado: " + tipoFinanciamento);
                    return tipoFinanciamento;
                }
                throw new Exception("Valor inválido. Verifique se digitou corretamente.");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    // Método para obter o valor do imóvel do usuário
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
                entrada.nextLine(); // Limpa o buffer do scanner para tentar novamente
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Valor do imóvel: R$ " + valorImovel);
        return valorImovel;
    }

    // Método para obter o prazo do financiamento desejado pelo usuário
    public int prazoDoFinanciamento() {
        int prazoImovel = 0;

        while (true) {
            try {
                System.out.print("Digite o prazo do financiamento (em anos): ");
                prazoImovel = entrada.nextInt();

                if (prazoImovel <= 0) {
                    throw new Exception("Valor inválido. Digite um valor positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor digitado não é um número inteiro. Tente novamente.");
                entrada.nextLine(); // Limpa o buffer do scanner para tentar novamente
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Prazo do financiamento: " + prazoImovel + " anos");
        return prazoImovel;
    }

    // Método para obter a taxa de juros anual desejada pelo usuário
    public double taxaJurosAnual() {
        double taxaDeJuros = 0.0;

        while (true) {
            try {
                System.out.print("Digite a taxa de juros anual (%): ");
                taxaDeJuros = entrada.nextDouble();

                if (taxaDeJuros <= 0) {
                    throw new Exception("Valor inválido. Digite um valor positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor digitado não é um número. Tente novamente.");
                entrada.nextLine(); // Limpa o buffer do scanner para tentar novamente
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Taxa de juros anual: " + taxaDeJuros + "%");
        return taxaDeJuros;
    }

    // Método para obter a área construída do imóvel do usuário
    public double areaConstruida() {
        double areaConstruida = 0.0;

        while (true) {
            try {
                System.out.print("Digite a área construída do imóvel (em metros quadrados): ");
                areaConstruida = entrada.nextDouble();

                if (areaConstruida <= 0) {
                    throw new Exception("Valor inválido. Digite um valor positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor digitado não é um número. Tente novamente.");
                entrada.nextLine(); // Limpa o buffer do scanner para tentar novamente
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Área construída do imóvel: " + areaConstruida + " m²");
        return areaConstruida;
    }

    // Método para obter a área do terreno do usuário
    public double areaTerreno() {
        double areaTerreno = 0.0;

        while (true) {
            try {
                System.out.print("Digite a área do terreno (em metros quadrados): ");
                areaTerreno = entrada.nextDouble();

                if (areaTerreno <= 0) {
                    throw new Exception("Valor inválido. Digite um valor positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor digitado não é um número. Tente novamente.");
                entrada.nextLine(); // Limpa o buffer do scanner para tentar novamente
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Área do terreno: " + areaTerreno + " m²");
        return areaTerreno;
    }

    // Método para obter o número de vagas de garagem do usuário
    public int numeroVagas() {
        int numeroVagas = 0;

        while (true) {
            try {
                System.out.print("Digite o número de vagas de garagem: ");
                numeroVagas = entrada.nextInt();

                if (numeroVagas <= 0) {
                    throw new Exception("Valor inválido. Digite um valor positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor digitado não é um número inteiro. Tente novamente.");
                entrada.nextLine(); // Limpa o buffer do scanner para tentar novamente
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Número de vagas de garagem: " + numeroVagas);
        return numeroVagas;
    }

    // Método para obter o número do andar do apartamento do usuário
    public int numeroAndar() {
        int numeroAndar = 0;

        while (true) {
            try {
                System.out.print("Digite o número do andar do apartamento: ");
                numeroAndar = entrada.nextInt();

                if (numeroAndar <= 0) {
                    throw new Exception("Valor inválido. Digite um valor positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor digitado não é um número inteiro. Tente novamente.");
                entrada.nextLine(); // Limpa o buffer do scanner para tentar novamente
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Número do andar do apartamento: " + numeroAndar);
        return numeroAndar;
    }

    // Método para obter o tipo de zona do terreno (residencial ou comercial) do usuário
    public String tipoZona() {
        entrada.nextLine(); // Limpar o buffer do Scanner antes de solicitar nova entrada

        while (true) {
            try {
                System.out.print("Digite o tipo da zona do terreno (residencial, comercial): ");
                String tipoZona = entrada.nextLine().trim().toLowerCase();

                if (tipoZona.equals("residencial") || tipoZona.equals("comercial")) {
                    System.out.println("Tipo da zona do terreno: " + tipoZona);
                    return tipoZona;
                }
                throw new Exception("Valor inválido. Verifique se digitou corretamente.");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
