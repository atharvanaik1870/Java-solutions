/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    int countNodes(ListNode *head)
    {
        ListNode *curr= head;
        int count=0;
        while(curr!=NULL)
        {
            count++;
            curr=curr->next;
        }
        return count;
    }

    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        int l1=countNodes(headA);
        int l2=countNodes(headB);
        int d=abs(l1-l2);
        ListNode* curr1=headA;
        ListNode* curr2=headB;
        if(l1>l2)
        {
            for(int i=0;i<d;i++)
            {
                curr1=curr1->next;
            }
        }
        else if(l1<l2)
        {
            for(int i=0;i<d;i++)
            {
                curr2=curr2->next;
            }
        }
        while(curr1!=NULL || curr2!=NULL)
        {
            if(curr1==curr2)
                return curr1;
            curr1=curr1->next;
            curr2=curr2->next;
        }
        return NULL;
    }
};
