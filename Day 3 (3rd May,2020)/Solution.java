class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        LinkedList list=new LinkedList();
        for(int i=0;i<magazine.length();i++)
            list.add(magazine.charAt(i));
        int flag=0;
        for(int i=0;i<ransomNote.length();i++)
            {
            if(list.contains(ransomNote.charAt(i)))
               list.remove(new Character(ransomNote.charAt(i)));
               else
               {
                   flag=1;
                   break;
                   }
               }
               if(flag==1)
               return false;
               else
               return true;
    }
}