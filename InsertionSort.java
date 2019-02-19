
public class InsertionSort {
	
	public static void InsertionSort(double [] list){
		
		for (int i = 1; i < list.length; i++) {				// 1 is the minimum index as we are going to add to a sublist -
															// that is currently containing only at the moment the 1st index (0)
			
			double currentElement = list[i];								//Current element in the list we will be adding from
			int k;
			for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {		//In this case, we are going backwards where 'k = i - 1' is the final value in the current list
																			//k is either the first (or above) index in the current list
																			//And list[k] value is more than the list[i] value
			
				list[k + 1] = list[k];										//We insert list[k] value into list[k + 1]
			
			}																
		
			list[k + 1] = currentElement;									//We insert currentElement into list[k + 1]
		}
	}

	public static void main(String[] args) {								//Main method
		// TODO Auto-generated method stub

		double[] numList = {34, 4, 13, 8, 87};
		
		System.out.println("Before sorting:");
		for(double i : numList) {
			System.out.println(i + " ");
		}
		
		System.out.println("After sorting:");
		InsertionSort(numList);
		for (double i : numList) {
			System.out.println(i + " ");
		}
	}

}
