package functionandarray;

public class linearsearch {

	public static void main(String[] args) {
		int array[]= {10,20,30,5,15};
		System.out.println(linearsearch(array,130));
		
	}
	public static int linearsearch(int arr[],int item) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}

}
