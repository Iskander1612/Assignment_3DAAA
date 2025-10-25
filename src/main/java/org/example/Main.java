package org.example;

import org.example.algorithms.KruskalAlgorithm;
import org.example.algorithms.PrimAlgorithm;
import org.example.graph.Graph;
import org.example.model.MSTResult;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge("A","B",4);
        g.addEdge("A","C",1);
        g.addEdge("B","C",2);
        g.addEdge("B","D",5);
        g.addEdge("C","D",3);

        PrimAlgorithm prim = new PrimAlgorithm();
        KruskalAlgorithm kruskal = new KruskalAlgorithm();

        MSTResult r1 = prim.run(g);
        MSTResult r2 = kruskal.run(g);

        System.out.println("Prim   cost=" + r1.totalCost + " ops=" + r1.operations + " ms=" + r1.timeMs);
        System.out.println("Kruskal cost=" + r2.totalCost + " ops=" + r2.operations + " ms=" + r2.timeMs);
        System.out.println("Prim MST: " + r1.mstEdges);
        System.out.println("Kruskal MST: " + r2.mstEdges);
    }
}
