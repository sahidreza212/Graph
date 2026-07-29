package org.example;

import java.util.ArrayList;

public class Topological_Sorting {
    public static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Cycle_Detection.Edge> graph[]){
        for (int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[1].add(new Cycle_Detection.Edge(1,2));

        graph[2].add(new Cycle_Detection.Edge(2,3));
        graph[2].add(new Cycle_Detection.Edge(2,4));

        graph[3].add(new Cycle_Detection.Edge(3,5));

        graph[4].add(new Cycle_Detection.Edge(4,5));

    }
    public static void main(String[] args) {

    }
}
