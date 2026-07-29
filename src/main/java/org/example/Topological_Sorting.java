package org.example;

import java.util.ArrayList;
import java.util.Stack;

public class Topological_Sorting {
    public static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,5));

    }
    public static void topoSortUtil(ArrayList<Edge>graph[], boolean vis[], int curr, Stack<Integer>stack){
        vis[curr] = true;
        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topoSortUtil(graph,vis,e.dest,stack);
            }
        }
        stack.push(curr);
    }
    public static void main(String[] args) {
      int V = 5;
      ArrayList<Edge>graph[] = new ArrayList[V];
      createGraph(graph);
    }
}
