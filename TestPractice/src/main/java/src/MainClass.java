package src;

public class MainClass {

	public static void main(String[] args) {
		Sequence se = new Sequence();
		
		System.out.println(se.loopAdd2(10,1));
		System.out.println(se.loopSub2(10,1));
		System.out.println(se.loopDiv2(10,2));
		System.out.println(se.loopMul2(10,2));
	}
}
