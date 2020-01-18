package com.chapter.three;

import java.util.Stack;

/*
    Implement a Queue class which implements a queue 
    using two stacks

    Explaination: the idea behind this data structure is to use one stack for adding items
    and the other for polling and peeking. Only one stack may have ALL the data at a time 
    because if you transfer values through thier pop and push operations one stack will 
    have the reversed order of elements. We take advantage of this since queue adds in the 
    back but removes from the front. When we take from the front we want the elements 
    to be in the order we inserted them. 

    size() - O(1)
    isEmpty() - O(1)
    clear() - O(N)
    conatins() - O(N)

    offer() - O(N)
    poll() - O(N)
    peek() - O(N)
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