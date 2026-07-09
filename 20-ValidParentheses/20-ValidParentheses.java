// Last updated: 7/9/2026, 10:08:05 AM
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') st.push(')');
            else if (c == '{') st.push('}');
            else if (c == '[') st.push(']');
            else {
                if (st.isEmpty() || st.pop() != c) return false;
            }
        }

        return st.isEmpty();
    }
}