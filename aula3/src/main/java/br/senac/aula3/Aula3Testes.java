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
public class Aula3Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fila f = new Fila(5);
        System.out.println(f.isEmpty());
        f.enqueue(1);
        f.enqueue(2);
        f.enqueue(3);
        f.enqueue(4);
        f.enqueue(5);
        System.out.println(f.isEmpty());
        f.dequeue();
        f.dequeue();
        f.dequeue();
        f.dequeue();
        f.dequeue();
        f.dequeue();
        System.out.println(f.isEmpty());
        
    }
    
}
