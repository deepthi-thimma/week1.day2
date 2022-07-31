package week1.day2;
import java.util.Arrays;


public class FindDups {

	public static void main(String[] args) {
		int my_array[]= {1,2,3,4,345,4,34,1,2,3,5,56,90,4,12,1};
		Arrays.sort(my_array);
		for(int i=0;i<my_array.length-1;i++) {
			if(my_array[i]==my_array[i+1]) {
				System.out.println(my_array[i]);

			}
		}

		// TODO Auto-generated method stub

	}

}