1. Middle of the Linked List(LeetCode 876)...

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

-----------------------------------------------------------------------------------------

2. Linked List Cycle(LeetCode 141)...

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}

------------------------------------------------------------------------------------------

3. Delete Node in a Linked List(LeetCode 237)...

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

------------------------------------------------------------------------------------------

4. Reverse Linked List(LeetCode 206)...

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, next;
        while(curr != null)
        {
        next = curr.next;
        curr.next = prev;

        prev = curr;
        curr = next;
        }
        
        return prev;
    }
}

------------------------------------------------------------------------------------------

5. Palindrome Linked List(LeetCode 234)...

------------------------------------------------------------------------------------------

6. Valid Parentheses(LeetCode 20)...

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[')
            st.push(ch);

            else{
                if(st.isEmpty())
                return false;

                char top = st.pop();

                if(ch == ')' && top != '(')
                return false;

                else if(ch == '}' && top != '{')
                return false;

                else if(ch == ']' && top != '[')
                return false;
            }
        }
        return st.isEmpty();
    }
}

------------------------------------------------------------------------------------------
