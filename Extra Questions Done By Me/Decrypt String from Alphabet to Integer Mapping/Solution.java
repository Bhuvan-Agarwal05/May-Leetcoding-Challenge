class Solution {
    public String freqAlphabets(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray())
            st.push(c);
        
        StringBuffer sp = new StringBuffer("");
        while(!st.isEmpty())
        {
            char ch = st.peek();
            if(ch=='#')
            {
                st.pop();
                StringBuffer temp = new StringBuffer("");
                temp.append(st.pop());
                temp.append(st.pop());
                
                char t = temp.charAt(1);
                temp.setCharAt(1,temp.charAt(0));
                temp.setCharAt(0,t);
                
                int k = Integer.parseInt(temp.toString());
                t = (char)(k + 96);
                sp.append(t);
            }
            else
            {
                char t = (char)(Integer.parseInt(Character.toString(st.pop())) + 96);
                sp.append(t);
            }
        }
        
        StringBuffer output = new StringBuffer("");
        for(int i=sp.length()-1;i>=0;i--)
            output.append(sp.charAt(i));
        
        return output.toString();
    }
}