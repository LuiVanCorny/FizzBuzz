package de.gbsschulen;

public class FizzBuzz {

    public String fizzBuzz(int zahl) {
        String resultString = "";

        for(int i = 1; i <= zahl; i++){

            if(i % 3 == 0 &&i % 5 == 0 ){
                resultString += "Fizz Buzz";
            }else if(i % 3 == 0){
                resultString += "Fizz";
            }else if(i % 5 == 0){
                resultString += "Buzz";
            }else{
                resultString += zahl;
            }

            if(i != zahl){
                resultString += ", ";
            }

        }
        return resultString;
    }

}
