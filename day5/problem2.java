/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2*/

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        int n = nums.length;
        for(int key: map.keySet()){
            if(map.get(key)> n /2){
                return key;
            }

        }
        return -1;
       
        
        
    }
}
