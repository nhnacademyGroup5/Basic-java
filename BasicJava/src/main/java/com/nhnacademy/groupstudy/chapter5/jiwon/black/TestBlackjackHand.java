package com.nhnacademy.groupstudy.chapter5.jiwon.black;

public class TestBlackjackHand {

    public static void main(String[] args) {


        Deck deck;            // A deck of cards.
        Card card;            // A card dealt from the deck.
        BlackjackHand hand;   // A hand of from two to six cards.
        int cardsInHand = 6;      // Number or cards in the hand.
        boolean again;        // Set to true if user wants to continue.
        deck = new Deck();
        String continues;
        do {
            deck.shuffle();
            hand = new BlackjackHand();

            System.out.println();
            System.out.println("Hand contains:");

            for (int i = 1; i <= cardsInHand; i++) {

                card = deck.dealCard();
                hand.addCard(card);
                System.out.println(card);
                System.out.println("Value : " + hand.getBlackjackValue());

                if (hand.getBlackjackValue() == 21) {
                    System.out.println("win");
                    break;
                }

                if (hand.getBlackjackValue() > 21) {
                    System.out.println("lose");
                    break;
                }

                if (i != 1) {
                    System.out.println("Do you want to contine : yes or no");
                    continues = TextIO.getlnString();
                    if (!continues.equals("yes")) {
                        break;
                    }
                }
            }
            System.out.println("Value of hand is " + hand.getBlackjackValue());
            System.out.println();
            System.out.print("Again? ");
            again = TextIO.getlnBoolean();
        } while (again);

    }

}
