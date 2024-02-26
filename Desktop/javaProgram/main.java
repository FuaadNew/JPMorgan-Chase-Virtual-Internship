/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author pawn
 */

import java.util.Random;

public class main {

    public static void main(String[] args) {
        if (args.length < 1 ){
            System.out.println("Please Enter how many random numbers you want to generate");
        }else{
             String numbersToGenerate = args[0];
        int loopLimit=Integer.parseInt(numbersToGenerate);  
            Random r = new Random();
        for (int i = 1; i <= loopLimit; i++) {
            int randomInt = r.nextInt(100) + 1;
            System.out.println(randomInt);
    }

        }
       
}
}


        
        
  

