package com.nhnacademy.groupstudy.chapter5.yhun.blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BlackJack {
     private final BlackJackTable table;
     private BlackjackHand dealer;
     private BlackjackHand player;
     private int unitCount;

     public BlackJack(){
          table = new BlackJackTable();
          dealer = new BlackjackHand();
          player = new BlackjackHand();
          cardInit();
     }
     public BlackJack(int unitCount){
          this();
          this.unitCount = unitCount;
     }

     public void clear(){
          table.deckInitialization();
          player.clear();
          dealer.clear();
     }

     public void cardInit(){
          table.distributeHand(player, 2);
          table.distributeHand(dealer, 2);
     }

     public boolean winCondition(BlackjackHand hand){
          return hand.getBlackjackValue() == 21;
     }

     public String br() throws IOException{
          try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
               return br.readLine();
          }
     }

     public void winPrint(BlackjackHand dealer, BlackjackHand player){
          System.out.println("Dealer has the " + dealer.getCard(0)
                  + " and the " + dealer.getCard(1) + ".");
          System.out.println("User has the " + player.getCard(0)
                  + " and the " + player.getCard(1) + ".");
          System.out.println();
     }

     public void playBlackJack(){
          if (winCondition(dealer)) {
               winPrint(dealer, player);
               System.out.println("Dealer has Blackjack.  Dealer wins.");
               return;
          }

          if (winCondition(player)) {
               winPrint(dealer, player);
               System.out.println("You have Blackjack.  You win.");
               return ;
          }

          while (true) {

               /* Display user's cards, and let user decide to Hit or Stand. */

               System.out.println();
               System.out.println();
               System.out.println("Your cards are:");
               table.playerHandPrint(player);
               System.out.println("Your total is " + player.getBlackjackValue());
               System.out.println();
               System.out.println("Dealer is showing the " + dealer.getCard(0));
               System.out.println();
               System.out.print("Hit (H) or Stand (S)? ");
               char userAction = 'S';  // User's response, 'H' or 'S'.

               do {
                    try {
                         userAction = Character.toUpperCase(br().charAt(0));
                    }catch (IOException e){
                         e.getMessage();
                    }

                    if (userAction != 'H' && userAction != 'S')
                         System.out.print("Please respond H or S:  ");
               } while (userAction != 'H' && userAction != 'S');

           /* If the user Hits, the user gets a card.  If the user Stands,
              the loop ends (and it's the dealer's turn to draw cards).
           */

               if ( userAction == 'S' ) {
                    // Loop ends; user is done taking cards.
                    break;
               }
               else {  // userAction is 'H'.  Give the user a card.
                    // If the user goes over 21, the user loses.
                    table.distributeHand(player, 1);
                    table.playerHandPrint(player);
                    System.out.println();
                    System.out.println("User hits.");
                    System.out.println("Your card is the " + player.getCard(2));
                    System.out.println("Your total is now " + player.getBlackjackValue());
                    if (player.getBlackjackValue() > 21) {
                         System.out.println();
                         System.out.println("You busted by going over 21.  You lose.");
                         System.out.println("Dealer's other card was the "
                                 + dealer.getCard(1));
                         return;
                    }
               }
          }



     }

}
