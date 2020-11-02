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
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    sum[0] = i;
                    sum[1] = j;
                    
                    return sum;
                }
            }
        }
        
        return sum;
    }
}
