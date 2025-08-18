class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        int highest = arr[arr.length-1];
        res.add(arr[arr.length-1]);
        for(int i = arr.length-2;i >= 0;i--){
            //int val = arr[i];
            if(arr[i] >= highest){
                highest = arr[i];
                res.add(0,arr[i]);
            }
        }
        //res.add(arr[arr.length-1]);
        return res;
    }
}
