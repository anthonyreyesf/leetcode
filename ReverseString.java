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
public class ReverseString {
    public void reverseString(char[] s) {
        int pta = 0;
        int ptb = s.length - 1;
        
        while (pta < ptb){
            char temp = s[ptb];
            s[ptb--] = s[pta];
            s[pta++] = temp;
        }
    }
}
