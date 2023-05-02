package overriding;


final class A04{//final을 사용하면 상속불가
	public void test() {
		System.out.println("부모 메소드");
	}
}


class B04 {
	A04 a = new A04();	//상속이 아닌 객체를 생성해서 그대로 사용
	public void test() {
		a.test();
		System.out.println("자식 메소드");
	}
}


public class MainClass04 {
	public static void main(String[] args) {
		B04 b = new B04();
		b.test();
	}
}
