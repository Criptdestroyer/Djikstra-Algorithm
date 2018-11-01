/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

import java.util.LinkedList;

/**
 *
 * @author alfath
 */
public class Dijkstra {

    private final int V;
    private int s;
    private final int[][] Node;
    LinkedList<Integer> dist;
    LinkedList<Boolean> visited;
    LinkedList<Integer> pred;

    public Dijkstra(int V, int[][] Node) {
        this.V = V;
        this.Node = Node;
        dist = new LinkedList<>();
        visited = new LinkedList<>();
        pred = new LinkedList<>();
    }

    public int getV() {
        return V;
    }

    public LinkedList Dijkstra(int s) {
        this.s = s;
        fillArray(dist, Integer.MAX_VALUE);
        fillArray(visited, false);
        fillArray(pred, -1);

        dist.set(s, 0);
        while (true) {
            int u = -1;
            int minDist = Integer.MAX_VALUE;
            for (int i = 0; i < V; i++) {
                if ((!visited.get(i)) && (dist.get(i) < minDist)) {
                    u = i;
                    minDist = dist.get(i);
                }
            }
            if ((u == -1) || (isInfinite(dist.get(u)))) {
                break;
            }
            visited.set(u, Boolean.TRUE);

            for (int i = 0; i < Node[u].length; i++) {
                if (Node[u][i] != Integer.MAX_VALUE) {
                    if (dist.get(i) > (dist.get(u) + Node[u][i])) {
                        dist.set(i, dist.get(u)+Node[u][i]);
                        pred.set(i, u);
                    }
                }
            }
            
        }
        return dist;
    }
    

    public boolean isInfinite(int isi) {
        return isi == Integer.MAX_VALUE;
    }

    public void fillArray(LinkedList dist, Object isi) {
        for (int i = 0; i < V; i++) {
            dist.add(isi);
        }
    }

    public void PrintPath(int x) {
        if ((pred.get(x) == -1) && (x != s)) {
            System.out.println("there is no way");
        } else if (pred.get(x) != -1) {
            PrintPath(pred.get(x));
            System.out.println(pred.get(x) + " to " + x);
        }
    }
}
