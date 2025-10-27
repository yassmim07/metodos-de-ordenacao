package metodosDeOrdenacao;

import basesMetodosOrdenacao.OrdenacaoBase;

public class Bolha extends OrdenacaoBase {
    
    public void ordenacao (int[] vet){
        comparacoes = 0;
        trocas = 0;
        int temp;
        for (int i = 0; i < vet.length; i++){
            for (int j = 0; j <vet.length - (i+1); j++){
                comparacoes++;
                if (vet[j] > vet[j+1]){
                    temp = vet[j];
                    vet[j] = vet [j+1];
                    vet[j+1] = temp;
                    trocas++;
                }
                
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

