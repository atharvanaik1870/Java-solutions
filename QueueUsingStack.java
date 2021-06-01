class MyQueue {

Stack <Integer> st;
Stack <Integer> temp;

public MyQueue() {
    st = new Stack<>();
    temp = new Stack<>();
}

/** Push element x to the back of queue. */
public void push(int x) {
    st.push(x);
}

/** Removes the element from in front of queue and returns that element. */
public int pop() {
    
    while(st.size() > 1) {
        temp.push(st.pop());
    }
    
    int rv = st.pop();
    
    while(temp.size() > 0) {
        st.push(temp.pop());
    }
    
    return rv;
}

/** Get the front element. */
public int peek() {
    while(st.size() > 1) {
        temp.push(st.pop());
    }
    
    int rv = st.pop();
    temp.push(rv);
    
    while(temp.size() > 0) {
        st.push(temp.pop());
    }
    
    return rv;
}

/** Returns whether the queue is empty. */
public boolean empty() {
    return st.size() == 0;
}
}
