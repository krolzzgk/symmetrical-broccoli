/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.aula3;

/**
 *
 * @author karolina.gkallajian
 */
public class Fila {

    private int inicio;
    private int fim;
    private int[] vetor;

    public Fila(int tam) {
        this.inicio = -1;
        this.fim = -1;
        this.vetor = new int[tam];
    }

    public boolean isEmpty() {
        return (inicio == -1) && (fim == -1);
    }

    public void enqueue(int valor) {
        if ((inicio == -1) && (fim == -1)) {
            inicio++;
        }
        if (fim != vetor.length - 1) {
            fim++;
            vetor[fim] = valor;
        }else{
            
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            if (inicio <= vetor.length - 1) {
                int x = vetor[inicio];
                vetor[inicio] = 0;
                inicio++;
                return x;
            } else {
                System.out.println("Fim da fila");
            }
        }
        return 0;
    }
    
    public int size(){
        if(isEmpty()){
            return 0;
        }
        return vetor.length;
    }
}

    