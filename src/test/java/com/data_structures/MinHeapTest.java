package com.data_structures;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class MinHeapTest {

    @Test
    public void addPeek() {
        Random random = new Random();
        int totalTests = 10;
        for(int numTest = 1; numTest <= totalTests; numTest++){
            MinHeap minHeap = new MinHeap();
            int min = Integer.MAX_VALUE;
            for(int i = 1; i < 50; i++){
                int someNum = random.nextInt();
                if(someNum < min) min = someNum;
                minHeap.add(someNum);
                assertEquals(min, minHeap.peek());
            }
        }
    }

    @Test
    public void addPoll() {
        MinHeap minHeap = new MinHeap();
        for(int i = 50; i >= 0; i--){
            minHeap.add(i);
            assertEquals(i, minHeap.poll());
        }
        minHeap.add(10);
        minHeap.add(15);
        minHeap.add(17);
        minHeap.add(20);
        assertEquals(10, minHeap.poll());
        assertEquals(15, minHeap.poll());
        assertEquals(17, minHeap.poll());
        assertEquals(20, minHeap.poll());
    }
}