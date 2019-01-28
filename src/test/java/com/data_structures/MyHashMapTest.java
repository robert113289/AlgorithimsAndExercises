package com.data_structures;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {

    @Test
    public void addGetTest() {
        MyHashMap<String, Integer> groceryList = new MyHashMap<>();
        groceryList.add("tacos",8);
        groceryList.add("milk", 1);
        groceryList.add("eggs", 12);

        assertEquals(12, (int) groceryList.get("eggs"));
    }

    @Test
    public void addRemoveTest() {
        MyHashMap<String, Integer> groceryList = new MyHashMap<>();
        groceryList.add("tacos",8);
        groceryList.add("milk", 1);
        groceryList.add("eggs", 12);

        assertEquals(1, (int) groceryList.remove("milk"));
        assertNull(groceryList.get("milk"));
    }

    @Test
    public void addIsEmpty() {
        MyHashMap<String, Integer> groceryList = new MyHashMap<>();
        assertTrue(groceryList.isEmpty());

        groceryList.add("chicken", 3);
        assertFalse(groceryList.isEmpty());
    }
}