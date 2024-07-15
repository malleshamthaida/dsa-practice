package com.mst.array.prob;

public class PangramTest{

    public static void main(String[] args) {
       System.out.println(checkPangram("gabcdefhijklmnopqrstuvwxyz"));
    }

    public static boolean checkPangram(String s){
       // s="Mallesh";
        s=s.toLowerCase();//mallesh  A-56  a -30
        boolean letter[]=new boolean[26]; ///  0,1,2,3,4
        for(int i=0;i<s.length();i++){
            letter[s.charAt(i)-'a']=true;  //letter[0] =true

        }
        for(int i=0;i<=25;i++){
            if(!letter[i])
                return false;
        }
         return true;

    }
}
