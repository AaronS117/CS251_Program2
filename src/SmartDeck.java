public class SmartDeck {
    public static void initDeck(boolean[] deck)
    {
        // set the values of deck to indicate that they are all
        // present - not dealt yet.

        for (int i = 0; i <= 51; i++)
            deck[i] = true;
    }// end initDeck

    public static boolean emptyDeck(boolean[] deck)
    {
        // returns whether all the cards in the deck
        // have already been dealt.

        for (int i = 0; i < 51; i++)
        {
            if (deck[i] == true){
                return false;
            }
        }
        return true;
    }// end emptyDeck

    public static int dealCard(boolean[] deck)
    {
        // returns a card (an int in the range 0 to 51) at random
        // that has not been dealt since the deck was initialize
        // via in Deck. Also notes (in deck) that this card is
        // no longer available.

        int a = (int) (Math.random()*(52));
        if (deck[a] == false){
            while (deck[a] == false){
                a = (int) (Math.random()*(52));
            }
        }
        deck [a] = false;
        return a;
    }// end dealCard
    public static void printCard(int card)
    {
        // given a card (an int in the range 0 to 51) prints
        // an appropriate representation of this card based
        // on a 1-1 and onto mapping of the set [0, 51] to
        // the cards described above.

        // Prints all the Faces of the held values in intCard
        int face = card % 13;
        if (face == 0){
            char ace = 'A';
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
            char jack = (char) face;
            jack = 'J';
            System.out.print(jack);
        }
        if (face == 11){
            char queen;
            queen = 'Q';
            System.out.print(queen);
        }
        if (face == 12){
            char king = (char) face;
            king = 'K';
            System.out.print(king);
        }


        // Prints all the suits of the held values in intCard
        int suit = card / 13;
        if (suit == 0){
            char club  = (char) suit;
            club = 'C';
            System.out.print(club);
        }
        if (suit == 1){
            char diamond  = (char) suit;
            diamond = 'D';
            System.out.print(diamond);
        }
        if (suit == 2){
            char heart  = (char) suit;
            heart = 'H';
            System.out.print(heart);
        }
        if (suit == 3){
            char spade  = (char) suit;
            spade = 'S';
            System.out.print(spade);
        }
    } // end printCard
}
