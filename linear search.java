
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		System.out.println(Linear_search(a,t));
	}
    public static int Linear_search(int[] nums,int t) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t){
                return i;
            }
        }
        return -1;
    }
    
}


