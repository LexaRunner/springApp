package springApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Parrot p = context.getBean(Parrot.class);
		System.out.println(p);
		System.out.println(p.getName());
	}

}
