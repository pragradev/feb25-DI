package io.pragra.learning.feb25_ioc;

import io.pragra.learning.feb25_ioc.bo.MovieBO;
import io.pragra.learning.feb25_ioc.bo.MovieService;
import io.pragra.learning.feb25_ioc.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Feb25IocApplication {

	public static void main(String[] args) {
		//Movie rrr = new Movie(1,"RRR", 2022, "Action");

		//ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		//ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.learning.feb25_ioc.config");

		ConfigurableApplicationContext context = SpringApplication.run(Feb25IocApplication.class, args);

		//Movie rrr = context.getBean("rrr",Movie.class);

		Cast cast1 = context.getBean(Cast.class);
		Cast cast2 = context.getBean(Cast.class);
		Cast cast3 = context.getBean(Cast.class);
		Cast cast4 = context.getBean(Cast.class);
		System.out.println(cast1);
		System.out.println(cast2);
		System.out.println(cast3);
		System.out.println(cast4);
		Cast cast = new Cast();
		System.out.println(cast);
		MovieService movieService = context.getBean(MovieService.class);
		System.out.println(movieService);
		//movieBO.populateRatingAndInsertMovie(rrr);


//		System.out.println(movie);
		//BMW m3 = new BMW(new PetrolEngine(400));
		//System.out.println(m3);

	}

}
