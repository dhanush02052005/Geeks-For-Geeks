// User function Template for Java

class Solution {
    
    public static void rec(String s,int i,StringBuilder res) {
        if(i < 0) return ;
        res.append(s.charAt(i));
        rec(s ,i - 1,res);
        //
    }
    public static String reverseString(String s) {
        // code here
        StringBuilder res = new StringBuilder();
        rec(s,s.length() - 1,res);
        return res.toString(); 
    }
}