// PROBLEM: Given two strings s and t, return true if t is an anagram of s, and false otherwise.

class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase(); 
        t=t.toLowerCase(); 
        int alphabet[] = new int[26]; 

        for(int i=0; i<s.length(); i++) {
            alphabet[s.charAt(i)-'a']++; 
        }

        for(int i=0; i<t.length(); i++) {
            alphabet[t.charAt(i)-'a']--; 
        }

        for(int count: alphabet) {
            if(count!=0) {
                return false; 
            }
        }
        return true;
    } 
}
