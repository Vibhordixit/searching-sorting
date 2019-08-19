package functionandarray;

public class selectionsort {

	public static void main(String[] args) {

		int arr[]= {33,11,55,86,95,74,35,29,57};
		bubblesort(arr);
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void bubblesort(int arr[]) {
		
		for(int counter=0;counter<arr.length-1;counter++) {
		    int min=counter;
		    for(int j=counter+1;j<arr.length-1;j++) {
		    	if(arr[min]>arr[j]) {
		    		min=j;
		    	}
		    	int temp=arr[min];
		    	arr[min]=arr[counter];
		    	arr[counter]=temp;
		    }
		}
	}
}
