package comandos_principais;
import basesMetodosOrdenacao.OrdenacaoBase;
import metodosDeOrdenacao.Selecao;
import metodosDeOrdenacao.Insercao;
import metodosDeOrdenacao.Bolha;
import ado3.*;

import java.util.Arrays;

public class exibirSaida {
    static OrdenacaoBase metodo;

    public static void saida(int vet[], OrdenacaoBase metodo) {
        if (metodo instanceof Bolha) {
            System.out.println("Método Bolha - Estável");
        } else if (metodo instanceof Selecao) {
            System.out.println("Método por Seleção - Instável");
        } else if (metodo instanceof Insercao) {
            System.out.println("Método por Inserção - Estável");
        }
        
        System.out.println("\n");
        System.out.println("Vetor Desordenado: ");
        System.out.println(Arrays.toString(vet));


        long tempo1 = System.currentTimeMillis();

        metodo.ordenacao(vet);

        long tempo2 = System.currentTimeMillis();
        
        System.out.println("\n");
        System.out.println("Vetor Ordenado: ");
        System.out.println(Arrays.toString(vet));


        System.out.println("\n");
        System.out.println("Tempo de execução: " + (tempo2 - tempo1) + "ms");
        System.out.println("Número de comparações feitas: " + metodo.getComparacoes());
        System.out.println("Trocas realizadas: " + metodo.getTrocas());
    }
    
}
