#include<iostream>
using namespace std;
class Node
{
public:
    int data;
    Node* next;
};
void add(Node** head,int val)
{
    Node* newNode= new Node();
    newNode->data=val;
    newNode->next=(*head);
    (*head)=newNode;

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
/*Node *reverseNode(Node** node)
{
    Node *prev=NULL;
    Node *curr=(*node);
    Node *next=NULL;
    while(curr!=NULL)
    {
        next=curr->next;
        curr->next=prev;

        prev=curr;
        curr=next;
    }
    return (prev);
}*/
bool isCircular(Node *node)
{
    Node * temp=node;
    while(temp!=NULL)
    {
        temp=temp->next;
    }
    if(temp==node)
    {
        cout<<"circular..";
        return true;
    }
    else
    {   cout<<"not circular..  ";
        return false;
    }

}
int main()
{
    Node *head= NULL;
    add(&head,1);
    add(&head,1);
    add(&head,3);
    add(&head,5);
    add(&head,5);

    // print(head);

    bool chk=isCircular(head);
    cout<<chk;


}
