class Solution {
    public void rec(int n,String str,ArrayList<String> res){
        if(str.length() == n){
            res.add(str);
            return;
        }
        rec(n,str + "0",res);
        rec(n,str + "1",res);
    }
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        rec(n,"",res);
        return res;
    }
}
