/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* swapNodes(ListNode* head, int k) {
         if(!head) return NULL;
        ListNode* curr= head;
        ListNode* first= head;
        ListNode* last= head;
        int i=k;
        while(curr->next)
        {
            if(--i>0)
            {
                curr=curr->next;
                first=first->next;
            }
            else
            {
                curr=curr->next;
                last=last->next;
            }
        }
        int temp=first->val;
        first->val=last->val;
        last->val=temp;
        
        return head;
        
    }
};
