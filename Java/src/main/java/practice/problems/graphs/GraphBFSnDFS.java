package practice.problems.graphs;

import sun.security.provider.certpath.Vertex;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author kartik sharma
 * @date 26/03/18
 */
public class GraphBFSnDFS {

    static class Graph{
        private int vertex;
        private LinkedList<Integer> adj[];
        Graph(int v){
            vertex = v;
            adj = new LinkedList[v];
            for (int i=0;i<v;i++)
                adj[i] = new LinkedList<Integer>();
        }
        void addEdge(int v, int e){
            adj[v].add(e);
        }

        void BFS(int s){
            boolean visited[] = new boolean[vertex];
            LinkedList<Integer> queue = new LinkedList<Integer>();
            visited[s] = true;
            queue.add(s);
            while(!queue.isEmpty()){
                s = queue.poll();
                System.out.print(s + " ");
                Iterator<Integer> iterator = adj[s].listIterator();
                while(iterator.hasNext()){
                    int next = iterator.next();
                    if(visited[next] != true){
                        visited[next] = true;
                        queue.add(next);
                    }
                }
            }
        }

        void DFS(){
            boolean visited[] = new boolean[vertex];
            for (int i=0; i<vertex; i++)
                if(visited[i]!=true)
                    DFSUtil(i, visited);
        }

        void DFSUtil(int v, boolean[] visited){
            visited[v] = true;
            System.out.print(v + " ");
            Iterator<Integer> iterator = adj[v].listIterator();
            while(iterator.hasNext()){
                int n = iterator.next();
                if(!visited[n])
                    DFSUtil(n, visited);
            }
        }
    }

    public static void main(String args[]){

        Graph graph = new Graph(10);
        graph.addEdge(0, 2);
        graph.addEdge(1, 8);
        graph.addEdge(1, 4);
        graph.addEdge(2, 8);
        graph.addEdge(2, 6);
        graph.addEdge(3, 5);
        graph.addEdge(6, 9);
        int start = 2;

        System.out.println("\nBFS of the graph starting at " + start + " is");
        graph.BFS(start);
        System.out.println("\nDFS of the graph is");
        graph.DFS();

    }
}
