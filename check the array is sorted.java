import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]={1,2,3,4,5};
		System.out.println(isSorted(a));
	}
    public static boolean isSorted(int[] nums) {
        //your code goes here
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                c++;
            }
            else{
                break;
            }
        }
        if(c==nums.length-1){
            return true;
        }
        else{
            return false;
        }
    }
}
