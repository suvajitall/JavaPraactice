package MyPackage;

public class Reverseword {
	public static void main(String args[]) {
		String word = "Hello world";
		String[] str = word.split(" ");
		String rev_word = "";
		int len = str.length;
		for(int i=len-1;i>=0;i--) {
			rev_word+= " "+str[i];
		}
		System.out.println(rev_word);
	}
}
