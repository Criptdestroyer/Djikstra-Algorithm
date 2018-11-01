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
public class Graph {
    private int map[][];
    public Graph(int x, int y){
        map = new int[x][y];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = Integer.MAX_VALUE;
            }
        }
    }

    public int[][] getMap() {
        return map;
    }
    public void addEdge(int start, int end, int dist){
        map[start][end] = dist;
    }

    
    public void print(){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j]==Integer.MAX_VALUE){
                    System.out.print("~ ");
                }else{
                    System.out.print(map[i][j]+" ");
                }
                
            }
            System.out.println("");
        }
    }
}
