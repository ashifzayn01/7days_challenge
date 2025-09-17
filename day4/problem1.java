/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for( int  n : nums1){
            set1.add(n);
        }
       HashSet<Integer> set2 = new HashSet<>();
       for(int n : nums2){
        if(set1.contains(n)){
            set2.add(n);
        }
       }
       //convert hashset to int[]
       int[] result = new int[set2.size()];
       int i = 0;
       for(int n : set2){
        result[i] = n;
        i++;
       }
       return result;

         
    }
}
