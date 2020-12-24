// Problem Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        if(target>=letters[letters.length-1] || target < letters[0]){
            return letters[0];
        }
        
        int low =0, high = letters.length-1;
        
        while(low<high){
            int mid = (low + high)/2;
            
            if(letters[mid]>target){
                high = mid;
            }else low = mid+1;
            
            
        }
        
        return letters[low];
        
    }
}