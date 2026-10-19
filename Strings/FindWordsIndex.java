package Strings;

import java.util.ArrayList;
import java.util.List;

/*
Approach

    Initialize an empty ArrayList to store the indices of words containing the given character x.
    Iterate through each word in the words array using a for loop.
    Convert each word into a character array using toCharArray().
    Check each character to see if it matches x.
    If a match is found, add the current word index to the list and use break to avoid adding duplicate indices.
    Return the list containing all matching indices.

Complexity Analysis

    Time Complexity: O(N × M) — where N is the number of words and M is the maximum length of a word.
    Space Complexity: O(K) — for storing the indices of K matching words in the result list. The toCharArray() method also uses temporary space proportional to the length of the current word.
 */
public class FindWordsIndex {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<n;i++){
            String w=words[i];
            for(char ch : w.toCharArray()){
                if(ch == x){
                    lst.add(i);
                    break;
                }
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        System.out.println(findWordsContaining(words,x));
    }
}