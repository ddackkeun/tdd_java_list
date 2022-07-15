package com.ll.exam;

public class ArrayList {
    private int size;
    private Integer[] datum;

    public ArrayList() {
        size = 0;
        datum = new Integer[20];
    }

    public int size() {
        return size;
    }

    public void add(int data) {
        datum[size] = data;
        size++;
    }

    public int get(int index) {
        return datum[index];
    }

    public void remove(int index) {
        for(int i=index; i<size; i++){
            datum[i] = datum[i+1];
        }
        size--;
    }
}
