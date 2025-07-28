
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int l = 0 , r = 0;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(r < arr.length){
            sum += arr[r];
            while(sum > target && l < r){
                sum -= arr[l];
                l++;
            }
            if(sum == target){
                list.add(l+1);
                list.add(r+1);
                return list;
            }
            
            r++;
        }
        list.add(-1);
        return list;
    }
}
