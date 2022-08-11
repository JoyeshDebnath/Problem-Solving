class MinStack {
  Stack<Integer> mainSt;
  Stack<Integer> auxSt;
    public MinStack() {
        mainSt=new Stack<>();
        auxSt=new Stack<>();
    }
    
    public void push(int val) {
        mainSt.push(val);
        
        if(auxSt.isEmpty() || auxSt.peek()>=val)
                auxSt.push(val);     
    }
    
    public void pop() {
         int popped=mainSt.pop();
        if(auxSt.peek()==popped)
              auxSt.pop();
        
    }
    
    public int top() {
         return mainSt.isEmpty()?0:mainSt.peek();
    }
    
    public int getMin() {
        return auxSt.isEmpty()?0:auxSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */