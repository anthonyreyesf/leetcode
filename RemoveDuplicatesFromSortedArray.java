/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author anthonyreyes
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }
}
