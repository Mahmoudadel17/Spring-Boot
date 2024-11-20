package Mahmoud17.FirstApp.services.impl;

import Mahmoud17.FirstApp.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "Red";
    }
}
