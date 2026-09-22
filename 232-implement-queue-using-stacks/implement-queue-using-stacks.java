class MyQueue {
    Stack<Integer> first = new Stack<>();
    Stack<Integer> second = new Stack<>();
    public MyQueue() {
    }
    
    public void push(int x) {
        first.push(x);
    }

    //ye wala push efficient queue hai;
    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());

        }
        int popped = second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return popped;
    }
    
    public int peek() {
            while(!first.isEmpty()){
            second.push(first.pop());

        }
        int peeked = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */