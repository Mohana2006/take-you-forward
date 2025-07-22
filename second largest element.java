import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]={8,8,7,6};
		System.out.println(secondLargestElement(a));
	}
    public static int secondLargestElement(int[] nums) {
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
        if(nums[i]>nums[j]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        }
        }
    }
    int x=0,c=0;
    int max=nums[nums.length-1];
    for(int i=nums.length-2;i>=0;i--){
        if(max>nums[i]){
            x=nums[i];
            c++;
            if(c==1){
                    return x;
            }

        }
    }
    return -1;
    }
}

