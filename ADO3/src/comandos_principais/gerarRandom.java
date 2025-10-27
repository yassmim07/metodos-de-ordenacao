package comandos_principais;

import java.util.Scanner;
import java.util.Random;

public class gerarRandom {
    public static int[] gerarNums(int vet[], int opc) {
        Scanner sc = new Scanner(System.in);
        Random rd  = new Random();
        vet = new int[0]; // garante inicialização

        switch (opc){
            case 1: 
                vet = new int [10];
                System.out.println("\n");
                System.out.println("Um Volume de Dados Pequeno possui 10 valores. Digite-os: ");
                for (int i = 0; i < vet.length; i++){
                    System.out.printf("%d° valor: ", i + 1);
                    vet[i] = sc.nextInt();
                }
                break;
            case 2: 
                vet = new int [1000];
                for(int i = 0; i < vet.length; i++){
                    vet[i] = rd.nextInt(4500);
                }
                break; 
            case 3: 
                vet = new int[10000];
                for(int i = 0; i < vet.length; i++){
                    vet[i] = rd.nextInt(14500);
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        return vet;
    }
}
