/*
Problem description:

Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
*/

import java.lang.*;
class toLowerCase {
    public String toLowerCase(String s) {
        
        char[] c = s.toCharArray();
        
        for(int i = 0; i < s.length(); i++){
            c[i] = Character.toLowerCase(c[i]);
        }
        return String.valueOf(c);
    }
}