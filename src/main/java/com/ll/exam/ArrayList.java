package com.ll.exam;

public class ArrayList {
    private int size;
    private Object[] datas;

    public ArrayList() {
        size = 0;
        datas = new Object[20];
    }

    public int size() {
        return size;
    }

    public void add(int data) {
        size++;
    }

    public int get(int index) {
        return 100;
    }
}
