package Dijkstra;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alfath
 */
public class Heap {

    private int[] arrHeap =  new int[100];
    private Map<Object,Integer> map = new HashMap<>();
    private int size;

    public Heap() {
        size = 0;
    }

    public int getParent(int x) {
        return (x - 1) / 2;
    }

    public int getLeft(int x) {
        return (x * 2) + 1;
    }

    public int getRight(int x) {
        return (x * 2) + 2;
    }
    public void push(int idx,int val) {
        int i = idx;
        arrHeap[i] = val;
        map.put(idx, val);
        while ((i > 0) && (arrHeap[i] > arrHeap[getParent(i)])) {
            int temp = arrHeap[i];
            arrHeap[i] = arrHeap[getParent(i)];
            arrHeap[getParent(i)] = temp;
            i = getParent(i);
        }
        size++;
    }
    public void pop(){
        int temp = arrHeap[0];
        arrHeap[0] = arrHeap[size-1];
        arrHeap[size-1] = temp;
        size--;
        heapify(0);
    }
    public int top(){
        return arrHeap[0];
    }
    public void heapify(int root){
        int i = root;
        boolean swapped = true;
        while(swapped){
            int maxIdx = i;
            if((getLeft(i) < size) && (arrHeap[maxIdx]<arrHeap[getLeft(i)])){
                maxIdx = getLeft(i);
            }
            if((getRight(i) < size) && (arrHeap[maxIdx]<arrHeap[getRight(i)])){
                maxIdx = getRight(i);
            }
            int temp2 = arrHeap[i];
            arrHeap[i] = arrHeap[maxIdx];
            arrHeap[maxIdx] = temp2;
            swapped = (maxIdx!=i);
            i = maxIdx;
        }
    }
    public void makeHeap(int A[],int N){
        for (int i = 0; i < N-1; i++) {
            arrHeap[size] = A[i];
            size++;
        }
        for (int i = (N/2)-1; i >= 0; i--) {
            heapify(i);
        }
    }
    
}
