package cofrinho;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Real");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Escolha o tipo de moeda:");
                    System.out.println("1. Dolar");
                    System.out.println("2. Euro");
                    System.out.println("3. Real");
                    int tipoMoeda = scanner.nextInt();

                    System.out.println("Informe o valor da moeda:");
                    double valor = scanner.nextDouble();

                    Moeda novaMoeda = null;
                    switch (tipoMoeda) {
                        case 1:
                            novaMoeda = new Dolar("Dolar", valor);
                            break;
                        case 2:
                            novaMoeda = new Euro("Euro", valor); 
                            break;
                        case 3:
                            novaMoeda = new Real("Real", valor); 
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido.");
                            break;
                    }

                    if (novaMoeda != null) {
                        cofrinho.adicionarMoeda(novaMoeda);
                        System.out.println("Moeda adicionada ao cofrinho.");
                    }
                    break;

                case 2:
                	cofrinho.removerMoeda();
                    break;

                case 3:
                    cofrinho.listarMoedas();
                    break;
                    
                case 4:
                    double total = cofrinho.calcularTotalEmReal();
                    System.out.println("Total em Real: " + total);
                    break;
                    
                case 5:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }
    }
}