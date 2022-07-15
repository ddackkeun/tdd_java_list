package com.ll.exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {
    @Test
    void ArrayList_클래스가_존재한다() {
        ArrayList al = new ArrayList();
    }

    @Test
    void size() {
        ArrayList al = new ArrayList();
        assertEquals(0, al.size());
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
        assertEquals(result, 100);
    }

    @Test
    void add를_할때마다_size_증가_테스트() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        assertEquals(3, al.size());
    }

    @Test
    void get_1_equals_200() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);

        int result = al.get(1);
        assertEquals(200, result);
    }

    @Test
    void remove() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.remove(1);
    }

    @Test
    void remove_size감소_테스트() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        assertEquals(3, al.size());

        al.remove(1);
        assertEquals(2, al.size());
    }

    @Test
    void remove_사용시_데이터_한칸앞으로이동_테스트() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        assertEquals(3, al.size());

        al.remove(1);
        assertEquals(300, al.get(1));
    }

    @Test
    void 최초_배열크기_테스트() {
        ArrayList al = new ArrayList();
        assertEquals(2, al.getArrayLength());
    }

    @Test
    void 배열_크기증가_테스트() {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        assertEquals(2, al.getArrayLength());

        al.add(300);
        assertEquals(4, al.getArrayLength());
    }

    @Test
    void showAllValues() {
        ArrayList al = new ArrayList();
        al.add(1000);
        al.add(200);
        al.add(30);

        ByteArrayOutputStream output = TestUtil.setOutToByteArray();
        al.showAllValues();

        String result = output.toString();

        TestUtil.clearSetOutToByteArray(output);
        assertTrue(result.contains("== 전체 데이터 출력 =="));
        assertTrue(result.contains("0 : 1000"));
        assertTrue(result.contains("1 : 200"));
        assertTrue(result.contains("2 : 30"));
    }
}
