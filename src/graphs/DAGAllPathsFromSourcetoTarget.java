package graphs;

import java.util.ArrayList;
import java.util.List;

public class DAGAllPathsFromSourcetoTarget {

	static List<List<Integer>> ans = new ArrayList<>();

	public static void main(String[] args) {
		int[][] graph = { {} };
		
		allPathsSourceTarget(graph);
		
		System.out.println(ans);
	}

	public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {

		for(int ele:graph[0]) {
			List<Integer> list=new ArrayList<>();
			list.add(0);
			list.add(ele);
			aux(0, ele, graph, list);
		}
		return ans;
	}

	public static void aux(int s,int d,int[][] graph,List<Integer> list) {

		if(graph[d].length==0) {
			ans.add(list);
		}else {
			
			for(int ele:graph[d]) {
				List<Integer> list1=new ArrayList<>();
				list1.addAll(list);
				list1.add(ele);
				aux(d, ele, graph, list1);
			}
		}
	}
}
