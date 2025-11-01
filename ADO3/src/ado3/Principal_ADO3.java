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
                4 - Sair do programa
                """);
            System.out.print("Digite o número da opção escolhida: ");
            int op_escolhida = sc.nextInt();

            
            switch(op_escolhida){
                case 1:
                    metodo = new Bolha();
                    break;
                case 2:
                    metodo = new Insercao();
                    break;
                case 3:
                    metodo = new Selecao();
                    break;
                default:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                
            }
            
                
            System.out.println("\n");
            System.out.println("""
                               ---------------- Volume de Dados ---------------
                               1 - Pequeno 
                               2 - Médio
                               3 - Grande
                               """);
            System.out.println("Opção escolhida: ");  
            int op_volume_dados = sc.nextInt();
            vet = gerarRandom.gerarNums(vet, op_volume_dados);
            
            
              
            System.out.println("\n------------------- Saídas ---------------------\n");

                metodo = selecaoDoMetodo.escolha(op_escolhida);
                exibirSaida.saida(vet, metodo);


            System.out.println("\n");      
                System.out.println("""
                                   +++++++------- Deseja continuar? -------+++++++
                                   1 - Sim 
                                   2 - Não
                                   """);
                continuar = sc.nextInt();
                System.out.println("\n");
            
            } while (continuar == 1);
        
            System.out.println("Saindo do programa..");
    }
    
    
}
