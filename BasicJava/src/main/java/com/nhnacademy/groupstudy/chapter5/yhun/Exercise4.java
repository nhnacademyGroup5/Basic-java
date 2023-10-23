package com.nhnacademy.groupstudy.chapter5.yhun;

import com.nhnacademy.groupstudy.chapter5.poker.BlackjackHand;
import com.nhnacademy.groupstudy.chapter5.poker.Deck;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {

     public static void main(String[] args){

          try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

               String startCheck;
               BlackjackHand hand;
               Deck deck = new Deck();

               while (true){
                    System.out.print("게임 시작(y, n) : ");
                    startCheck = br.readLine();

                    if(!startCheck.equalsIgnoreCase("y")){
                         System.out.println("게임 종료");
                         break;
                    }

                    int rand = (int) (Math.random()*5) + 2;
                    hand = createHand(deck, rand);
                    playerHandPrint(hand);
                    System.out.println(hand.getBlackjackValue());
                    createHand(deck, 2);

               }
          }catch (IOException ioException){
               ioException.printStackTrace();
          }
     }

     public static BlackjackHand createHand(Deck deck, int createCardCount){
          if(deck == null)
               throw new NullPointerException("deck의 값이 null");
          if(createCardCount > deck.cardsLeft())
               throw new IllegalArgumentException("deck에 범위를 넘거나 더이상 남아있는 카드가 존재 하지 않음");
          if(createCardCount < 0)
               throw new IllegalArgumentException("hand로 가질수 있는 카드 개수는 최소 0 입니다.");

          BlackjackHand hand = new BlackjackHand();
          deck.shuffle();

          for(int i=0; i<createCardCount; i++){
               hand.addCard(deck.dealCard());
          }

          return hand;
     }

     public static void playerHandPrint(BlackjackHand blackjackHand){
          if(blackjackHand == null)
               throw new NullPointerException("Df");

          for(int i=0; i<blackjackHand.getCardCount(); i++){
               System.out.println(blackjackHand.getCard(i));
          }
     }

}
