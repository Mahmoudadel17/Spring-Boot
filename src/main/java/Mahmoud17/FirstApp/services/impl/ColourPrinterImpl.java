package Mahmoud17.FirstApp.services.impl;

import Mahmoud17.FirstApp.services.BluePrinter;
import Mahmoud17.FirstApp.services.ColourPrinter;
import Mahmoud17.FirstApp.services.GreenPrinter;
import Mahmoud17.FirstApp.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

   public ColourPrinterImpl(){
        this.redPrinter = new EnglishRedPrinter();
        this.bluePrinter = new EnglishBluePrinter();
        this.greenPrinter = new EnglishGreenPrinter();
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(),greenPrinter.print(),bluePrinter.print());
    }
}
