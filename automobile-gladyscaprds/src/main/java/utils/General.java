package utils;

import java.util.Random;

public class General {
    Random rand = new Random();

    public String randomEmail(){
        return "cleoparta" + + rand.nextInt(1000) + "@gmail.com";
    }
}
