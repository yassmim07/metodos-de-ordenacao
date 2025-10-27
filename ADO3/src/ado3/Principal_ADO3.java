package ado3;

import basesMetodosOrdenacao.OrdenacaoBase;
import metodosDeOrdenacao.*;
import comandos_principais.*;
import java.util.Arrays;
import java.util.Scanner; 
import java.util.Random;

public class Principal_ADO3 {
    static OrdenacaoBase metodo;

    public static void main(String[] args) {
        int continuar;
        int vet[] = null;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("""
                ------------- Métodos de Ordenação -------------
                \n
                Opções: 
                1 - Método Bolha
                2 - Método de Seleção
                3 - Método de Inserção
                4 - Todos os métodos
                5 - Sair do programa
                """);
            System.out.print("Digite o número da opção escolhida: ");
            int op_escolhida = sc.nextInt();

            System.out.println("\n");
            System.out.println("""
                               O volume de dados será:
                               1 - Pequeno 
                               2 - Médio
                               3 - Grande
                               """);
            System.out.println("Opção escolhida: ");
            int volume_dados = sc.nextInt();
            vet = gerarRandom.gerarNums(vet, volume_dados);
            
            
            System.out.println("\n-------------- Saídas --------------\n");

            if (op_escolhida >= 1 && op_escolhida <= 3) {
                metodo = selecaoDoMetodo.escolha(op_escolhida);
                exibirSaida.saida(vet, metodo);

            } else if (op_escolhida == 4) {
                executarTodosOsMetodos(vet);

            } else { 
                System.out.println("Saindo do programa...");
                System.exit(0);
            }

            System.out.println("\n");      
                System.out.println("""
                                   ----- Deseja continuar? -----
                                   1 - Sim 
                                   2 - Não
                                   """);
                continuar = sc.nextInt();
                System.out.println("\n");
            } while (continuar == 1);
        
            System.out.println("Saindo do programa..");
    }
    
    

    private static void executarTodosOsMetodos(int[] vet) {
        OrdenacaoBase[] metodos = {new Bolha(), new Selecao(), new Insercao()};

        for (OrdenacaoBase m : metodos) {
            int[] copia = Arrays.copyOf(vet, vet.length);
            exibirSaida.saida(copia, m);
            System.out.println("\n--------------------------------------\n");
        }
    }
}
