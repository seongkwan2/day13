package inteface;

import java.util.ArrayList;

class A01{
	public void aa() {}
}
class B01 extends A01{
	public void aa() {}
	public void test() {}
}

public class MainClass02 {
	public static void main(String[] args) {
		
		//다운 캐스팅
		A01 a = new B01();
		B01 b = (B01)a;
		
			
		ArrayList arr = new ArrayList<>();
			//<>가 없으면 Object 타입으로 받는다.
		arr.add(111);
		arr.add("aaaa");
		arr.add(1.11);
		int num = (int)arr.get(0);//출력시 int로 받고싶으면 다운캐스팅이 필요함
		
	}
}
