class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int r = 0;
        while(r < k){
            if(arr[r] < 0){
                q.add(arr[r]);
            }
            r++;
        }
        if(!q.isEmpty()){
            result.add(q.peek());
        }
        else{
            result.add(0);
        }
        int l = 1;
        while(r < arr.length){
            if(!q.isEmpty() && arr[l-1] == q.peek()){
                q.poll();
            }
            if(arr[r] < 0) q.add(arr[r]);
            if(!q.isEmpty()){
                result.add(q.peek());
            }
            else result.add(0);
            l++;
            r++;
        }
        //System.out.println(q);
        return result;
    }
}