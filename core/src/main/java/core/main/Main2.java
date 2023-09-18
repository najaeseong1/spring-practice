package core.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import core.chap3.Hotel;

public class Main2 {
	
	public static void main(String[] args) {

		// 빈 등록에 사용된 xml의 설정을 가져오는 객체를 생성. (classpath == src/main/resources)
		GenericXmlApplicationContext ct = 
				new GenericXmlApplicationContext("classpath:auto-config.xml");
		
		Hotel hotel1 = ct.getBean("hotel1", Hotel.class);
		hotel1.inform();

		System.out.println("=======================================");

		Hotel hotel2 = ct.getBean("hotel2", Hotel.class);
		hotel2.inform();

		
	}

}
