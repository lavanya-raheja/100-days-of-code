// PROBLEM: Given a string s, return true if it is a palindrome, or false otherwise.

 class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true; 
        }

        s = s.toLowerCase(); 
        int start = 0; 
        int end = s.length()-1; 
        while(start<=end) {
            if(!Character.isLetterOrDigit(s.charAt(start))) {
                start++; 
            } else if(!Character.isLetterOrDigit(s.charAt(end))) {
                end--; 
            } else {
                if(s.charAt(start)!=s.charAt(end)) {
                    return false; 
                }
                start++; 
                end--; 
            }
        }
        return true; 
    }
}

/* TWO POINTER approach used after ensuring theres no digits, spaces or symbols, and all letters are converted into lowercase */
