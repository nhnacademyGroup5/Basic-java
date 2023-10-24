package com.nhnacademy.groupstudy.chapter5.yhun;

import com.nhnacademy.groupstudy.chapter5.yhun.blackjack.BlackJackTable;
import com.nhnacademy.groupstudy.chapter5.yhun.blackjack.BlackjackHand;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackJackBasicTest1 {

     public static void main(String[] args){

          try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

               String startCheck;
               BlackJackTable table = new BlackJackTable();
               BlackjackHand hand = new BlackjackHand();

               while (true){
                    System.out.print("게임 시작(y, n) : ");
                    startCheck = br.readLine();

                    if(!startCheck.equalsIgnoreCase("y")){
                         System.out.println("게임 종료");
                         break;
                    }

                    int rand = (int) (Math.random()*5) + 2;
                    try {
                         table.distributeHand(hand, rand);
                         table.playerHandPrint(hand);
                         System.out.println(hand.getBlackjackValue());
                    }catch (IndexOutOfBoundsException e){
                         System.out.println("Deck의 보유 카드 소진으로 인한 게임 종료");
                         break;
                    }

               }
          }catch (IOException ioException){
               ioException.printStackTrace();
          }
     }

}
