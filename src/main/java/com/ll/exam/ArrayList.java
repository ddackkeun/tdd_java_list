package com.ll.exam;

public class ArrayList {
    private int size;
    private Integer[] datum;

    public ArrayList() {
        size = 0;
        datum = new Integer[2];
    }

    public int size() {
        return size;
    }

    public void add(int data) {
        sizeUpIfFull();
        datum[size] = data;
        size++;
    }

    public int get(int index) {
        return datum[index];
    }

    public void remove(int index) {
        for(int i=index+1; i<size; i++){
            datum[i-1] = datum[i];
        }
        size--;
    }

    public int getArrayLength() {
        return datum.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");

        for (int i = 0; i < size; i++) {
            System.out.println(i + " : " + datum[i]);
        }
    }
    private boolean isFull(){
        return size == datum.length;
    }
    private void sizeUp() {
        Integer[] newDatum = new Integer[datum.length*2];

        for (int i = 0; i < datum.length; i++) {
            newDatum[i] = datum[i];
        }
        datum = newDatum;
    }
    private void sizeUpIfFull() {
        if (isFull()) {
            sizeUp();
        }
    }


}
