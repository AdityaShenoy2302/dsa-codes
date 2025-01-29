// The next greater element of some element x in an array is the first greater element that is to the right of x in the sam array
/*
Algorithm:
1) while(!s.empty && stack[top] <= arr[i]) 
    s.pop
2) if stack.empty
    nextGreater = -1
   else
    nextGreater = s.peek
3) s.push(ele)
*/
// O(n)
// next greater left => just change loop from start to end
// next smaller right => change sign in while to >=
// next smaller left => change loop and condition

import java.util.*;

public class nextGreaterEle {
    public static void main(String args[]) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // 1. while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2. if-else
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }

            // 3. push
            s.push(i);
        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}
