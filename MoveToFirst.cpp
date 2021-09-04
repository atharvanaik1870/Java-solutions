#include<iostream>
using namespace std;
class Node
{public:

    int data;
    Node *next;


};
void add(Node**head,int val)
{
    Node *newNode= new Node();
    newNode->data=val;
    newNode->next=(*head);
    (*head)=newNode;
}
void print(Node *node)
{
    while(node!=NULL)
    {
        cout<<node->data<<"-> ";
        node=node->next;
    }
    cout<<"null"<<endl;
}
void moveToFirst(Node **node)
{
    Node* secLast=NULL;
    Node* last=(*node);
    while(last->next!=NULL)
    {
        secLast=last;
        last=last->next;
    }
    secLast->next=NULL;
    last->next=(*node);
    (*node)=last;
}
int main()
{

    Node *head=NULL;
    add(&head,2);
    add(&head,3);
    add(&head,4);
    add(&head,5);
    print(head);
    cout<<"moving last element to 1st position\n";
    moveToFirst(&head);
    print(head);

}
