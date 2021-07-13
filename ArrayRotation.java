public class ArrayRotation {
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5};

System.out.println("Array Before Shift");

for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i] +" ");
}

int no_of_shifts=3;

for(int i=0;i<no_of_shifts;i++) {
	int lastelement= arr [arr.length-1];
	for(int j=arr.length-1;j>0;j--) {   
	
	arr[j]=arr[j-1];	
}
  arr[0]=lastelement;

}
System.out.println("After shift");
for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i] +" ");
}
}
}