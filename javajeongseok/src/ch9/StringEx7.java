package ch9;

public class StringEx7 {

	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		//fullName���� '.'�� ��ġ�� ã�´�.
		int index = fullName.indexOf('.');
		
		//���ϸ� ����
		String fileName = fullName.substring(0, index);
		System.out.println(fileName);
		
		//.Ȯ���� ����
		String ext = fullName.substring(index);
		System.out.println(ext);

	}

}
