/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basesMetodosOrdenacao;

/**
 *
 * @author yasmi
 */
public abstract class OrdenacaoBase implements Ordenacao {
    protected int comparacoes = 0;
    protected int trocas = 0;

    public int getComparacoes() { return comparacoes; }
    public int getTrocas() { return trocas; }
}
