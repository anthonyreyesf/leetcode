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
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        
        for (int i = length - 1; i >= 0 ; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
                
            digits[i] = 0;
        }
        
        int[] new_digits = new int[length + 1];
        new_digits[0] = 1;
        return new_digits;
    }
}
