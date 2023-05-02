package inteface;

abstract class A03{
	public abstract void a03(); //{}중괄호가 없음(기능x) 이름만 존재하는 추상메소드
	public void test() {
		System.out.println("test 기능 입니다.");
	}
	
}
class B03 extends A03{
	public void b03() {
		System.out.println("새로운 기능 추가");
	}
	
	@Override	//추상메소드를 오버라이딩 했음 이름만 가져온꼴
	public void a03() {
		System.out.println("새로운 내용");
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		B03 b = new B03();
		b.a03(); b.b03(); b.test();
	}
}
