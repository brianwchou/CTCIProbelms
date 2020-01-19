package com.chapter.one;

/*
    1.3 URLify: Write a method to replace all spaces in a string with '%20'. You 
    may assume that the string has suffient space and the true length is given and
    that you are given the "true length of the string". (Note if implmenting this 
    in Java, please use a character array so that you can perform this operation in
    place.
    EXAMPLE
    Input:  "Mr John Smith    ", 13
    Output: "Mr%20John%20Smith"

*/
public class URLify {
    /*
        Assume that theres enough space within the char array
        to solve the problem

        runtime is O(N) since we only run through the array once
    */ 
    public static void createAsURL(char[] string) {
        // start from the back and sift the words to the back while inserting
        // %20 where needed

        // starting from the back find the first instance of nonwhitespace
        // if there isnt any whietspace in the back we cannot run this algorithm

        int cursor = string.length - 1;
        while (cursor > -1 && Character.isWhitespace(string[cursor])) {
            cursor--;
        }

        // if there isnt any whitespace we would ideally throw an exception here

        // now that we have the location of non whitespace
        // we can proceed with shifting values

        int lastInsert = string.length - 1;
        while (cursor > -1 && lastInsert > -1) {
            if (Character.isWhitespace(string[cursor])) {
                string[lastInsert--] = '0';
                string[lastInsert--] = '2';
                string[lastInsert--] = '%';
            } else { // move character to lastInsert
                string[lastInsert] = string[cursor];
                lastInsert--;
            }
            cursor--;
        }
    }  
}