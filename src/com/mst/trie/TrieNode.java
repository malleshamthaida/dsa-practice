package com.mst.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    Map<Character,TrieNode> map;
    boolean eow;

    public TrieNode(){
        map=new HashMap<>();
        this.eow=false;
    }

    public void insert(TrieNode node,String word){
        TrieNode temp=node;

        for(int i=0;i<word.length();i++){
            Character ch=word.charAt(i);
            if(temp.map.containsKey(ch)){
                temp=temp.map.get(ch);
            }else {
                TrieNode nn=new TrieNode();
                temp.map.put(ch,nn);
                temp=nn;
            }
        }
        temp.eow=true;


    }

    public boolean search(TrieNode node,String word) {
        TrieNode temp = node;
        for (int i = 0; i < word.length(); i++) {
            Character ch = word.charAt(i);
            if (temp.map.containsKey(ch)) {
                temp=temp.map.get(ch);
            } else {
                return false;
            }
        }
        return temp.eow;
    }

    public static void main(String[] args) {
        String[] arr={"drink","draw","drone","cat","cattle","car","mango","man"};

        TrieNode node=new TrieNode();
        for(String s:arr){
            node.insert(node,s);
        }

        System.out.println(node.search(node,"cat"));


    }




}
