package ch9;

public class StringEx3 {

	public static void main(String[] args) {
		//길이가 0인 char배열을 생성
		char[] cArr = new char[0];	// char[] cArr = {};과 같다.
		String s = new String(cArr);	// String s = new String("");과 같다.
		
		System.out.println("cArr.length="+cArr.length);
		System.out.println("@@@"+s+"@@@");

	}

}
