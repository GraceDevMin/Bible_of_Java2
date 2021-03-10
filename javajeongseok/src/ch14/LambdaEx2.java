package ch14;

@FunctionalInterface
interface MyFunction3{
	void myMethod();	// public abstract void myMethod();
}

public class LambdaEx2 {

	public static void main(String[] args) {
		MyFunction3 f = () -> {}; // MyFunction3 f = (MyFunction3)(() -> {});
		Object obj = (MyFunction3)(() -> {});	// Object타입으로 형변환이 생략됨
		String str = ((Object)(MyFunction3)(() -> {})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);
		
		System.out.println((MyFunction3)(() -> {}));
		System.out.println(((Object)(MyFunction3)(() -> {})).toString());
	}

}
