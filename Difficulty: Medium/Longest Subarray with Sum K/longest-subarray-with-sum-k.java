// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0, max = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum == k){
                max = Math.max(max,i+1);
            }
            int rem = sum - k;
            if(map.containsKey(rem)){
                int size = map.get(rem);
                max = Math.max(max,i-size);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max;
    }
}
