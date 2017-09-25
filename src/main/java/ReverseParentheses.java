public class ReverseParentheses {

    private static int reverseInnermost(String s, int startPosition, StringBuilder res) {
        boolean flag = true;
        int currentPosition = startPosition;
        int closeBracketIndex = 0;
        while (flag) {
            closeBracketIndex = s.indexOf(')', currentPosition);
            if (closeBracketIndex == -1)
                closeBracketIndex = s.length();

            int openBracketIndex = s.indexOf('(', currentPosition);

            if (openBracketIndex == -1 || closeBracketIndex < openBracketIndex) {
                res.append(s.substring(currentPosition, closeBracketIndex));
                flag = false;
            } else {
                res.append(s.substring(currentPosition, openBracketIndex));
                StringBuilder inner = new StringBuilder(s.length());
                currentPosition = reverseInnermost(s, openBracketIndex+1, inner);
                res.append(new StringBuilder(inner).reverse());
            }
        }

        return closeBracketIndex + 1;
    }

    public static String reverseParentheses(String s) {
        StringBuilder res = new StringBuilder(s.length());
        reverseInnermost(s, 0, res);
        return res.toString();
    }
}
