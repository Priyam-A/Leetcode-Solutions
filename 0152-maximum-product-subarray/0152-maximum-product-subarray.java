class Solution {
    public int maxProduct(int[] nums) {
        long prefixProduct = 1;
        long suffixProduct = 1;
        long max = Long.MIN_VALUE;
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(nums[i]==0){
                prefixProduct=1;
                max = max>0? max:0;
            }else{
                prefixProduct = prefixProduct*nums[i];
                max = max>prefixProduct?max:prefixProduct;
            }
            if(nums[len-i-1]==0){
                suffixProduct = 1;
                max = max>0?max:0;
            }else{
                suffixProduct = suffixProduct*nums[len-i-1];
                max = max>suffixProduct?max:suffixProduct;
            }
        }
        return (int)max;
    }
}