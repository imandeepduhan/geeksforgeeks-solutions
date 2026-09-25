/*
Problem Name : Kth Smallest
Problem Link : https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1

My Approach : First, I create a PriorityQueue and add all the elements from index 0 to k - 1. Then, I start a loop with i = k and check if the
largest element in the heap is greater than the current element. If it's, I remove the largest element and add the current element to the heap.
Finally, I return the kth smallest element.

*/

class Solution {
    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < k; i++) heap.add(arr[i]);
        for(int i = k; i < arr.length; i++) {
            if(heap.peek() > arr[i]) {
                heap.poll();
                heap.offer(arr[i]);
            }
        }
        
        return heap.peek();
    }
}
