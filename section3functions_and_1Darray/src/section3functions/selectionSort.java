package section3functions;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 88, 77, 66, 55, 44 };
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length-1; i++) {

			for (int j = i; j < (a.length-1); j++) {
				if (a[j] < min) {
					min = a[j];
                    a[i]=min;
				}

			}
		}
		
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
		
		

	}

}
