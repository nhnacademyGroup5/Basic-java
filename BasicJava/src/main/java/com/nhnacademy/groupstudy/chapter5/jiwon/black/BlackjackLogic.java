package com.nhnacademy.groupstudy.chapter5.jiwon.black;

import java.util.Scanner;

public class BlackjackLogic {

    private Deck deck;
    private BlackjackHand dealerHand;
    private BlackjackHand userHand;

    public BlackjackLogic() {
        deck = new Deck();
        dealerHand = new BlackjackHand();
        userHand = new BlackjackHand();
        deck.shuffle();
    }

    public void blackjackGame() {

        // 카드 추가
        dealerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
        userHand.addCard(deck.dealCard());
        userHand.addCard(deck.dealCard());

        if (dealerHand.getBlackjackValue() == 21) {
            System.out.println("Dealer win");
            System.out.println("Dealer has the " + dealerHand.getCard(0)
                    + " and the " + dealerHand.getCard(1) + ".");

        } else if (userHand.getBlackjackValue() == 21) {
            System.out.println("user win");
            System.out.println("User has the " + userHand.getCard(0)
                    + " and the " + userHand.getCard(1) + ".");
            System.out.println("Dealer has the " + dealerHand.getCard(0)
                    + " and the " + dealerHand.getCard(1) + ".");
        }
    }

    public void blackjackPlay() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("user cards");
            for (int i = 0; i < userHand.getCardCount(); i++) {
                System.out.println(userHand.getCard(i));
            }
            System.out.println("Total value: " + userHand.getBlackjackValue());
            System.out.println("Dealer card is :" + userHand.getCard(0));
            System.out.println("Continues : y or n");
            String input = sc.nextLine();

            if (input.equals("y")) {
                Card newCard = deck.dealCard();
                userHand.addCard(newCard);
                System.out.println("new card is : " + newCard);
                if (userHand.getBlackjackValue() > 21) {
                    System.out.println("You busted by going over 21. You lose.");
                    System.out.println("Dealer's other card was the " + dealerHand.getCard(1));
                    break;
                }
            } else {
                System.out.println("continues : y or n");
            }
            if (input.equals("n")) {
                while (dealerHand.getBlackjackValue() <= 16) {
                    Card newCard = deck.dealCard();
                    System.out.println("Dealer hits and gets the " + newCard);
                    dealerHand.addCard(newCard);
                }
                System.out.println("Dealer's total is " + dealerHand.getBlackjackValue());

                // Determine the winner
                determineWinner();
                break;

            }

        }
    }

    private void determineWinner() {
        System.out.println("User stands.");
        System.out.println("Dealer's cards are:");
        for (int i = 0; i < dealerHand.getCardCount(); i++) {
            System.out.println("    " + dealerHand.getCard(i));
        }

        while (dealerHand.getBlackjackValue() <= 16) {
            Card newCard = deck.dealCard();
            System.out.println("Dealer hits and gets the " + newCard);
            dealerHand.addCard(newCard);
        }

        System.out.println("Dealer's total is " + dealerHand.getBlackjackValue());

        if (dealerHand.getBlackjackValue() > 21) {
            System.out.println("Dealer busted by going over 21. You win.");
        } else if (dealerHand.getBlackjackValue() > userHand.getBlackjackValue()) {
            System.out.println("Dealer wins, " + dealerHand.getBlackjackValue() + " points to " +
                    userHand.getBlackjackValue() + ".");
        } else if (dealerHand.getBlackjackValue() < userHand.getBlackjackValue()) {
            System.out.println("You win, " + userHand.getBlackjackValue() + " points to " +
                    dealerHand.getBlackjackValue() + ".");
        } else {
            System.out.println("It's a tie. Dealer wins on a tie. You lose.");
        }

    }
}
