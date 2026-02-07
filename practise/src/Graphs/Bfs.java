package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
//    steps for BFS traversal
//    Put start node in queue
//    Mark it visited
//    While queue not empty:
//    Remove node
//    Visit neighbors
//    Add unvisited neighbors to queue
    public static void main(String[] args) {
        int n =5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i=0;i<n;i++){
            graph.add(new ArrayList<>());

        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);



        bfs(0,graph);
    }
    static void bfs(int start , ArrayList<ArrayList<Integer>>graph){
        boolean [] visited = new boolean[graph.size()];
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        visited[start]=true;

        while (!q.isEmpty()){
           int node =  q.poll();
            System.out.print(node+" ");
            for (int nbr : graph.get(node)){
                if (!visited[nbr]){
                    visited[nbr]=true;
                    q.add(nbr);
                }
            }
        }

    }
}
