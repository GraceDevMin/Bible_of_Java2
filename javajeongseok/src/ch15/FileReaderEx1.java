package ch15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) {
		try {
			String fileName = "test.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
			//fileInputStream�� �̿��ؼ� ���ϳ����� �о� ȭ�鿡 ����Ѵ�.
			while((data = fis.read()) != -1) {
				System.out.println((char)data);
			}
			System.out.println();
			fis.close();
			
			// FileReader�� �̿��ؼ� ���� ������ �о� ȭ�鿡 ����Ѵ�.
			while((data = fr.read()) != -1) {
				System.out.println((char)data);
			}
			System.out.println();
			fr.close();
		}catch(IOException e) {
			
		}
	}

}
