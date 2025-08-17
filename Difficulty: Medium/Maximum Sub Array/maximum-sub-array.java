// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> pres = new ArrayList<>();
        int max = 0,sum = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] < 0){
                if(sum > max){
                    res.add(new ArrayList(pres));
                    max = Math.max(max,sum);
                }
                sum=0;
                pres.clear();
            }
            else{
                pres.add(arr[i]);
                sum += arr[i];
            }
        }
        if(sum > max) res.add(new ArrayList<>(pres));
        if (res.size() == 0) {
            ArrayList<Integer> emptyListResult = new ArrayList<>();
            emptyListResult.add(-1);
            return emptyListResult;
        } else {
            return res.get(res.size() - 1);
        }
    }
}