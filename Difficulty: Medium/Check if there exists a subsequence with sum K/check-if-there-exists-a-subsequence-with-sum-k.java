// User function Template for Java

class Solution {
    public static boolean check(int n, int[] arr,int i, int k,int sum) {
        if(sum == k) return true;
        if(sum > k || i>=n) return false;
        
      //  sum += arr[i];
        
        if(check(n,arr,i+1,k,sum+arr[i])) return true;
       // sum -= arr[i];
        if(check(n,arr,i+1,k,sum)) return true;
        return false;
    }
    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
    
        return check(N,arr,0,K,0);
    }
}
