package com.example.kyrie.a2;

public class Validator {


    private int check = 0 ;

    public int validator(String input) {

        if (!input.equals("passward")) {
            check++;
        }

        if (input.length() >= 8) {
            check++;

        }

        return check;
    }


}
