/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* oddEvenList(struct ListNode* head){
    if(head==NULL || head->next==NULL || head->next->next==NULL)
        return head;
    
    struct ListNode *h1,*h2,*p1,*p2,*t1,*t2;
    h1=p1=t1=head;
    h2=p2=t2=head->next;
    
    while( t1!=NULL && t2!=NULL )
    {
        t1 = p2->next;
        p1->next = t1;
        if(t1!=NULL)
            t2 = t1->next;
        else
            t2=NULL;
        p2->next = t2;
        
        if(t1!=NULL)
            p1=t1;
        p2=t2;
    }
    p1->next = h2;
    return h1;
    
    
}