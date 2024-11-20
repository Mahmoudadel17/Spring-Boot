package Mahmoud17.FirstApp.services.impl;

import Mahmoud17.FirstApp.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "Blue";
    }
}
