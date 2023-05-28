package class25.Homework;

import java.util.LinkedList;

/*
Create a Card class that will have interest rate field and card type
and a constructor that will initialize the fields.
Create 3 objects of different card and store them into LinkedList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */
public class Card {

        private double interestRate;
        private String cardType;

        public Card(double interestRate, String cardType) {
            this.interestRate = interestRate;
            this.cardType = cardType;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public String getCardType() {
            return cardType;
        }
    }

    class CardTester {

        public static void main(String[] args) {
            LinkedList<Card> cards = new LinkedList<>();

            cards.add(new Card(0.15, "Visa"));
            cards.add(new Card(0.12, "Mastercard"));
            cards.add(new Card(0.18, "American Express"));

            System.out.println("Using an advanced for loop:");
            for (Card card : cards) {
                System.out.println("Card Type: " + card.getCardType());
                System.out.println("Interest Rate: " + card.getInterestRate());
                System.out.println();
            }

        }
    }



