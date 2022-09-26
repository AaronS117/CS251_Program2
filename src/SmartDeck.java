public class SmartDeck {
    // Mandatory Instance Variables
    private boolean [] deck = new boolean[52];
    static int cardsDealt;

    public void initDeck()
    {
        // set the values of deck to indicate that they are all
        // present - not dealt yet.

        for (int i = 0; i < this.deck.length; i++)
            this.deck[i] = true;
    }// end initDeck

    public boolean emptyDeck()
    {
        // returns whether all the cards in the deck
        // have already been dealt.

        if (cardsDealt < this.deck.length)
            return false;
        else
            return true;
    }// end emptyDeck

    public int dealCard()
    {
        // returns a card (an int in the range 0 to 51) at random
        // that has not been dealt since the deck was initialized
        // via in Deck. Also notes (in deck) that this card is
        // no longer available.

        int a = (int) (Math.random()*(52));
        if (!this.deck[a]){
            while (!this.deck[a]){
                a = (int) (Math.random()*(52));
            }
        }
        this.deck [a] = false;
        cardsDealt++;
        return a;
    }// end dealCard
    public static String cardToString(int card)
    {
        // given a card (an int in the range 0 to 51) prints
        // an appropriate representation of this card based
        // on a 1-1 and onto mapping of the set [0, 51] to
        // the cards described above.

        // Prints all the Faces of the held values in intCard
        int face = card % 13;
        if (face == 0){
            String ace = "A";
            System.out.print(ace);
        }
        if (face == 1){
            int two = 2;
            System.out.print(two);
        }
        if (face == 2){
            int three = 3;
            System.out.print(three);
        }
        if (face == 3){
            int four = 4;
            System.out.print(four);
        }
        if (face == 4){
            int five = 5;
            System.out.print(five);
        }
        if (face == 5){
            int six = 6;
            System.out.print(six);
        }
        if (face == 6){
            int seven = 7;
            System.out.print(seven);
        }
        if (face == 7){
            int eight = 8;
            System.out.print(eight);
        }
        if (face == 8){
            int nine = 9;
            System.out.print(nine);
        }
        if (face == 9){
            int ten = 10;
            System.out.print(ten);
        }
        if (face == 10){
            String jack = "J";
            System.out.print(jack);
        }
        if (face == 11){
            String queen = "Q";
            System.out.print(queen);
        }
        if (face == 12){
            String king = "K";
            System.out.print(king);
        }


        // Prints all the suits of the held values in intCard
        int suit = card / 13;
        if (suit == 0){
            String club = "C";
            System.out.print(club);
        }
        if (suit == 1){
            String diamond = "D";
            System.out.print(diamond);
        }
        if (suit == 2){
            String heart = "H";
            System.out.print(heart);
        }
        if (suit == 3){
            String spade = "S";
            System.out.print(spade);
        }
        return String.valueOf(card);
    } // end printCard
}