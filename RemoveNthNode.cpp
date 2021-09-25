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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        stack<ListNode*> s;
        ListNode * curr= head;
        int num=0;
        while(curr)
        {
            s.push(curr);
            curr=curr->next;
            num++;
        }
        if(num==n)
        {
            head=head->next;
            return head;
            
        }
        int i=0;
        while(i<n)
        {
            s.pop();
            i++;
        }
        curr=s.top();
        ListNode * temp = curr->next;
        curr->next=curr->next->next;
        delete (temp);
        return head;
    }
};
/*
stack s;
        ListNode* temp = head;
        int num = 0;
        while(temp){
            s.push(temp);
            temp = temp->next;
            num++;
        }
        if(num == n){
            head = head->next;
            return head;
        }
        int i = 0;
        while(i< n){
            s.pop();
            i++;
        }
        temp = s.top();
        ListNode *temp2 = temp->next;
        temp->next = temp->next->next;
        delete(temp2);
        
        return head;
*/
