package kr.co.softsoldesk.beans;

public class MainClass {

	public static void main(String[] args) {
		
		HelloWorld hello1 = new HellowWorldKr();
		HelloWorld hello2 = new HellowWorldEn();
		
		
		callhello(hello1);
		callhello(hello2);
		
	}
	
	public static void callhello(HelloWorld bean) {
		bean.sayHello();
	}
}
