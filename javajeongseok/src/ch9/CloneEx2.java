package ch9;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		
		//상동한 코드
		//System.arraycopy(arr, 0, arrClone, 0, arr.length);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		System.out.println(Arrays.toString(arr));
	}

}
