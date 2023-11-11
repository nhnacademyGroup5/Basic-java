package com.nhnacademy.groupstudy.chapter5.yhun;

import com.nhnacademy.groupstudy.chapter5.yhun.blackjack.BlackJack;
import java.io.IOException;

public class BlackJackTest {

     public static void main(String[] args) {
          BlackJack blackJack = new BlackJack();

          do {
               char startCheck = ' ';
               System.out.print("start game (y, n) : ");
               try {
                    startCheck = Character.toUpperCase(BlackJack.br.readLine().charAt(0));
               }catch (IOException e){
                    System.out.println("IOException error");
               }

               if(startCheck != 'Y')
                    break;

               blackJack.playBlackJack();
               try {
                    blackJack.reDistributionCard();
               }catch (IndexOutOfBoundsException e){
                    blackJack.tableInit();
                    System.out.println("table의 새로운 카드 리스트로 초기화");
               }


          }while (true);

     }


}
