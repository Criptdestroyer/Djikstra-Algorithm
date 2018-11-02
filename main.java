/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

import java.util.Scanner;

/**
 *
 * @author alfath
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        Graph n = new Graph(10, 10);
        n.addEdge(0, 1, 4);
        n.addEdge(0, 7, 8);
        n.addEdge(1, 7, 11);
        n.addEdge(1, 2, 8);
        n.addEdge(1, 0, 4);
        n.addEdge(2, 8, 2);
        n.addEdge(2, 3, 7);
        n.addEdge(2, 5, 4);
        n.addEdge(2, 1, 8);
        n.addEdge(3, 2, 7);
        n.addEdge(3, 5, 14);
        n.addEdge(3, 4, 9);
        n.addEdge(4, 3, 9);
        n.addEdge(4, 5, 10);
        n.addEdge(5, 4, 10);
        n.addEdge(5, 3, 14);
        n.addEdge(5, 2, 4);
        n.addEdge(5, 6, 2);
        n.addEdge(6, 5, 2);
        n.addEdge(6, 8, 6);
        n.addEdge(6, 7, 1);
        n.addEdge(7, 6, 1);
        n.addEdge(7, 8, 7);
        n.addEdge(7, 1, 11);
        n.addEdge(7, 0, 8);
        n.addEdge(8, 7, 7);
        n.addEdge(8, 6, 6);
        n.addEdge(8, 2, 2);

        System.out.println("===================================================");
        System.out.println("                 Welcome to E-maps");
        System.out.println("===================================================");
        Dijkstra dj = new Dijkstra(10, n.getMap());
        Place p = new Place(9);
        p.generateMaps();

        boolean go = true;
        System.out.println("Location Info:");
        System.out.println("- Your Position \t: " + p.getMyPosition());
        System.out.println("- Istana Negara \t: " + p.getIstanaNegara());
        System.out.println("- Money Changer 1\t: " + p.getMoneyChanger1());
        System.out.println("- Money Changer 2\t: " + p.getMoneyChanger2());
        System.out.println("- Vanding Machine 1\t: " + p.getVandingMachine1());
        System.out.println("- Vanding Machine 2\t: " + p.getVandingMachine2());
        System.out.println("");

        System.out.println("Menu");
        System.out.println("1. Go to nearest vanding machine");
        System.out.println("2. Go to nearest money changer");
        System.out.println("3. Go to another place");
        System.out.print("input number: ");
        int menu = data.nextInt();
        if (menu == 1) {

        } else if (menu == 2) {

        } else if (menu == 3) {
            System.out.print("input your destination : ");
            int tujuan = data.nextInt();
            if (tujuan == 99) {
                go = false;
            }
            System.out.println("");
            dj.Dijkstra(p.getMyPosition());
            dj.PrintPath(tujuan);
            p.setMyPosition(tujuan);
            System.out.println("");
        } else {
            System.out.println("Wrong Input");
        }
        System.out.println("===================================================");
    }
}
