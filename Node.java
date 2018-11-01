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
public class Node {
    LinkedList<LinkedList<Object>> List;
    private int position;
    public Node(){
        List = new LinkedList<>();
        position = 0;
    }
    public void addEdge(Object start, Object end, int dist){
        List.add(new LinkedList<>());
        LinkedList temp = List.get(position);
        temp.add(start);
        temp.add(end);
        temp.add(dist);
        position++;
    }
    public void print(){
        for (int i = 0; i < List.size(); i++) {
            LinkedList temp = List.get(i);
            System.out.println(temp.get(0)+" => "+temp.get(1)+" ("+temp.get(2)+") ");
        }
    }
}
