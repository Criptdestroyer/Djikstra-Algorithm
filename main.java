/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;


/**
 *
 * @author alfath
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node n = new Node();
        n.addEdge(1,2, 2);
        n.addEdge(1,3, 6);
        n.addEdge(1,4, 3);
        n.addEdge(2,5, 5);
        n.addEdge(3,5, 1);
        n.addEdge(3,4, 4);
        n.print();
    }
    
}
