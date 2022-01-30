package JavaPractice;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,1,2,3,4,5,6};
		System.out.println("Duplicate elements in array are");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}
		
	}
}
