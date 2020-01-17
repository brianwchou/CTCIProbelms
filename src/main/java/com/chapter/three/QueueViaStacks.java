package com.chapter.three;

import java.util.Stack;

/*
    Implement a Queue class which implements a queue 
    using two stacks
*/
public class QueueViaStacks {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public QueueViaStacks() {}

    public int size() {
        return stack1.size() + stack2.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean contains(Object o) {
        return stack1.contains(o) || stack2.contains(o);
    }

    public void clear() {
        stack1.clear();
        stack2.clear();
    }
    /*
        first ones throw exception
        second returns a special value
        
        INSERT add(e) offer(e)
        DELETE remove() poll()
        PEEK   element() peek()
    */
    // ADD ELEMENT TO THE BACK OF THE
    public boolean offer(Integer e) {
        if (stack1.isEmpty()) {
            while(!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        stack1.push(e);
        return true;
    }

    // REMOVE AND RETURN THE TOP ELEMENT
    public Integer poll() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // PEAK AT THE TOP ELEMENT
    public Integer peek() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.firstElement();
    }
}