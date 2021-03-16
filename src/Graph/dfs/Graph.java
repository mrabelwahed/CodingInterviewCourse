package Graph.dfs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    // number of vertices
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v ){
        this.V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    private void addEdge(int v , int w){
        adj[v].add(w);
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        //dfs
        g.dfs(2);

    }
    private  void dfs(int v){
       boolean visited [] = new boolean[V];
       dfsHelper(v,visited);
    }

    private void dfsHelper(int v, boolean[] visited){
        visited[v] = true;
        System.out.print(v+" ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                dfsHelper(n, visited);
        }

    }

}
