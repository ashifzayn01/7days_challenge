/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false*/
class Solution {
    public boolean isAnagram(String s, String t) {
        int[]count = new int[26];
        if(s.length() != t.length()) return false;

        // HashMap<Character,Character> m1 = new HashMap<>();
        // HashMap<Character,Character> m2 = new HashMap<>();

        for(int i = 0; i < s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i = 0 ;i < 26;i++){
            if(count[i]!= 0) return false;
        }
        return true;

       
        
        
      
        
    }
}
