package ch9;

public class StringEx7 {

	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		//fullName에서 '.'의 위치를 찾는다.
		int index = fullName.indexOf('.');
		
		//파일명만 추출
		String fileName = fullName.substring(0, index);
		System.out.println(fileName);
		
		//.확장자 추출
		String ext = fullName.substring(index);
		System.out.println(ext);

	}

}
