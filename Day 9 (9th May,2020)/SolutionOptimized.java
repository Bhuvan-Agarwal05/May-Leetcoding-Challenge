class Solution {
    public boolean isPerfectSquare(int num) {
        if(num%10==2 || num%10==3 || num%10==7 || num%10==8)
            return false;
        
       if(num<1)
           return false;
        if(num==1)
            return true;
        
        long left = 1;
        long right = num;
        long mid;
        while(left<=right)
        {
             mid = left + (right-left)/2;
            if(mid*mid==num)
                return true;
            else if(mid*mid > num)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
}