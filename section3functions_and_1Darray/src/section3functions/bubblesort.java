package section3functions;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 88, 77, 55, 44, 11 };
		int i = 0;
		int flag=0;
		for (i = 0; i < (array.length - 1); i++) {
			for (int j = 0; j < (array.length - 1 - i); j++) {

				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
                    flag=1;
				}

			}
			if(flag==0){
				break;
			}

		}

		for (i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
