// User function Template for Java

class Solution {
    public String removeUtil(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            int flag = 0;
            while(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){
                flag = 1;
                i++;
            }
            if(flag==0){
                sb.append(s.charAt(i));
            }
        }
        if(sb.length() == s.length()) return sb.toString();
        //System.out.println(sb);
        return removeUtil(sb.toString());
    }
}