// PROBLEM: Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

class Solution{
    public String removeConsecutiveCharacter(String S){
        String str="";
        str+=S.charAt(0);
        for(int i=1; i<S.length(); i++) {
            if(S.charAt(i)!=S.charAt(i-1)) {
                str+=S.charAt(i); 
            }
        }
        return str; 
    }
}
