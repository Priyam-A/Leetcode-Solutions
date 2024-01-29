class Solution {
public:
    int reverse(int x) {
        int sign =1;
        if(x==INT_MIN){
            return 0;
        }
        if (x<0){
            x=-x;
            sign=-1;
        }
        int reverse=0;
        while(x>0){
            if (reverse>INT_MAX/10){
                return 0;
            }
            reverse = reverse*10 + x%10;
            x/=10;
        }
        return sign * reverse;       
    }
};