package springApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Parrot p = context.getBean(Parrot.class);
		System.out.println(p.getName());
		
		String s = context.getBean(String.class);
		System.out.println(s);
		
		Integer n = context.getBean(Integer.class);
		System.out.println(n);
	}

}
