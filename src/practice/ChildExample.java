package practice;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
	}
}
//child�� �����ϸ�(�ڽ�) �޸� ������ �ڽĺ��� ���̸鼭 �������� �����ؼ� ������
class Child extends Parents{
	public String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() Call");
	}
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) calls");
	}
}
class Parents{
	public String name;
	
	public Parents() {
		this("���ѹα�");
		System.out.println("Parent() Call");
	}
	
	public Parents(String name) {
		this.name = name;
		System.out.println("Parent(String name) Call");
	}
}
