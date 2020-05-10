class Solution {
    public int findJudge(int N, int[][] trust) {
        if(N==2 && trust.length==1)
            return trust[0][1];
        
        HashMap<Integer,ArrayList> map=new HashMap<>();
        
        for(int i=0;i<trust.length;i++)
        {
                if(map.containsKey(trust[i][0]))
                    {
                        ArrayList list=map.get(trust[i][0]);
                        list.add(trust[i][1]);
                        map.put(trust[i][0],list);
                    }
                else
                    {
                        ArrayList l=new ArrayList();
                        l.add(trust[i][1]);
                        map.put(trust[i][0],l);
                    }
         }
        
        if(map.size()==N)
            return -1;
        if(map.size()==N-1)
            {
                int prob_ans=0;
                for(int i=1;i<=N;i++)
                   {
                       if(!map.containsKey(i))
                           prob_ans=i;
                   }
                for(int i=1;i<=N;i++)
                   {
                       if(i!=prob_ans)
                          {
                              if(map.get(i).contains(prob_ans))
                                    continue;
                              else
                                    return -1;
                          }
                   }
                return prob_ans;
            }
        return -1;
        }
        
    }