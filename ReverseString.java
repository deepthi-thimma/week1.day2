package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str="hello";
		char[] str_charArray=str.toCharArray();
		for(int i=str_charArray.length-1;i>=0;i--) 
			System.out.println(str_charArray[i]);

		// TODO Auto-generated method stub

	}
	
}


