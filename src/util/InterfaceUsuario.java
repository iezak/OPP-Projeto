package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner entrada = new Scanner(System.in);

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
                entrada.nextLine(); // limpa o buffer do scanner
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println("Quantidade de: " + qtdaFinanciamentos);
        return qtdaFinanciamentos;
    }

    public String tipoFinanciamento() {
        while (true) {
            try {
                System.out.print("Digite o tipo do financiamento (casa, apartamento, terreno): ");
                String tipoFinanciamento = entrada.nextLine();

                if (tipoFinanciamento.equals("casa") || tipoFinanciamento.equals("apartamento")
                        || tipoFinanciamento.equals("terreno")) {
                    System.out.println("Tipo do financiamento: " + tipoFinanciamento);
                    return tipoFinanciamento;
                }
                throw new Exception("Valor inválido. Verifique se digitou corretamente.");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

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

    public double areaConstruida() {

        double areaConstruida = 0.0;

        while (true) {
            try {
                System.out.print("Digite a area da construção: ");
                areaConstruida = entrada.nextDouble();

                if (areaConstruida <= 0) {
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

        System.out.println("Area da construção: " + areaConstruida);
        return areaConstruida;
    }

    public double areaTerreno() {

        double areaTerreno = 0.0;

        while (true) {
            try {
                System.out.print("Digite a area do terreno: ");
                areaTerreno = entrada.nextDouble();

                if (areaTerreno <= 0) {
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

        System.out.println("Area do terreno: " + areaTerreno);
        return areaTerreno;
    }

    public int numeroVagas() {
        int numeroVagas = 0;

        while (true) {
            try {
                System.out.print("Digite o numero de vagas: ");
                numeroVagas = entrada.nextInt();

                if (numeroVagas <= 0) {
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

        System.out.println("Numero de vagas: " + numeroVagas);
        return numeroVagas;
    }

    public int numeroAndar() {
        int numeroAndar = 0;

        while (true) {
            try {
                System.out.print("Digite o numero do andar: ");
                numeroAndar = entrada.nextInt();

                if (numeroAndar <= 0) {
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

        System.out.println("Numero do andar: " + numeroAndar);
        return numeroAndar;
    }

    public String tipoZona() {
        while (true) {
            try {
                System.out.print("Digite o tipo da zona (residencial, comercial): ");
                String tipoFinanciamento = entrada.nextLine();

                if (tipoFinanciamento.equals("residencial") || tipoFinanciamento.equals("comercial")) {
                    System.out.println("Tipo de zona: " + tipoFinanciamento);
                    return tipoFinanciamento;
                }
                throw new Exception("Valor inválido. Verifique se digitou corretamente.");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}