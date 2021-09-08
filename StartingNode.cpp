void detectloop(Node * node)
{
    Node* fast= node->next->next;
    Node* slow=node->next;
    while(fast!=NULL && fast->next!=NULL)
    {
        if(fast==slow){
        break;
        }
        fast=fast->next->next;
        slow=slow->next;


    }
    if(slow!=fast)
    {
      cout<<"no loop ///  ";
    }
    else
    {

    slow=node;
    while(slow!=fast)
    {
        slow=slow->next;
        fast=fast->next;
    }
    cout<<"starting point of loop is == "<<slow->data;
    }
}
