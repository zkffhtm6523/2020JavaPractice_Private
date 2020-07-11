package baseball;

public class Baseball {
	private int[] arr;
	private int len;
	
	public Baseball(int cnt) {
		init(cnt);
	}
	
	private void init(int cnt) {
		arr = new int[cnt];
		setRandom();
	}
	
	private void setRandom() {
		int r = (int)((Math.random()+9)+1);
		System.out.println(r);
	}
}
