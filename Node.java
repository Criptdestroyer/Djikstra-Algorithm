/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alfath
 */
public class Node {

    private Map<Object, Map> graph;
    private Map<Object, Integer> temp;
    private int length;

    public Map<Object, Map> getGraph() {
        return graph;
    }

    public Node() {
        graph = new HashMap<>();
        length = 0;
    }

    public void addEdge(Object start, Object end, int dist) {

        if (graph.containsKey(start)) {
            temp.put(end, dist);
            graph.put(start, temp);
        } else{
            temp = new HashMap<>();
            temp.put(end, dist);
            graph.put(start, temp);
            length++;
        }
    }

    public int getLength() {
        return length;
    }
    

    public void print() {
        System.out.println(graph.toString());
    }
}
