package inteface;
/*
 up casting()
 int num = (int)1.11;
 - 부모 형태로 변환하는 것
 - 코드를 간결하게 줄일 수 있다.

 down casting
 - 부모 -> 자기자신으로 형 변환 하는 것
 */
class Parents{
	public void familyName() {
		System.out.print("이 ");
	}
	public void name() {
		familyName();
		System.out.println("순신");
	}
}
class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println("국주");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println("기광");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		Parents par = new Parents();
		
		//업캐스팅
		par.name();
		par = new Daughter();
		par.name();
		par = new Son();
		par.name();
		
		/*
		Parents par = new Parents();
		par.name();
		
		Daughter dau = new Daughter();
		dau.name();
		
		Son son = new Son();
		son.name();
		*/
	}
}












