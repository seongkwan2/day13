package overriding;

import java.util.ArrayList;

class A03{}
class B03 extends A03{}
class C03{
	int age;
	String name;
	
	@Override
	public String toString() {	//toString으로 오버라이딩해서 주소가아닌 문자열로 호출
		return "[" +age+"," +name+ "]";
	}
	
}
public class MainClass03 {
	public static void main(String[] args) {
		Object b = new B03();
		Object num = "aaa";
		Object num1 = 111;
		Object num2 = 111.111;
		ArrayList<String> arr = new ArrayList<>();
		arr.add("aaa");
		arr.add("bbb");
		
		C03 c = new C03();
		c.age = 20; c.name="홍길동";
		
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println(arr);
		System.out.println(arr.toString());
		
	}
}
