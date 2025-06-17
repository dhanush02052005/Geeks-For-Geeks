class Solution {
    public boolean helper(int i , int n , int[] arr){
        if(i==n-1) return true;
        if(arr[i] <= arr[i+1]) return helper(i+1,arr.length,arr);
        else return false;
    }
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        return helper(0,arr.length,arr);
    }
}