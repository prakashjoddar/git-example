package git.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;

@SpringBootApplication
@Configuration
public class DemoApplication  implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Added by DEV - Command line runner");
		logger.info("Dev branch");

		logger.info("App started by Dev");

	}
}
