package developer01;
import java.util.*;
public class ArrayListTest {
	
	public static void main(String args[]) {
		ArrayList <Integer> num = new ArrayList<Integer>();
	for(int i=0;i<10;i++) {
	
		num.add(i*5);
	}
	Iterator<Integer> it = num.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	int max = num.get(0);
	int min = num.get(0);
	for(int i=0; i<num.size();i++) {
		for(int j=i+1;j<num.size();j++) {
			if(num.get(i)<num.get(j)) {
				max = num.get(j);
				
			}
			else if(num.get(i)>num.get(j)){
				min = num.get(j);
				
			}
		}
	}
	System.out.println("This is maximum value: "+max);
	System.out.println("This is minimum value: "+min);
	int maximum_value = num.indexOf(max);
	int minimum_value = num.indexOf(min);
	num.remove(maximum_value);
	num.remove(minimum_value);
	//System.out.println(num.size());
	for(int k=0;k<num.size();k++) {
		System.out.println(num.get(k));
	}
 }
}
