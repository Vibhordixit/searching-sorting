package functionandarray;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int m=s.nextInt();
System.out.println(binary(m,arr));	
	}

	
	public static int binary(int m,int[] arr) {
		int a=0;
		int b=(arr.length)-1;
		while(a<=b) {
		int mid=(a+b)/2;
		if(arr[mid]<m) {
			a=mid+1;
		}else if(arr[mid]>m) {
			b=mid-1;
	}else {
		return mid;
	}
		}
return -1;

}
}
