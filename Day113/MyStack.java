package Day113;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<Integer>();
        static  Queue<Integer> q2 = new LinkedList<Integer>();
        static int currSize;
        static void push(int x) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
                //q1.remove();
            }
            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }
        static void pop() {
            if (q1.isEmpty()) {
                return;
            }
            q1.remove();
        }
        static int top() {
            if (q1.isEmpty()) {
                return -1;
            }
            return q1.peek();
        }
        static int size() {
            return q1.size();
        }

        public static void main(String[] args) {
            Stack s = new Stack();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.push(6);
            s.push(7);
            s.push(8);
            System.out.println("current size: " + s.size());
            System.out.println(s.top());
            s.pop();
            System.out.println(s.top());
            s.pop();
            System.out.println(s.top());
            System.out.println("current size: " + s.size());
        }
    }
}