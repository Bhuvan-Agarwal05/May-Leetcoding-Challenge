class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int low=0;
        int high = ch.length-1;
        
        while(low<high)
        {
            if( (ch[low]=='a' || ch[low]=='e' || ch[low]=='i' || ch[low]=='o' || ch[low]=='u' || ch[low]=='A' || ch[low]=='E' || ch[low]=='I' || ch[low]=='O' || ch[low]=='U') && (ch[high]=='a' || ch[high]=='e' || ch[high]=='i' || ch[high]=='o' || ch[high]=='u' || ch[high]=='A' || ch[high]=='E' || ch[high]=='I' || ch[high]=='O' || ch[high]=='U' ) )
            {
                char cha = ch[low];
                ch[low] = ch[high];
                ch[high] = cha;
                low++;
                high--;
            }
            else if( ch[low]=='a' || ch[low]=='e' || ch[low]=='i' || ch[low]=='o' || ch[low]=='u' || ch[low]=='A' || ch[low]=='E' || ch[low]=='I' || ch[low]=='O' || ch[low]=='U')
                high--;
            else
                low++;
        }
        
        return new String(ch);
    }
}