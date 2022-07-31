package week1.day2;

public class FindMinMax {

	public static void main(String[] args) {
		int max=0;
		int min=0;
		int my_arr[]= {10,986,2443,12,122,5};
		for(int i=0;i<my_arr.length;i++) {
			if(my_arr[i]>max) {
				max=my_arr[i];
			}
			if(my_arr[i]<max) {
				min=my_arr[i];
			}
			
		}
		System.out.println("The maximum value is "+max);
		System.out.println("The minimum value is "+min);
		// TODO Auto-generated method stub

	}

}
