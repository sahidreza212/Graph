package org.example;

import java.util.ArrayList;

public class Kosaraju_Algorithm {
    public static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,4));
    }
    public static void main(String[] args) {
      int V = 5;
      ArrayList<Edge>graph[] = new ArrayList[V];
      createGraph(graph);
    }
}
