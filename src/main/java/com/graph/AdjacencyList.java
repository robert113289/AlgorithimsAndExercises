package com.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AdjacencyList {



    //adjList = [
    //    [1],
    //    [0, 4, 5],
    //    [3, 4, 5],
    //    [2, 6],
    //    [1, 2],
    //    [1, 2, 6],
    //    [3, 5],
    //    []
    //    ];

    private int[][] exampleAdjacencyList = {
            {1},
            {0,4,5},
            {3,4},
            {2,6},
            {1,2},
            {1,2,6},
            {3,5},
            {}
    };

    public List<Vertex> breadthFirstSearch(int[][] graph, int source){
        ArrayList<Vertex> bsfInfo = new ArrayList<Vertex>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < graph.length; i++){
            bsfInfo.add(i, new Vertex());
        }
        bsfInfo.get(source).distance = 0;
        queue.add(source);

        while(queue.peek() != null){
            int u = queue.poll();
            for(int j = 0; j < graph[u].length; j++){
                int adjV = graph[u][j];
                if(bsfInfo.get(adjV).distance == null){
                    bsfInfo.get(adjV).distance = bsfInfo.get(u).distance + 1;
                    bsfInfo.get(adjV).predecessor = u;
                    queue.add(adjV);
                }
            }
        }
        return bsfInfo;
    }
}
