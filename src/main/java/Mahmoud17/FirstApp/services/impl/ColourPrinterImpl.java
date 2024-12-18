package Mahmoud17.FirstApp.services.impl;

import Mahmoud17.FirstApp.services.BluePrinter;
import Mahmoud17.FirstApp.services.ColourPrinter;
import Mahmoud17.FirstApp.services.GreenPrinter;
import Mahmoud17.FirstApp.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

   public ColourPrinterImpl(RedPrinter redPrinter,BluePrinter bluePrinter,GreenPrinter greenPrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(),greenPrinter.print(),bluePrinter.print());
    }
}
