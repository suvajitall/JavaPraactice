package MyPackage;

public class OrderWiseNumber {
	public static void main(String args[]) {
		int[] arr = {5,3,4,5,2,0,10,50};
		int len = arr.length;
		int temp=arr[0];
		/****** This code is for ascending order only. For descending order 
		 * just change  the ">" to "<" at the line number 12****/
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		
		for(int k=0;k<len;k++) {
			System.out.println(arr[k]);
		}
	}
}
