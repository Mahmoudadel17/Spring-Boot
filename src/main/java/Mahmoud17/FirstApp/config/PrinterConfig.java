package Mahmoud17.FirstApp.config;

import Mahmoud17.FirstApp.services.BluePrinter;
import Mahmoud17.FirstApp.services.ColourPrinter;
import Mahmoud17.FirstApp.services.GreenPrinter;
import Mahmoud17.FirstApp.services.RedPrinter;
import Mahmoud17.FirstApp.services.impl.ColourPrinterImpl;
import Mahmoud17.FirstApp.services.impl.EnglishBluePrinter;
import Mahmoud17.FirstApp.services.impl.EnglishGreenPrinter;
import Mahmoud17.FirstApp.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
    @Bean
    public BluePrinter bluePrinter(){
        return new EnglishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter,BluePrinter bluePrinter,GreenPrinter greenPrinter){
        return new ColourPrinterImpl(redPrinter,bluePrinter,greenPrinter);
    }

}
