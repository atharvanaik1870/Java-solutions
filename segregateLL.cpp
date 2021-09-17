#include<iostream>
using namespace std;
class Node
{
public:
    int data;
    Node* next;

};
void add(Node ** head,int val)
{
    Node * newNode= new Node();
    newNode->data=val;
    newNode->next=(*head);
    (*head)=newNode;

}
void segregate(Node ** head)
{
    Node* evenStart=NULL;
    Node* evenEnd=NULL;
    Node* oddStart=NULL;
    Node* oddEnd=NULL;
    Node* curr=(*head);
    while(curr!=NULL)
    {
        int value=curr->data;
        if(value %2 ==0)
        {
            if(evenStart==NULL)
            {
                evenStart=curr;
                evenEnd=evenStart;
            }
            else
            {
                evenEnd->next=curr;
                evenEnd=evenEnd->next;
            }
        }
        else
        {
            if(oddStart == NULL)
            {
                oddStart = curr;
                oddEnd = oddStart;
            }
            else
            {
                oddEnd -> next = curr;
                oddEnd = oddEnd -> next;
            }
        }
        curr=curr->next;
    }
    if(evenStart==NULL || oddStart==NULL)
    {
        return;
    }
    evenEnd->next=oddStart;
    oddEnd->next=NULL;
    *head=evenStart;


}
void print(Node * node)
{
    while(node!=NULL)
    {
        cout<<node->data<<"->";
        node=node->next;
    }
    cout<<"null";
}
int main()
{
    Node * head= NULL;
    add(&head,1);
    add(&head,2);
    add(&head,3);
    add(&head,4);
    add(&head,5);
    add(&head,6);
    cout<<"Before segregation list is : \n";
    print(head);
    segregate(&head);
    cout<<"\nafter segregation list is : \n";
    print(head);
}
