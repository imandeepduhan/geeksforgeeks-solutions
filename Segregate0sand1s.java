/*
Problem Name : Segregate 0s and 1s
Problem Link : https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1

My Approach : First, count the number of 0s and 1s in the array.
Then, fill all the 0s from the beginning and all the 1s from the end.

*/

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int zeroCount = 0;
        int oneCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
        }
        
        int i = 0;
        int j = arr.length - 1;
        while(zeroCount != 0 || oneCount != 0) {
            if(zeroCount != 0) {
                arr[i] = 0;
                i++;
                zeroCount--;
            } else {
                arr[j] = 1;
                j--;
                oneCount--;
            }
        }
    }
}
