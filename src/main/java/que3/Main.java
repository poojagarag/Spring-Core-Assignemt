package que3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("map.xml");
		Question q=(Question) context.getBean("ans2");
		q.display();
	}

}
