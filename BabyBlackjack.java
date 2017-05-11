/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babyblackjack;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class BabyBlackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        
        int pCard1, pCard2, dCard1, dCard2;
        pCard1 = 1 + r.nextInt(10);
        pCard2 = 1 + r.nextInt(10);
        dCard1 = 1 + r.nextInt(10);
        dCard2 = 1 + r.nextInt(10);
        
        System.out.println("Baby blackjack\n");
        System.out.println("you drew " + pCard1 + "and " + pCard2 + "\n" + "your total is " + (pCard1 + pCard2) + "\n" + "\n");
        System.out.println("the dealer drew " + dCard1 + "and " + dCard2 + "\n" + "dealer total is " + (dCard1 + dCard2) + "\n");
        
        if ((pCard1 + pCard2) > (dCard1 + dCard2)){
        
            System.out.println("you win!");
        }else{
        
            System.out.println("the dealer wins");
        }
    }
    
}
