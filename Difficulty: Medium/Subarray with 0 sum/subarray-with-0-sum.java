class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        int sum=0,r = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum == 0) return true;
            if(map.containsKey(sum)) return true;
            map.put(sum,i);
        }
        return false;
    }
}