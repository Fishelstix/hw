import java.util.*;
public class Driver{
    public static int[] frontPiece(int[] nums) {
	if (nums.length < 2) return nums;
	int[] newArray = Arrays.copyOfRange(nums, 0, 2);
	return newArray;
    }
    public static int sum13(int[] nums) {
	int x = nums.length;
	int i = 0;
	int s = 0;
	while(i<x){
	    if (nums[i] == 13) i++;
	    else s+=nums[i];
	    i++;
	}
	return s;
    }
    public static void main(String[] args){
	int[] a = {1,2,3};
	System.out.println(frontPiece(a));
	int[] b = {13, 1, 2, 13, 2, 1, 13};
	System.out.println(sum13(b));
    }
}
