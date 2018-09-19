package com.greenfoxacademy.workwithdependencies.services;

import org.springframework.stereotype.Service;

@Service
public class CaesarEncoderDecoder {

    public String caesarEncodeing(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) + number);
        }
        return result;
    }

    public String caesarDecodeing(String text, int number) {
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result += (char)((int)text.charAt(i) - number);
        }
        return result;
    }
}
