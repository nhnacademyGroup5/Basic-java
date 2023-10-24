package com.nhnacademy.groupstudy.chapter5.jinwoo.blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Blackjack {
    private boolean winOrNot;
    private final Deck deck = new Deck(false);
    private final BlackjackHand user = new BlackjackHand();
    private final BlackjackHand dealer = new BlackjackHand();
    public void result(){
        System.out.println("---------------------------");
        System.out.println("User's value : " + user.getBlackjackValue());
        System.out.println("Dealer's value : " + dealer.getBlackjackValue());
        System.out.println(winOrNot ? "User Win!" : "Dealer Win!");
    }
    public void play() {
        deck.shuffle();
        init();
        if (blackJack(dealer)) {
            winOrNot = false;
        }
        else if (!blackJack(dealer) && blackJack(user)) {
            winOrNot = true;
        } else {
            String order = hitOrStand();
            while (order.equals("h")) {
                if (user.getBlackjackValue() > 21) {
                    winOrNot = false;
                } else{
                    order = hitOrStand();
                }
            }
            if (dealer.getBlackjackValue() <= 16) {
                dealer.addCard(deck.dealCard());
            }
            winOrNot = 21 - user.getBlackjackValue() < 21 - dealer.getBlackjackValue();
        }
    }

    public void init(){
        IntStream.rangeClosed(1, 2)
                .forEach(index -> {
                    userPickCard();
                    dealer.addCard(deck.dealCard());
                });
        System.out.println("User's current value : " + user.getBlackjackValue());
        System.out.println("Dealer's open card : " + dealer.getCard(0));

    }

    public void userPickCard(){
        Card pick = deck.dealCard();
        user.addCard(pick);
        System.out.println(pick);
    }

    public boolean blackJack(BlackjackHand user){
       return user.getBlackjackValue() == 21;
    }

    public String hitOrStand() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Hit or Stand ? press h (hit) or s (stand)");
            switch (br.readLine()) {
                case "h":
                    userPickCard();
                    return "h";
                case "s":
                    return "s";
                default:
                    System.out.println("Re-order correctly");
                    return hitOrStand();
            }
        } catch (IOException e) {
            e.getStackTrace();
            return null;
        }
    }
}
