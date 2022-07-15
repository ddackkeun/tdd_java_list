package com.ll.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppTest {
    @Test
    void ArrayList_클래스가_존재한다() {
        ArrayList al = new ArrayList();
    }

    @Test
    void size() {
        ArrayList al = new ArrayList();
        Assertions.assertEquals(0, al.size());
    }

    @Test
    void add() {
        ArrayList al = new ArrayList();
        al.add(100);
    }

    @Test
    void get() {
        ArrayList al = new ArrayList();
        al.add(100);
        int result = al.get(0);
        Assertions.assertEquals(result, 100);
    }

    @Test
    void add를_할때마다_size_증가_테스트() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        Assertions.assertEquals(3, al.size());
    }
}
