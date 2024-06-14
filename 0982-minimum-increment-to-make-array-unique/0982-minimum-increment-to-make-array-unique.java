class Solution {
    public int minIncrementForUnique(int[] nums) {
        int len = nums.length;
        if(len<=1){
            return 0;
        }
        int[] copy = nums.clone();
        Arrays.sort(copy);
        int count=0;
        for(int i=1;i<len; i++){
            if(copy[i]<=copy[i-1]){
                int temp = copy[i];
                copy[i]=copy[i-1]+1;
                count+=copy[i]-temp;
            }
        }
        return count;
    }
}
// 1 1 2 2 3 7
// 1 2 2 2 3 7
// 1 2 3 2 3 7
// 1 2 3 3 3 7
// 1 2 3 4 3 7
// 1 2 3 4 5 7