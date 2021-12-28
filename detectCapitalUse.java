/*
Problem description: 

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
*/


class detectCapitalUse {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase()))
            return true;
        
        if(!(Character.isUpperCase(word.charAt(0)))){  
            return word.equals(word.toLowerCase());
        }
            else{
                String sub = word.substring(1);
                return sub.equals(sub.toLowerCase());
            }
    }
}