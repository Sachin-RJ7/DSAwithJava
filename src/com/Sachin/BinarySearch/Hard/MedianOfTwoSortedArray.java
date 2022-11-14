package com.Sachin.BinarySearch.Hard;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n3=n1+n2;
        int[] a3 =new int[n3];
        int i=0;
        int j=0;
        int k=0;

        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j])
            {
                a3[k]=nums1[i];
                k++;
                i++;
            }
            else
            {
                a3[k]=nums2[j];
                k++;
                j++;

            }
        }

        while(i<n1)
        {
            a3[k]=nums1[i];
            k++;
            i++;
        }

        while(j<n2)
        {
            a3[k]=nums2[j];
            k++;
            j++;
        }

        if(n3%2==1){
            return (double)a3[(n3-1)/2];
        }

        int idx=(n3-2)/2;
        int idx1=n3/2;
        float ans=(a3[idx]+a3[idx1]);
        return (double)ans/2;



    }
}
