package Cards;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[]args) throws FileNotFoundException {
        Deck deck = new Deck();

        Card card = new Card();
        card = deck.getRandomCard();

        System.out.println(card);
    }
}
