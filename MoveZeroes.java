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
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int index = 0;
        
        for (int i = 0; i < n; i++){
            if (nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        
        while (index < n)
            nums[index++] = 0;
    }
}
