class Solution {
    public String reverseWords(String s) {
        // Remove leading and trailing spaces
        s = s.trim();

        // Reverse the whole string
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        StringBuilder ans = new StringBuilder();

        int i = 0;
        int n = sb.length();

        while (i < n) {

            StringBuilder word = new StringBuilder();

            while (i < n && sb.charAt(i) != ' ') {
                word.append(sb.charAt(i));
                i++;
            }

            word.reverse();

            if (word.length() > 0) {

                if (ans.length() > 0)
                    ans.append(" ");

                ans.append(word);
            }

            while (i < n && sb.charAt(i) == ' ')
                i++;
        }

        return ans.toString();
    }
}
        
