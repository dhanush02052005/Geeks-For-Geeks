class Solution {
    int maxLength(int arr[]) {
        // code here
        int i = 0,max = 0,ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        //map.put(0,0);
        while(i < arr.length){
            
            ans+=arr[i];
            //System.out.println(ans);
            if(ans == 0) max = Math.max(i+1,max);
            if(map.containsKey(ans))
                max = Math.max(i - map.get(ans),max);
            map.putIfAbsent(ans,i);
            i++;
            
        }
        return max;
    }
}