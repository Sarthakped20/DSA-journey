package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class P1 {
    public static void main(String[] args) {
        int n =7;
        ArrayList<ArrayList<Integer>>graph=new ArrayList<>();
        for (int i =0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(5).add(6);
        bfs(0,graph);

        System.out.println();
        System.out.println(graph.size());
        count(0,graph);
        count(5,graph);
        Ccount(graph);
        bfsss(0,graph);
    }

    static void bfs(int start , ArrayList<ArrayList<Integer>>graph){
        Queue<Integer>q = new LinkedList<>();
        boolean [] visited = new boolean[graph.size()];
        q.add(start);
        visited[start]=true;
        while (!q.isEmpty()){
            int node = q.poll();
            System.out.print(node+" ");

            for (int nrt : graph.get(node)){
                if (!visited[nrt]){
                    visited[nrt]=true;
                    q.add(nrt);
                }
            }
        }
    }
    static void count(int start , ArrayList<ArrayList<Integer>>graph){
        int count =0;
        Queue<Integer>q = new LinkedList<>();
        boolean [] visited = new boolean[graph.size()];
        q.add(start);
        visited[start]=true;
        while (!q.isEmpty()){
            int node = q.poll();
            count++;
            System.out.print(node+" ");

            for (int nrt : graph.get(node)){
                if (!visited[nrt]){
                    visited[nrt]=true;
                    q.add(nrt);
                }
            }
        }
        System.out.println("Length: "+count);
    }
    static void Ccount(ArrayList<ArrayList<Integer>>graph) {
        boolean [] visited = new boolean[graph.size()];
        int count = 0;
        for (int i =0;i< graph.size();i++){
            if (!visited[i]){
                bfss(i,graph,visited);
                count++;
            }
        }
        System.out.println("Number of components: "+count);
    }
    static void bfss(int start , ArrayList<ArrayList<Integer>>graph,boolean[]visited){
        Queue<Integer>q = new LinkedList<>();
        q.add(start);
         while (!q.isEmpty()){
             int node = q.poll();
//             System.out.println();
             for (int ntr : graph.get(node)){
                 if (!visited[ntr]){
                     visited[ntr]=true;
                     q.add(ntr);
                 }
             }
         }

    }
//    static void cycle(ArrayList<ArrayList<Integer>>graph){
//        boolean [] visited = new boolean[graph.size()];
//        for (int i =0;i<graph.size();i++){
//            if (visited[i] && i!= parent){
//                System.out.println("cycle detected! ");
//            } else if (!visited[i]) {
//                bfsss();
//            } else {
//                System.out.println("No cycle found! ");
//            }
//        }
//    }

    static void bfsss(int start,ArrayList<ArrayList<Integer>>graph) {

        Queue<Integer>q = new LinkedList<>();
        boolean[]visited = new boolean[graph.size()];
        q.add(start);
        int [] parent = new int[graph.size()];
        for (int i=0;i< parent.length;i++){
            parent[i]=-1;
        }
        while (!q.isEmpty()){
            int node = q.poll();
            parent[node] = node;
//commented hai niche ka code
//            for (int nbr : graph.get(node)) {
//                if (visited[nbr] && nbr != parent) {
//                    System.out.println("cycle detected! ");
//                } else if (!visited[nbr]) {
//                    visited[nbr] = true;
//                    q.add(nbr);
//                } else {
//                    System.out.println("No cycle found! ");
//                }
//            }
        }
    }
}
