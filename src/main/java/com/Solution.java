package com;

/**
 * @author zhangwenhao
 * @date 2023-07-24 01:14
 */
public class Solution {
    public static void main(String[] args) {
        String str = "aabcbccacbbcbaaba";
        System.out.println(maxDictionaryOrder(str));
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return string字符串
     */
    public static String maxDictionaryOrder (String s) {
        // write code here
        // "aabcbccacbbcbaaba"
        // c
        // "cccccbba"
        if (s == null || "".equals(s)) {
            return null;
        }
        char[] chars = s.toCharArray();
        int leftIndex = 0;
        int rightIndex;
        int maxLeft = 0;
        int minRight = 0;
        int max = 0;
        for (leftIndex = 0; leftIndex < chars.length - 1; leftIndex++){
            for (rightIndex = leftIndex + 1; rightIndex < chars.length; rightIndex++) {
                int temp = chars[leftIndex] - chars[rightIndex];
                if (temp > max) {
                    max = temp;
                    maxLeft = leftIndex;
                    minRight = rightIndex;
                }
                if (temp == max) {
                    minRight = rightIndex;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(chars[maxLeft]);
        char tempChar = chars[maxLeft];
        System.out.println(maxLeft);
        System.out.println(minRight);
        for(int i=maxLeft + 1; i<minRight; i++) {
            System.out.println("char:" + chars[i]);
            System.out.println("tempChar:" + tempChar);
            if (chars[i] <= tempChar) {
                System.out.println("修改");
                tempChar = chars[i];
                sb.append(chars[i]);
            }
            System.out.println("-------------");
        }
        sb.append(chars[minRight]);
        return sb.toString();
    }

}
