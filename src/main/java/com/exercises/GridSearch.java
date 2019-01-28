package com.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GridSearch {
    class Node{
        Integer gIndex;
        Integer pIndex;
        ArrayList<Integer> foundAtIndex = new ArrayList<>();
        public Node(Integer gIndex, Integer pIndex){
            this.gIndex = gIndex;
            this.pIndex = pIndex;
        }
    }

    public String gridSearch(String[] G, String[] P) {
        LinkedList<Node> bsInfo = new LinkedList<>();
        for(int i = 0; i < G.length; i++){
            for(int j = 0; j < P.length; j++){
                if(G[i].contains(P[j])) {
                    Node node = new Node(i, j);
                    for(int k = 0; k < G[i].length(); k += P[j].length()){
                        int index = G[i].substring(k).indexOf(P[j]);
                        if(index >= 0){
                            node.foundAtIndex.add(index);
                        }
                    }
                    bsInfo.add(node);
                }
            }
        }
        Node prevNode = null;
        int count = 0;
        HashMap<Integer,Integer> possibleIndexs = new HashMap<>();
        for(Node node : bsInfo){
            int[][] g = new int[bsInfo.getLast().gIndex][G[node.gIndex].length()];
            if(prevNode == null){
                if(node.gIndex > 0){
                    prevNode = new Node(node.gIndex - 1,node.pIndex -1);
                    prevNode.foundAtIndex = node.foundAtIndex;
                }else{
                    prevNode = new Node(0, 0);
                }
            }
            if((node.pIndex == prevNode.pIndex + 1 && node.gIndex == prevNode.gIndex + 1) || node.gIndex == 0){
                count++;
                for(int i : node.foundAtIndex){
                    if(prevNode.foundAtIndex.contains(i)){
                        if(possibleIndexs.containsKey(i)){
                            possibleIndexs.replace(i, possibleIndexs.get(i) + 1);
                        } else {
                            possibleIndexs.put(i,1);
                        }
                    }
                }
                if(count == P.length) {
                    for (Integer subsequentialIndexCount : possibleIndexs.values()) {
                        if (subsequentialIndexCount >= P.length) {
                            return "YES";
                        }
                    }
                }
                prevNode = node;
                continue;
            }
            else{
                count = 0;
                possibleIndexs.clear();
            }
            prevNode = node;
        }


        return "NO";
    }


    static String firstAttempt(String[] G, String[] P) {
        int index = 0;
        int index2 = 0;
        boolean notFound = false;
        while(index2 < G.length){
            index = 0;
            notFound = false;
            if(G[index2].contains(P[index])){
                int holder = index2;
                Integer index3 = null;
                ArrayList<List<Integer>> foundatPrevIndex = new ArrayList<List<Integer>>();
                while(index < P.length && notFound == false){
                    if(G[index2].contains(P[index])){
                        ArrayList<List<Integer>> foundAtCurrentIndex = new ArrayList<>();
                        for(int i = 0; i < G[index2].length(); i += P[index].length()){
                            foundAtCurrentIndex.get(index).add(G[index2].substring(i).indexOf(P[index]));
                        }
                        Integer index4 = G[index2].indexOf(P[index]);
                        if(index3 == null){
                            index3 = index4;
                        }else if(index3 != index4){
                            //posibly at another index
                            for(Integer i : foundatPrevIndex.get(index - 1)){
                                if(foundAtCurrentIndex.get(index).contains(i)){
                                    index3 = foundAtCurrentIndex.indexOf(i);
                                    foundatPrevIndex = foundAtCurrentIndex;
                                    index++;
                                    index2++;
                                    continue;
                                }
                            }
                            notFound = true;
                            continue;
                        }
                        index++;
                        index2++;
                    }else{
                        notFound = true;
                    }
                }
                if(index == P.length){
                    return "YES";
                }
                index2 = holder;
            }
            index2++;
        }
        return "NO";
    }

}
