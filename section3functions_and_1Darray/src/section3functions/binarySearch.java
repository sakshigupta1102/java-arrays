package section3functions;

import java.util.Scanner;

public class binarySearch {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scan.nextInt();
		
		int[] ans = takeinput(n);
		int item=scan.nextInt();
		System.out.println(binarysearch(ans,item));
	}

	public static int binarysearch(int[] ans,int item) {
		int l = 0;
		int h = ans.length - 1;
		for (int i = 0; i < ans.length; i++) {
			int mid = (l + h) / 2;
			if (ans[mid] < item) {
                   l=mid+1;
                   
			}
			else if(ans[mid] > item){
				h=mid-1;
			}else
				return mid;
			

		}
		return -1;

	}

	public static int[] takeinput(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		return a;

	}

}
