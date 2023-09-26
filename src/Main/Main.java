package main;

import controller.NormalizeText;
import model.textNormalize;

public class Main {

    public static void main(String[] args) {
        textNormalize model = new textNormalize();
        
        new NormalizeText(model).run();
    }
    
}