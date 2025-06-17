class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        int max = 0;
        for(int i = arr.length - 1;i>=0;i--){
            if(arr[i] >= max){
                max = arr[i];
                result.add(max);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
