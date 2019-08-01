package src;

public class Sequence {
	
	public int loopAdd2(int count, int number) {
		int temp=0;
		for(int i=0; i<count; i++) {
			temp += number;
		}
		return temp;
	}
	
	public int loopSub2(int count, int number) {
		int temp=0;
		for(int i=0; i<count; i++) {
			temp -= number;
		}
		return temp;
	}
	
	public int loopDiv2(int count, int number) {
		int temp=0;
		for(int i=0; i<count; i++) {
			temp /= number;
		}
		return temp;
	}
	
	public int loopMul2(int count, int number) {
		int temp=0;
		for(int i=0; i<count; i++) {
			temp *= number;
		}
		return temp;
	}
}
