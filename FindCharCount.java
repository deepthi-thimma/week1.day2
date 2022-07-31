package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		String str="cognizant";
		char ch='o';
		int count=0;
		char[] str_arr=str.toCharArray();
		for(int i=0;i<str_arr.length;i++) {
			if(str_arr[i]==ch) {
				count+=1;
			}
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
