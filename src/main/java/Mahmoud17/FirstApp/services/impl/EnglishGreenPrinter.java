package Mahmoud17.FirstApp.services.impl;

import Mahmoud17.FirstApp.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "Green";
    }
}
