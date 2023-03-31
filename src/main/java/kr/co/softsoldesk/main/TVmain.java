package kr.co.softsoldesk.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.softsoldesk.beans.HelloWorld;
import kr.co.softsoldesk.beans.SamsumgTV;
import kr.co.softsoldesk.beans.SoldeskTV;
import kr.co.softsoldesk.beans.TV;

public class TVmain {
	

	public static void main(String[] args) {
		
		
		/*
		 * ClassPathXmlApplicationContext ctx = new
		 * ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		 * 
		 * TV Soldesk = (TV) ctx.getBean("soldesk"); TV Samsung = (TV)
		 * ctx.getBean("samsung");
		 * 
		 * System.out.println("===Soldesk==="); control(Soldesk);
		 * 
		 * System.out.println("===Samsung==="); control(Samsung);
		 * 
		 * ctx.close();
		 */
		// Spring 컨테이너 구동
		/* AbstractApplicationContext : BeanFactory  + ApplicationContext 
		 * 
		 * GenericXmlApplicationContext : 파일과 클래스 관리 설정 (xml)
		 * 
		 * 
		 * */
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		
		// 컨테이너로부터 필요한 객체를 요청
		TV Samsung = (TV) ctx.getBean("samsung");
		Samsung.powerOn();
		
	}
	
	public static void control(TV v) {
		v.volumeUp();
		v.powerOn(); 
		v.volumeDown();
		v.powerOff();	 
	}
	
}
