package com.coding.java.datastructure.Array;

/**
 *
 * 1) Initialize the first as 0(i.e, index of arr[0] element
 * 2) Start traversing the array from array[1],
 *    a) If the current element in array say arr[i] is greater
 *       than first. Then update first and second as,
 *       second = first
 *       first = arr[i]
 *    b) If the current element is in between first and second,
 *       then update second to store the value of current variable as
 *       second = arr[i]
 * 3) Return the value stored in second.
 */
public class SecondLargestElement_3 {

    /** Efficient solution
     * Complexity Analysis:
     *
     * Time Complexity: O(n): Only one traversal of the array is needed.
     *
     * Auxiliary space: O(1): As no extra space is required.
     */
    public static void print2largest(int arr[],int arr_size)
    {
        int i, first, second;

        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is greater than
            first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }

            /* If arr[i] is in between first and
               second then update second  */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }

        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"
                    + " element\n");
        else
            System.out.print("The second largest element"
                    + " is " + second);
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
    }
}
