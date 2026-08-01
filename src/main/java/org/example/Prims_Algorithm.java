package org.example;

import java.util.ArrayList;

public class Prims_Algorithm {
    public static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>graph[]){
        for (int i = 0;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }
    }
    public static void main(String[] args) {

    }
}
