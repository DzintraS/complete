package hello;

import hello.model.Customer;
import hello.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		//TODO: Don't forget about tests
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			repository.save(new Customer("Jack", "Bauer", 6));
			repository.save(new Customer("Chloe", "O'Brian", 18));
			repository.save(new Customer("Kim", "Bauer",9));
			repository.save(new Customer("David", "Palmer", 55));
			repository.save(new Customer("Michele", "Dessler",60));

			repository.findAll().forEach(c -> {
				log.info("Customer: {}", c);
			});
		};
	}

}
