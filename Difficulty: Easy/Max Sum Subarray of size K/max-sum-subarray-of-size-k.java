// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int l = 0, r = 0;
        int rsum = 0 , max = 0;
        while(r < k){
            //System.out.print(arr[r]);
            rsum += arr[r];
            r++;
        }
        //System.out.println(r);
        max = rsum;
        while(r < arr.length){
            //System.out.print(arr[r]);
            rsum -= arr[l];
            rsum += arr[r];
            max = Math.max(max,rsum);
            l++;
            r++;
            
        }
        return max;
    }
}