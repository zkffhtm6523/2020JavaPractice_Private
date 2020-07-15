package practice;

public class SingleTon {
	private static SingleTon check = null;
	private SingleTon() {}
	public static SingleTon getInstance() {
		if (check == null) {
			new SingleTon();
		}
		return check;
	}
	public static void main(String[] args) {
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		System.out.println(s1 == s2);
	}
}
