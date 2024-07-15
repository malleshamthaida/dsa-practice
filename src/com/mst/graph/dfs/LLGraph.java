package com.mst.graph.dfs;

import java.util.*;

public class LLGraph {
    Map<Integer, List<Integer>> map = new HashMap<>();

    public void addNode(int node) {
        map.put(node, new ArrayList<>());
    }

    public void removeNode(int node) {
        map.remove(node);
        for (List<Integer> neighbor : map.values()) {
            neighbor.remove(node);
        }
    }

    public void addEdge(int source, int destination) {
        map.get(source).add(destination);
        map.get(destination).add(source);
    }

    public void removeEdge(int source,int destination) {
        map.get(source).remove(destination);
        map.get(destination).remove(source);
    }

    public void print(){
        for(Map.Entry entry: map.entrySet()){
            System.out.print(entry.getKey()+"-->");
            for(Integer node:(List<Integer>)entry.getValue()){
                System.out.print(node+ " ");
            }

            System.out.println();

        }
    }


    public List<Integer> dfsTraversal(int node){
        Set<Integer> visited=new HashSet();
        Stack<Integer> stack=new Stack<>();
        List<Integer> resultList=new ArrayList<>();
        stack.push(node);
        while(!stack.isEmpty()){
            int currentNode=stack.pop();
            visited.add(currentNode);
            resultList.add(currentNode);
            for(Integer connectedNode: map.get(currentNode)){
                if(!visited.contains(connectedNode)){
                    stack.push(connectedNode);
                }
            }
          }
        return resultList;
    }

    public void bfsTraversal(int node){
        Set<Integer> visited=new HashSet<>();
        Queue<Integer> queue=new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            int currentNode=queue.poll();
            visited.add(currentNode);
            System.out.println(currentNode);

            for(Integer connectedNode:map.get(currentNode)){
                if(!visited.contains(connectedNode)){
                    queue.add(connectedNode);
                }
            }

        }




    }

}
