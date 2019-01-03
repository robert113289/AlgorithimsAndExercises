package com.graph;

public class Vertex{
    Integer distance = null;
    Integer predecessor = null;
    public Vertex(){

    }

    public Vertex(Integer distance, Integer predecessor) {
        this.distance = distance;
        this.predecessor = predecessor;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Integer predecessor) {
        this.predecessor = predecessor;
    }
}