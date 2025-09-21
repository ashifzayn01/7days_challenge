/*Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

*/

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0 , right = 0 , maxLength = 0;

        while(right < s.length()){
            char ch = s.charAt(right);


            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLength = Math.max(maxLength,right-left + 1);
            right++;
        }
        return maxLength;

        
    }
}
