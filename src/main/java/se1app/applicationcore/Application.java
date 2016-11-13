package se1app.applicationcore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import se1app.applicationcore.repos.CustomerRepository;
import se1app.applicationcore.util.EmailType;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    @Bean
    CommandLineRunner init(CustomerRepository customerRepository) {
        return (evt) -> Arrays.asList(
                "mueller,meier,schulze".split(","))
                .forEach(
                        a -> {
                            customerRepository.save(new Customer(a, new EmailType(a + "@haw-hamburg.de")));
                        });
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
