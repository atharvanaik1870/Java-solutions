#include<iostream>
using namespace std;
typedef struct node
{
    int data;
    int pr;//indicates priority of the data
    //lower values indicate higher priorities
    struct node *next;

}node;
node* newNode(int d, int p)
{
    node* temp = new node;
    temp->data = d;
    temp->pr = p;
    temp->next = NULL;

    return temp;
}
void push(node **head,int d,int p)
{
    cout<<"pushing node with priority = "<<p<<"\tand data = "<<d<<endl;
    node *start =(*head);
    node* temp = newNode(d, p);
    if ((*head)->pr > p) {

        // Insert New Node before head
        temp->next = *head;
        (*head) = temp;
    }
    else {

        // Traverse the list and find a
        // position to insert new node
        while (start->next != NULL &&
            start->next->pr < p) {
            start = start->next;
        }

        // Either at the ends of the list
        // or at required position
        temp->next = start->next;
        start->next = temp;
    }
}
int isEmpty(node** head)
{
    return (*head) == NULL;
}
void pop(node** head)
{

    node* temp = *head;
    (*head) = (*head)->next;
    cout<<"popping element "<<temp->data<<endl;
    delete temp;
}

int main()
{
    node* pq = newNode(4,3);
    push(&pq, 5, 2);
   // push(&pq, 6, 3);
    push(&pq, 7, 1);
    push(&pq, 10, 4);
    if(!isEmpty(&pq))
        pop(&pq);
    if(!isEmpty(&pq))
        pop(&pq);
    if(!isEmpty(&pq))
        pop(&pq);
    if(!isEmpty(&pq))
        pop(&pq);
    if(!isEmpty(&pq))
        pop(&pq);
    else
        cout<<"its empty!!\n";






return 0;
}

