/*You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // int count = 0;
        // for(int i = 0;i< stones.length();i++){
        //     char ch = stones.charAt(i);
        //     if(jewels.contains(String.valueOf(ch))){
        //         count++;
        //     }
        
        // }
        // return count;

        HashSet<Character> set = new HashSet<>();

        for(char ch : jewels.toCharArray()){
            set.add(ch);
        }
        int count = 0;
        for(char c : stones.toCharArray()){
           
            if(set.contains(c)){
                count++;
            }
      
        }
        return count;
        
        
    }
}
