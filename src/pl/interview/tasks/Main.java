package pl.interview.tasks;

public class Main {

    /**
     Created by xciechan
     on 2022-05-07

     The application finds the sum of all the multiples of 3 and 5 below 1000
     */

    public static void main(String[] args) {
        int rangeNumber = 1000;
        System.out.println(sumOfAllMultiples3And5(rangeNumber));
    }

    public static int sumOfAllMultiples3And5 (int rangeNumber){
        int sumOfAllMultiples3And5 = 0;

        for (int i=0; i<rangeNumber; i++){
            if ( (i % 3 == 0) && (i % 5 == 0) ){
                sumOfAllMultiples3And5 += i;
            } else if (i % 3 == 0){
                sumOfAllMultiples3And5 += i;
            } else if (i % 5 == 0){
                sumOfAllMultiples3And5 += i;
            }
        }

        return sumOfAllMultiples3And5;
    }

}
