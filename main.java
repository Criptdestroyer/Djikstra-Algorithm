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
        n.addEdge(9, 7, 5);
        n.addEdge(7, 9, 5);
        Hashtable place = new Hashtable(10);
        place.putCol(0, "Universitas Sriwijaya");
        place.putCol(1, "Upnormal Radial");
        place.putCol(2, "Home");
        place.putCol(3, "Transmart");
        place.putCol(4, "McD");
        place.putCol(5, "Palembang Square");
        place.putCol(6, "Jakabaring");
        place.putCol(7, "Ampera");
        place.putCol(8, "Pusri");
        place.putCol(9, "Kertapati");

        System.out.println("===================================================");
        System.out.println("                 Welcome to E-maps");
        System.out.println("===================================================");
        boolean go = true;
        while (go) {
            System.out.println("info:");
            for (int i = 0; i < place.getCAPACITY(); i++) {
                System.out.println(i + " = " + place.get(i));
            }
            Dijkstra dj = new Dijkstra(10, n.getMap());
            System.out.println("Menu");
            System.out.println("1. One Destination");
            System.out.println("2. Many Destination");
            System.out.println("0 to exit app");
            System.out.print("input number: ");
            int menu = data.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("input your current place : ");
                    int asal = data.nextInt();
                    System.out.print("input your destination : ");
                    int tujuan = data.nextInt();
                    System.out.println("");
                    System.out.println("Shortest Path from " + place.get(asal) + " to " + place.get(tujuan));
                    dj.Dijkstra(asal);
                    int jarak = dj.PrintPath(tujuan, 0);
                    System.out.println("Distance : " + jarak);
                    System.out.println("");
                    break;
                case 2:
                    Queue pitstop = new Queue();
                    System.out.print("input your current place : ");
                    asal = data.nextInt();
                    int stop;
                    do {
                        System.out.print("input your destination (99 to stop)): ");
                        stop = data.nextInt();
                        if (stop != 99) {
                            pitstop.enqueue(stop);
                        }
                    } while (stop != 99);
                    int total = 0;
                    while (pitstop.getSize() != 0) {
                        dj = new Dijkstra(10, n.getMap());
                        tujuan = pitstop.dequeue();
                        System.out.println("");
                        System.out.println("Shortest Path from " + place.get(asal) + " to " + place.get(tujuan));
                        dj.Dijkstra(asal);
                        jarak = dj.PrintPath(tujuan, 0);
                        total += jarak;
                        System.out.println("Distance : " + jarak);
                        System.out.println("");
                        asal = tujuan;
                    }
                    System.out.println("Total Distance : " + total);
                    break;
                case 0:
                    go = false;
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }
            System.out.println("===================================================");
        }
    }
}
