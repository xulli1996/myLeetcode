import java.util.Stack;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {

    private Stack<Integer> mainStack;
    private Stack<Integer> subStack;
    /** initialize your data structure here. */
    public MinStack() {
        //主栈
        mainStack = new Stack<>();
        //辅助栈
        subStack = new Stack<>();
    }
    //2个栈不同步操作
    public void push(int x) {
        if (subStack.isEmpty() || x <= subStack.peek()) {
            subStack.push(x);
        }
        mainStack.push(x);
    }
    
    public void pop() {
        //因为使用的是包装类Integer，所以必须用equals方法，不能使用 == 。
        if (subStack.peek().equals(mainStack.peek())) {
            subStack.pop();
        }
        mainStack.pop();  
    }
    
    public int top() {
        return mainStack.peek();  
    }
    
    public int getMin() {
        return subStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

