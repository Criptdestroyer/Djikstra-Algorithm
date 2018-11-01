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
    private int V;
    
    public Dijkstra(int V){
        this.V = V;
    }

    public int getV() {
        return V;
    }
    public LinkedList Dijkstra(int s){
        LinkedList<Integer> dist = new LinkedList<>();
        LinkedList<Boolean> visited = new LinkedList<>();
        LinkedList<Integer> pred = new LinkedList<>();
        fillArray(dist, Integer.MAX_VALUE);
        fillArray(visited, false);
        fillArray(pred, -1);
        
        dist.set(s, 0);
        while(true){
            int u = -1;
            int minDist = Integer.MAX_VALUE;
            for (int i = 1; i < V; i++) {
                if((!visited.get(i))&&(dist.get(i)<minDist)){
                    u = i;
                    minDist = dist.get(i);
                }
            }
            if((u==-1)||(isInfinite(dist.get(u)))){
                break;
            }
            visited.set(u, Boolean.TRUE);
            
        }
    }
    public boolean isInfinite(int isi){
        return isi == Integer.MAX_VALUE;
    }
    public void fillArray(LinkedList dist,Object isi){
        for (int i = 0; i < V; i++) {
            dist.add(isi);
        }
    }
}
