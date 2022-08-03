class MyQueue {

    Stack<Integer> queue;
    
    public MyQueue() {
            queue=new Stack<>();
    }
    
    public void push(int x) {
        Stack<Integer> stack2=new Stack<>();
        while(!queue.isEmpty())
        {
              stack2.push(queue.pop());
        }
        queue.push(x);
        
        while(!stack2.isEmpty())
        {
            queue.push(stack2.pop());
        }
    }
    
    public int pop() {
         return queue.pop();
    }
    
    public int peek() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
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