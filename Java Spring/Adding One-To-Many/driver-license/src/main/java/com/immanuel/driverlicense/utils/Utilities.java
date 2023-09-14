package com.immanuel.driverlicense.utils;

import java.util.Random;

public class Utilities {

    public Utilities(){}
    
    public String generateRandomMix() {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
    
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
    
        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            result.append(randomChar);
        }
    
        return result.toString();
    }

    public String randomString() {
        String randomMix = generateRandomMix();
        return randomMix;
    }
}