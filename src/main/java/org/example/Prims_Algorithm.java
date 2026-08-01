package org.example;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims_Algorithm {
    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        public Pair(int n,int c){
            this.node = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void createGraph(ArrayList<Edge>graph[]){
        for (int i = 0;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,3,40));
        graph[1].add(new Edge(1,0,10));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }

public static void primsAlgo(ArrayList<Edge>graph,int V){
    PriorityQueue<Pair>pq = new PriorityQueue<>();
    boolean vis[] = new boolean[V];
    pq.add(new Pair(0,0));
    int mstCost = 0;

}
    public static void main(String[] args) {

        int V = 4;
        ArrayList<Edge>graph[] = new ArrayList[V];
        createGraph(graph);
    }
}
