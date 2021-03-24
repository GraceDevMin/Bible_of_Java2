package Ch13;

import java.util.Iterator;
import java.util.Map;

public class ThreadEx11 {
	public static void main(String[] args) {
		
	}
}

class ThreadEx11_1 extends Thread{
	ThreadEx11_1(String name){
		super(name);
	}
	
	public void run() {
		try {
			sleep(5*1000);	// 5초 동안 기다린다.
		}catch(InterruptedException e) {}
	}
}

class ThreadEx11_2 extends Thread{
	ThreadEx11_2(String name){
		super(name);
	}
	
	public void run() {
		Map map = getAllStackTraces();
		Iterator it = map.keySet().iterator();
		
		int x = 0;
		while(it.hasNext()) {
			Object obj = it.next();
			Thread t = (Thread) obj;
			
		}
	}
}


