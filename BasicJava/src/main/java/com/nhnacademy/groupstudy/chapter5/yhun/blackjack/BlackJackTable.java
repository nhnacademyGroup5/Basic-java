package com.nhnacademy.groupstudy.chapter5.yhun.blackjack;


/**
 * exception error 명칭을 제대로 파악 하지 못해 명확한 exception을 잡지 못햇습니다.
 * exception에 대해 comment 남겨주시면 수정할 수 있도록 하겟습니다.
 * */

public class BlackJackTable {
     private Deck deck;

     public BlackJackTable(){
          deckInitialization();
     }

     public void deckInitialization(){
          deck = new Deck();
          deck.shuffle();
     }

     public  void distributeHand(BlackjackHand hand, int createCardCount){
          if(createCardCount > deck.cardsLeft())
               throw new IndexOutOfBoundsException("deck에 범위를 넘거나 더이상 남아있는 카드가 존재 하지 않음");
          if(createCardCount < 1)
               throw new IllegalArgumentException("hand로 가질수 있는 카드 개수는 최소 1개 입니다.");

          for(int i=0; i<createCardCount; i++){
               hand.addCard(deck.dealCard());
          }
     }


     public  void playerHandPrint(BlackjackHand blackjackHand){
          if(blackjackHand == null)
               throw new NullPointerException("null");

          for(int i=0; i<blackjackHand.getCardCount(); i++){
               System.out.println(blackjackHand.getCard(i));
          }
     }

}
