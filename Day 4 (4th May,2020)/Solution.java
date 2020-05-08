class Solution {
    public int findComplement(int num) {
        if(num==0)
            return 1;
        else if(num==1)
            return 0;
        else
        {
            String str=Integer.toBinaryString(num);
            StringBuffer s=new StringBuffer();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='0')
                    s.append('1');
                else
                    s.append('0');
                }
            
            return Integer.parseInt(s.toString(),2);
        }
    }
}