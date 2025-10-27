package metodosDeOrdenacao;

import basesMetodosOrdenacao.OrdenacaoBase;


public class Insercao extends OrdenacaoBase{
    int comparacoes = 0;
    int trocas = 0;
    
    public void ordenacao (int vet[]){
    //comparacoes = 0;
    //trocas = 0;
    
    int i, j, aux;
    for (i = 1; i < vet.length; i++){
        aux = vet[i];
        j = i - 1;
        while (j >= 0 && vet[j] > aux){
            comparacoes++;
            vet[j + 1] = vet[j];
            j--;
        }
        vet[j + 1] = aux;
            trocas++;
    }
}
    public int getComparacoes(){
        return comparacoes;
    }
    
    public int getTrocas(){
        return trocas;
    }
    
}
