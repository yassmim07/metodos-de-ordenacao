package metodosDeOrdenacao;

import basesMetodosOrdenacao.OrdenacaoBase;

public class Selecao extends OrdenacaoBase {
    //int comparacoes = 0; 
    //int trocas = 0;

    public void ordenacao (int[] vet){
        comparacoes = 0;
        trocas = 0;
        int min;
        int k;
        
        for (int i = 0; i < vet.length; i++){
            min = i; 
            for (int j = (i + 1); j < vet.length; j++){
                if(vet[j] < vet[min]){
                comparacoes++;
                    min = j;
                }
            }
            if (i != min){
                k = vet[i];
                vet[i] = vet[min];
                vet[min] = k;
                trocas++;
            }
        }
    }
    
    public int getComparacoes(){
        return comparacoes;
    }
    
    public int getTrocas(){
        return trocas;
    }
}
    

