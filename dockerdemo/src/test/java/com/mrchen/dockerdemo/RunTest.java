package com.mrchen.dockerdemo;

public class RunTest {
    public static void main(String[] args) {
        int[] a= {1,2,3,5,7,9};

        System.out.println(test(a,3));
    }

   static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // 注意

        while(left <= right) { // 注意
            int mid = (right + left) / 2;
            if(nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1; // 注意
            else if (nums[mid] > target)
                right = mid - 1; // 注意
        }
        return -1;
    }

    static int test(int[] arr , int tar){
        int left = 0 ;
        int right =arr.length -1 ;
        while (left <= right){
            //中位数
            int mid = (left + right) / 2 ;
            if (arr[mid] == tar){
                return mid ;
            }else if(arr[mid] < tar ){
                left = mid + 1 ;
            }else if(arr[mid] > tar){
                right = mid - 1 ;
            }
        }
return  -1 ;
    }

}
