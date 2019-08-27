package com.company;

public class Main {

    double [] temp = {10 ,11,12,12,15,12,5.0 , 7.1,8.2 };

    double [] speed = {7.85 ,11.2,12.1,12.7,15,12.9,5.0 ,7.1,8.2 };


    public static double search(double [] speed) {

        int size = speed.length;
        double min = speed[0];

        for ( int i=1 ; i< size ; i++) {

            if ( speed[i]< min) {

                min = speed[i] ;

            }

        }
        return min ;
    }



    public static double calculateAverage(double [] temp) {

      int size =temp.length ;
      double total =0 ;
      for (int i= 0 ; i<size ;i++){

         total += temp[i] ;

      }

         double average = total / size ;
         return average ;
    }



    public static int rollDice(){
        double randomNumber = Math.random() ;

        randomNumber = (randomNumber * 6) ;
        randomNumber = randomNumber + 1 ;

        int randomInt = (int)randomNumber ;

        return randomInt ;
    }


    public static int keepRolling() {


        int dice1 = rollDice() ;
        int dice2 = rollDice();


        int count = 1;
        int x =3 ;

        while(!(dice1==dice2)){


            dice1= rollDice();
            dice2 =rollDice();
            if(dice2 == x)
                break ; System.out.println("you catch number 3 and you lost sorry!!");
            count = count + 1;

        }
         return count ;
    }



    public static void main(String[] args) {

        System.out.println(keepRolling());


        //System.out.println("search = " + search(double [] speed));


        String [] newsOutlet = {"CNN", "BBC" , "ATV", "NTV", "CNNTURK", "KANALD", "FOX", "NTVSPOR", "DIGITURK" };

        double lucky = Math.random() * 10;
        int luckyIndex =(int) lucky ;

        System.out.println("lucky index: " + luckyIndex + " " + newsOutlet [luckyIndex]);


    }

}



