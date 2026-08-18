class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        done(n,0,0,"",list);
        return list;
    }
    public void done(int n, int left, int right, String s, List<String> list){

        if(s.length() == 2 * n){
            list.add(s);
            return;
        }
        if(left < n){
            done(n,left+1,right,s+"(",list);
        }
        if(right<left){
            done(n,left,right+1,s+")",list);
        }

    }
}