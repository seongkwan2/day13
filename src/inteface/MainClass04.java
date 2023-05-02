package inteface;
class A04{
	public void a04() {System.out.println("부모");}
}
class B04 extends A04 implements Interface04{
					//인터페이스를 호출하면 인터페이스안의 모든 메소드를 실체화 시켜야함
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

}
public class MainClass04 {
	public static void main(String[] args) {

	}
}
