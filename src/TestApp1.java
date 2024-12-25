public class TestApp1 {
/*
Input: n = 2
Output: 2

Input: n = 4
Output: 5



*/

    public static void main(String[] args) {
        System.out.println(findDistinctWaysToTop(10));
    }

    public static int findDistinctWaysToTop(int steps){
        int[] distinctWays=new int[steps];
        distinctWays[0]=1;
        distinctWays[1]=2;
        for(int i=2;i<steps;i++){
            distinctWays[i]=distinctWays[i-1] +distinctWays[i-2];
        }
        return distinctWays[steps-1];
    }
}
