package ch9;

class Point implements Cloneable{
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e){}
		
		return obj;
	}
}

public class CloneEx1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Point original = new Point(3, 5);
		Point copy = (Point) original.clone();	//汗力(clone)秦辑 货肺款 按眉甫 积己
		System.out.println(original);
		System.out.println(copy);

	}

}
