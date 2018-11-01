/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

import java.util.Random;

/**
 *
 * @author alfath
 */
public class Place {
    private String namePlace[];
    private int myPosition;
    public Place(int n){
        namePlace = new String[n];
        for (int i = 0; i < n; i++) {
            namePlace[i] = "";
        }
    }
    public void generateMaps(){
        Random rand = new Random();
        namePlace[rand.nextInt(8)+0] = "Istana Negara";
        namePlace[rand.nextInt(8)+0] = "Vanding Machine 1";
        namePlace[rand.nextInt(8)+0] = "Vanding Machine 2";
        namePlace[rand.nextInt(8)+0] = "Money Changer 1";
        namePlace[rand.nextInt(8)+0] = "Money Changer 2";
        myPosition = rand.nextInt(8)+0;
    }
   
    public int getMoneyChanger1(){
        int temp = -1;
        for (int i = 0; i < namePlace.length; i++) {
            if(namePlace[i].compareTo("Money Changer 1")==0){
                temp = i;
            }
        }
        return temp;
    }
    public int getMoneyChanger2(){
        int temp = -1;
        for (int i = 0; i < namePlace.length; i++) {
            if(namePlace[i].compareTo("Money Changer 2")==0){
                temp = i;
            }
        }
        return temp;
    }
    public int getVandingMachine1(){
        int temp = -1;
        for (int i = 0; i < namePlace.length; i++) {
            if(namePlace[i].compareTo("Vanding Machine 1")==0){
                temp = i;
            }
        }
        return temp;
    }
    public int getVandingMachine2(){
        int temp = -1;
        for (int i = 0; i < namePlace.length; i++) {
            if(namePlace[i].compareTo("Vanding Machine 2")==0){
                temp = i;
            }
        }
        return temp;
    }
    public int getIstanaNegara(){
        int temp = -1;
        for (int i = 0; i < namePlace.length; i++) {
            if(namePlace[i].compareTo("Istana Negara")==0){
                temp = i;
            }
        }
        return temp;
    }
    public int getMyPosition(){
        return myPosition;
    }
    public void setMyPosition(int index){
        myPosition = index;
    }
    
}
