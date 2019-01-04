package com.graph;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdjacencyListTest {

//    Program.assertEqual(bfsInfo[0], {distance: 4, predecessor: 1});
//Program.assertEqual(bfsInfo[1], {distance: 3, predecessor: 4});
//Program.assertEqual(bfsInfo[2], {distance: 1, predecessor: 3});
//Program.assertEqual(bfsInfo[3], {distance: 0, predecessor: null});
//Program.assertEqual(bfsInfo[4], {distance: 2, predecessor: 2});
//Program.assertEqual(bfsInfo[5], {distance: 2, predecessor: 2});
//Program.assertEqual(bfsInfo[6], {distance: 1, predecessor: 3});
//Program.assertEqual(bfsInfo[7], {distance: null, predecessor: null});

    @Test
    public void breadthFirstSearch() {
        int[][] exampleAdjacencyList = {
                {1},
                {0,4,5},
                {3,4,4},
                {2,6},
                {1,2},
                {1,2,6},
                {3,5},
                {}
        };
        AdjacencyList adjacencyList = new AdjacencyList();
        Vertex expected = new Vertex(3,4);
        List<Vertex> actual = adjacencyList.breadthFirstSearch(exampleAdjacencyList, 3);

        Assert.assertEquals(expected.distance, actual.get(1).distance);
        Assert.assertEquals(expected.predecessor, actual.get(1).predecessor);
        expected = new Vertex();
        expected.setDistance(0);
        assertEquals(expected.getDistance(), actual.get(3).getDistance());


    }
}