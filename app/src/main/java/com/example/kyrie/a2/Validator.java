package com.example.kyrie.a2;

public class Validator {


    private int check = 0 ;

    public int validator(String input) {
        //1st requirement
        if (!input.equals("passward")) {
            check++;
        }

        //2nd requirement
        if (input.length() >= 8) {
            check++;

        }

        //3rd requirement
        if(!input.equals("Trump")){
            check++;
        }

        //4th requirement
        if(!(input.contains("@") | input.contains("!") | input.contains("#")){
            check++;
        }

        //5th requirement
        if(input.contains("1") | input.contains("2") | input.contains("3") |input.contains("4")
                 |input.contains("5")|input.contains("6")|input.contains("7")|input.contains("8")
                |input.contains("9")|input.contains("0")){
            check++;
        }
        return check;
    }


}
