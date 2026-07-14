class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int i = 0; 
        int j = words.length -1 ; 
        while(i<j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        StringBuilder s1 = new StringBuilder();
        for( String w : words){
            s1.append(w);
            s1.append(" ");
        }
        return s1.toString().trim();
    }
}
        
