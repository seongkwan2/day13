package inteface;
interface Unit07{
	public void attack();
	public void defense();
}
class A07 implements Unit07{
	public void attack1() {}
	public void attack2() {}
	public void attack3() {}
	public void attack4() {}
	public void attack() {
		System.out.println("지상군이 공격합니다.");
	}
	public void defense() {
		System.out.println("지상군이 방어합니다.");
	}
}

public class MainClass07 {
	public static void main(String[] args) {
		Unit07 a = new A07();
		a.attack();
		a.defense();
	}
}
