package Mahmoud17.FirstApp;

import Mahmoud17.FirstApp.services.ColourPrinter;
import Mahmoud17.FirstApp.services.impl.ColourPrinterImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class FirstAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ColourPrinter colourPrinter = new ColourPrinterImpl();
		System.out.println(colourPrinter.print());

	}
}
