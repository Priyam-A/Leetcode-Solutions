class Solution {
    public void helper(int[] candidates, int target, int start, int len, List<Integer> arr, List<List<Integer>> ans){
        if(target<0) return;
        if(target==0){
            ans.add(new ArrayList<Integer>(arr));
        }
        if(start>=len) return;
        for(int i=start; i<len; i++){
            if(i!=start && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) return;
            arr.add(candidates[i]);
            helper(candidates,target-candidates[i],i+1,len,arr,ans);
            arr.remove(arr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> arr = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        helper(candidates, target, 0, candidates.length, arr,ans);
        return ans;
    }
}