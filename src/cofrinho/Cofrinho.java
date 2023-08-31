package cofrinho;
import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho {
    private ArrayList<Moeda> moedas;
    Scanner scanner = new Scanner(System.in);
    
    public Cofrinho() {
        moedas = new ArrayList<Moeda>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda() {
     	System.out.println("Escolha a moeda que deseja remover:");
    	int index = 0;
        for (Moeda moeda : moedas) {
            System.out.println((index++)+" - "+moeda.getTipo() + " - Valor: " + moeda.getValor());
        }
        int moedaRemoção = scanner.nextInt(); 
        moedas.remove(moedaRemoção);
        
        for (Moeda moeda : moedas) {
            System.out.println(moeda.getTipo() + " - Valor: " + moeda.getValor());
        }
    }

    public void listarMoedas() {
        for (Moeda moeda : moedas) {
            System.out.println(moeda.getTipo() + " - Valor: " + moeda.getValor());
        }
    }

    public double calcularTotalEmReal() {
        double total = 0.0;
        for (Moeda moeda : moedas) {
            total += moeda.valorEmReal();
        }
        return total;
    }
}