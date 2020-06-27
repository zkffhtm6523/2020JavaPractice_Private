package practice;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
	}
}
//child를 실행하면(자식) 메모리 영역에 자식부터 쌓이면서 역순으로 실행해서 내려옴
class Child extends Parents{
	public String name;
	
	public Child() {
		this("홍길동");
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
		this("대한민국");
		System.out.println("Parent() Call");
	}
	
	public Parents(String name) {
		this.name = name;
		System.out.println("Parent(String name) Call");
	}
}
