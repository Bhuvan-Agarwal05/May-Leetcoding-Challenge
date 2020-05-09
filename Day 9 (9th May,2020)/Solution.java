
// This is Our Brute Force Approach
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num%10==2 || num%10==3 || num%10==7 || num%10==8)   // We Know numbers ending with either 2,3,7,8 cannot be a perfect square...
            return false;
        
        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0 && i*i==num)
                return true;
        }
        return false;
    }
}  

