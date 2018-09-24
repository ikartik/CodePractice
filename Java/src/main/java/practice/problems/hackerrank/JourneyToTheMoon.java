package practice.problems.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author kartik sharma
 * @date 01/05/18
 */
public class JourneyToTheMoon {

    static class Graph {
        private int vertex;
        private LinkedList<Integer> adj[];

        Graph(int v) {
            vertex = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; i++)
                adj[i] = new LinkedList<Integer>();
        }

        void addEdge(int v, int e) {
            adj[v].add(e);
            adj[e].add(v);
        }

        void BFS(int s, boolean[] visited, ArrayList<Integer> comp){
            LinkedList<Integer> queue = new LinkedList<Integer>();
            visited[s] = true;
            queue.add(s);
            int count = 0;
            while(!queue.isEmpty()){
                s = queue.poll();
                System.out.print(s + " ");
                count += 1;
                Iterator<Integer> iterator = adj[s].listIterator();
                while(iterator.hasNext()){
                    int n = iterator.next();
                    if(visited[n] != true){
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
            comp.add(count);
        }
    }

    public static void main(String[] args) {

        int n = 10;

//        0 2
//        1 8
//        1 4
//        2 8
//        2 6
//        3 5
//        6 9

        Graph graph = new Graph(n);
        graph.addEdge(0, 2);
        graph.addEdge(1, 8);
        graph.addEdge(1, 4);
        graph.addEdge(2, 8);
        graph.addEdge(2, 6);
        graph.addEdge(3, 5);
        graph.addEdge(6, 9);


        boolean visited[] = new boolean[n];
        ArrayList<Integer> comp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                graph.BFS(i, visited, comp);
                System.out.println();
            }
        }

        System.out.println(comp);

        int ans = 0;

        for (int i = 0; i < comp.size()-1; i++) {
            for (int j = i+1; j < comp.size(); j++) {
                ans += comp.get(i)*comp.get(j);
            }
        }

        System.out.println(ans);

    }

}
