package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			for(int i='1'; i<='9'; i++) {
				bos.write(i);
			}
			
			bos.close();	//flush()를 호출한 다음 기반스트림의 close()를 호출한다.
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
