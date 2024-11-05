package session2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class graph {
	
	Map<Integer, List<Integer>> g;
	public graph() {
		// TODO Auto-generated constructor stub
		g=new HashMap<>();
	}  
	public void addEdge(int u, int v,boolean isBidir ) {
//		List<Integer> neighbourU = g.get(u);
//		if (neighbourU == null) {
//			List<Integer> nLU = new ArrayList<>();
//			nLU.add(v);
//		}else {
//			neighbourU.add(v);
//			g.put(u, neighbourU);
//		}
//		if (isBidir) {
//		List<Integer> neighbourV= g.get(v);
//		if (neighbourV == null) {
//			List<Integer> nLU = new ArrayList<>();
//			nLU.add(u);
//		}else {
//			neighbourV.add(u);
//			g.put(v, neighbourU);
//		}}
		// consize way 
		List<Integer> nLU = g.getOrDefault(u, new ArrayList<>());	
		nLU.add(v);
		g.put(u, nLU);
		
		if (isBidir) {
			List<Integer> nLV= g.getOrDefault(v, new ArrayList<>());
			nLV.add(u);
			g.put(v, nLV);
		}
		
	}
	// bfs 
	public void bfs(int src) {
		// TODO Auto-generated method stub
		Queue<Integer> bfs = new LinkedList<>();
		bfs.add(src);
		// use set coz they store unique calue
		Set<Integer> vis = new HashSet<>();
		vis.add(src);
		while (!bfs.isEmpty()) {
			int front = bfs.remove();
			System.out.println(front);
			//put unvisted nighbours of front in the bfs queue
			List<Integer> nL= g.getOrDefault(front,new ArrayList<>());
			for (int neighbour: nL) {
				if(!vis.contains(neighbour)){// if vis set dosent contain neighbour 
					bfs.add(neighbour);
					vis.add(neighbour);
				}
			}
			
		}
		

	}
	public void display() {
		 System.out.println(g);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		graph g1=new graph();
//		g1.addEdge(0, 1, true);
//		g1.addEdge(0, 2, true);
//		g1.addEdge(1, 3, true);
//		g1.addEdge(2, 3, true);
//		g1.addEdge(3, 4, true);
//		
//		g1.display();
		// for bfs
		graph g1=new graph();
		g1.addEdge(0, 1, true);
		g1.addEdge(0, 2, true);
		g1.addEdge(1, 3, true);
		
		
		g1.addEdge(2, 3, true);
		g1.addEdge(2, 4, true);
		g1.addEdge(4, 5, true);
		g1.display();
		g1.bfs(1);
      
	}

}
