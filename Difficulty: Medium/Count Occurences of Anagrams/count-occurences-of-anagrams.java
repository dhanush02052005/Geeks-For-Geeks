// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int count = 0;
        HashMap<Character , Integer> map1 = new HashMap<Character , Integer>();
        HashMap<Character , Integer> map2 = new HashMap<Character , Integer>();
        for(int i=0;i<pat.length();i++){
            map1.put(pat.charAt(i),map1.getOrDefault(pat.charAt(i),0)+1);
        }
        int l = 0,r = 0;
        while(r < pat.length()){
            map2.put(txt.charAt(r),map2.getOrDefault(txt.charAt(r),0)+1);
            r++;
        }
        if(map1.equals(map2)){
                count++;
        }
        while(r < txt.length()){
            
            if(map2.get(txt.charAt(l)) > 1){
                map2.put(txt.charAt(l),map2.get(txt.charAt(l))-1);
            }
            else{
                map2.remove(txt.charAt(l));
            }
            l++;
            map2.put(txt.charAt(r),map2.getOrDefault(txt.charAt(r),0)+1);
            if(map1.equals(map2)){
                count++;
            }
            r++;
        }
        return count;
    }
}