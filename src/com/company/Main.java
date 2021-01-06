package com.company;

public class Main {

    public static void main(String[] args) {

        int temperature = 5;
        int  personsEge = 20;
        boolean isSnow = false;

        if (temperature < 10 && personsEge < 25){
            System.out.println("идем гулять");
        }
        if (temperature < 10 && personsEge < 15){
            System.out.println("идем гулять");
        }
        if (temperature > 25 && personsEge < 50){
            System.out.println("идем гулять");
        }

        
    }
}
