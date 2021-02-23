package org.my;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.my.config.AppConfig;
import org.my.model.User;


public class StartupRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user.name);
	}
}
